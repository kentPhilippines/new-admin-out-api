package com.admin.out.api.newadminoutapi.server;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;


/**
 * 通用工具類 簡單數據源獲取數據  這裏不做封裝 只用來對比用戶  登錄是否正確
 */
public class LoginServer {
  void login(String username, String password) throws SQLException {
      Entity entity = Db.use().get("sys_user", "login_name", username);
      /**
       * 1, 驗證用戶是否存在
       * 2, 如果存在進行google 驗證碼和 登錄密碼的比對
       * 3, 響應用戶實體
       */

  }




}
