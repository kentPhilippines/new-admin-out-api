package com.admin.out.api.newadminoutapi.dao.mapper;

import com.admin.out.api.newadminoutapi.dao.domain.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 1
* @description 针对表【alipay_user_info(用户详情表)】的数据库操作Mapper
* @createDate 2024-07-11 01:40:25
* @Entity com.admin.out.api.newadminoutapi.dao.domain.UserInfo
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




