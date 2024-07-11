package com.admin.out.api.newadminoutapi.vo.google;

import cn.hutool.core.codec.Base32;
import cn.hutool.core.util.HexUtil;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class GoogleAuthenticator {

    static int window_size = 3; // default 3 - max 17 (from google docs)最多可偏移的时间

    public static String getRandomSecretKey() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[20];
        random.nextBytes(bytes);
        Base32 base32 = new Base32();
        String secretKey = base32.encode(bytes);
        return secretKey.toUpperCase(); // .replaceAll("(.{4})(?=.{4})", "$1 ");
    }

    public static String getTOTPCode(String secretKey) {
        String normalizedBase32Key = secretKey.replace(" ", "").toUpperCase();
        Base32 base32 = new Base32();
        byte[] bytes = base32.decode(normalizedBase32Key);
        String hexKey = HexUtil.encodeHexStr(bytes);
        long time = (System.currentTimeMillis() / 1000) / 30;
        String hexTime = Long.toHexString(time);
        return TOTP.generateTOTP(hexKey, hexTime, "6");
    }

    /**
     * 根据user和secret生成二维码URL
     *
     * @param user
     * @param host
     * @param secret
     * @return
     */
    public static String getQRBarcodeURL(String user, String host, String secret) {
        String format = "http://chart.apis.google.com/chart?chs=200x200&chld=M%%7C0&cht=qr&chl=otpauth://totp/%s@%s?secret=%s";
        return String.format(format, user, host, secret);
    }

    /**
     * 这个format不可以修改，身份验证器无法识别二维码
     *
     * @param user
     * @param secret
     * @return
     */
    public static String getQRBarcode(String user, String secret) {
        String format = "otpauth://totp/%s?secret=%s";
        return String.format(format, user, secret);
    }

    /**
     * @param s window size - must be >=1 and <=17. Other values are ignored
     */
    public static void setWindowSize(int s) {
        if (s >= 1 && s <= 17)
            window_size = s;
    }

    /**
     * @param secret   The users secret.
     * @param code     The code displayed on the users device
     * @param timeMsec The time in msec (System.currentTimeMillis() for example)
     * @return
     */
    public static boolean check_code(String secret, String code, long timeMsec) {
        Base32 codec = new Base32();
        byte[] decodedKey = codec.decode(secret);
        // convert unix msec time into a 30 second "window"
        // this is per the TOTP spec (see the RFC for details)
        long t = (timeMsec / 1000L) / 30L;
        // Window is used to check codes generated in the near past.
        // You can use this value to tune how far you're willing to go.
        for (int i = -window_size; i <= window_size; ++i) {
            long hash;
            try {
                hash = verify_code(decodedKey, t + i);
            } catch (Exception e) {
                // Yes, this is bad form - but
                // the exceptions thrown would be rare and a static
                // configuration problem
                e.printStackTrace();
                throw new RuntimeException(e.getMessage());
            }
            if (code.equals(addZero(hash))) {
                return true;
            }
        }
        // The validation code is invalid.
        return false;
    }

    private static int verify_code(byte[] key, long t) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] data = new byte[8];
        long value = t;
        for (int i = 8; i-- > 0; value >>>= 8) {
            data[i] = (byte) value;
        }
        SecretKeySpec signKey = new SecretKeySpec(key, "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(signKey);
        byte[] hash = mac.doFinal(data);
        int offset = hash[20 - 1] & 0xF;
        // We're using a long because Java hasn't got unsigned int.
        long truncatedHash = 0;
        for (int i = 0; i < 4; ++i) {
            truncatedHash <<= 8;
            // We are dealing with signed bytes:
            // we just keep the first byte.
            truncatedHash |= (hash[offset + i] & 0xFF);
        }
        truncatedHash &= 0x7FFFFFFF;
        truncatedHash %= 1000000;
        return (int) truncatedHash;
    }

    private static String addZero(long code) {
        return String.format("%06d", code);
    }

}
