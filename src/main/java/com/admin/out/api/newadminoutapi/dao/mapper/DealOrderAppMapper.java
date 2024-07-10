package com.admin.out.api.newadminoutapi.dao.mapper;

import com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

/**
* @author 1
* @description 针对表【alipay_deal_order_app(商户订单登记表)】的数据库操作Mapper
* @createDate 2024-07-11 03:39:18
* @Entity com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp
*/
@Mapper
public interface DealOrderAppMapper extends BaseMapper<DealOrderApp> {

}




