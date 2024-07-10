package com.admin.out.api.newadminoutapi.dao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.admin.out.api.newadminoutapi.dao.domain.UserInfo;
import com.admin.out.api.newadminoutapi.dao.service.UserInfoService;
import com.admin.out.api.newadminoutapi.dao.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author 1
* @description 针对表【alipay_user_info(用户详情表)】的数据库操作Service实现
* @createDate 2024-07-11 01:40:25
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




