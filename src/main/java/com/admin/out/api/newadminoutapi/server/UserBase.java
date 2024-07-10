package com.admin.out.api.newadminoutapi.server;

import cn.hutool.core.util.StrUtil;
import com.admin.out.api.newadminoutapi.config.BusinessException;
import com.admin.out.api.newadminoutapi.dao.domain.UserFund;
import com.admin.out.api.newadminoutapi.dao.domain.UserInfo;
import com.admin.out.api.newadminoutapi.dao.service.UserFundService;
import com.admin.out.api.newadminoutapi.dao.service.UserInfoService;
import com.admin.out.api.newadminoutapi.vo.CodeInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserBase {
    private final UserInfoService userInfoService;
    private final UserFundService userFundService;
   private  UserFund queryOne(String userId ){
       if(StrUtil.isEmpty(userId)){
           throw BusinessException.buildException(CodeInfo.STATUS_CODE_500, "參數錯誤");
       }
       UserInfo one = userInfoService.lambdaQuery().eq(UserInfo::getUserId, userId).one();
       if(one == null){
           throw BusinessException.buildException(CodeInfo.STATUS_CODE_500, "用戶不存在");
       }
       UserFund one1 = userFundService.lambdaQuery().eq(UserFund::getUserId, userId).one();
       if(one1 == null){
           throw BusinessException.buildException(CodeInfo.STATUS_CODE_500, "用戶不存在");
       }
       return one1;
   }







}
