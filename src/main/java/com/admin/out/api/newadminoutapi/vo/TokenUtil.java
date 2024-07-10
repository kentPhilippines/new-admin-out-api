package com.admin.out.api.newadminoutapi.vo;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Slf4j
public class TokenUtil {
    public static final String HEADER = "Auth-Orization";
    public static final String HEADER_UUID = "uuid";
    /**
     * token 驗證的計算方式
     * 計算規則為：        隨機唯一數 + 請求url + 當前請求時間的分鐘單位
     * @return
     */
    static String tokenPassword(String userId, String url) {
        String minute = DateUtil.format(new Date(), DatePattern.NORM_DATETIME_MINUTE_PATTERN);
        String s = MD5.md5(userId + url);
        String salt = HashKit.salt(s);
        String token = HashKit.salt(minute + salt);
        return token;
    }
    /**
     *  驗證當前請求是否合法
     * @param request
     * @return
     */
    public static boolean verificationToken(HttpServletRequest request)   {
        String apiToken = request.getHeader(TokenUtil.HEADER);
        String apiUUUID = request.getHeader(TokenUtil.HEADER_UUID);
        String servletPath = request.getServletPath();
        String token = tokenPassword(apiUUUID, servletPath);
        if(token.equalsIgnoreCase(apiToken)){
            return true;
        }
        return false;
    }

}
