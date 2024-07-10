package com.admin.out.api.newadminoutapi.vo;

import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashKit {
	private static final String UTF_8 = "utf-8";
	private static final String ENCODE_TYPE = "md5";
	static Logger log = LoggerFactory.getLogger(HashKit.class);
	public static  String salt(@NonNull String username   ) {
		return  forE(number(username), username  );
	}
	static int number(String c) {
		char[] charArray = c.toCharArray();
		char a = charArray[0];
		char d = charArray[charArray.length - 1];
		int o = a - d;
		int p = (o < 0) ? -o : o;
		boolean flag = true;
		if (p > 15) {
			while (flag) {
				p -= 2;
				if (p < 15) {
					flag = false;
				}
			}
		}
		return p;
	}
	/**
	 * <p>生成秘钥</p>
	 * @param c			加密次数
	 * @param a			加密值
	 * @return
	 */
	 static String forE(int c , String a  ) {
         c--;
         String createPassword = MD5.md5(a );
         if (c <= 0) {
             return createPassword;
         }
         return forE(c, createPassword );
     }

}
