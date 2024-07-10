package com.admin.out.api.newadminoutapi.server;

import cn.hutool.core.util.ObjUtil;
import com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp;
import com.admin.out.api.newadminoutapi.dao.domain.RunOrder;
import com.admin.out.api.newadminoutapi.dao.domain.Withdraw;
import com.admin.out.api.newadminoutapi.dao.service.DealOrderAppService;
import com.admin.out.api.newadminoutapi.dao.service.RunOrderService;
import com.admin.out.api.newadminoutapi.vo.bean.RunBean;
import com.admin.out.api.newadminoutapi.vo.page.BasePage;
import com.admin.out.api.newadminoutapi.vo.page.ReqPage;
import com.admin.out.api.newadminoutapi.vo.page.ResPage;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RunOrderBase extends BaseServer {
    private final RunOrderService runOrderService;
    public ResPage<RunOrder> queryPage(ReqPage<RunOrder> vo){
        var data = vo.getData();
        Page<RunOrder> page = runOrderService.page(vo.getPage(), new LambdaQueryWrapper<RunOrder>()
                .eq(!ObjectUtils.isEmpty(data.getId()), RunOrder::getId, data.getId())
                .eq(!ObjectUtils.isEmpty(data.getAssociatedId()), RunOrder::getAssociatedId, data.getAssociatedId())
                .eq(!ObjectUtils.isEmpty(data.getAmountType()), RunOrder::getAmountType, data.getAmountType())
                .eq(!ObjectUtils.isEmpty(data.getRunType()), RunOrder::getRunType, data.getRunType())
                .eq(!ObjectUtils.isEmpty(data.getRunOrderType()), RunOrder::getRunOrderType, data.getRunOrderType())
                .eq(!ObjectUtils.isEmpty(data.getOrderAccount()), RunOrder::getOrderAccount, data.getOrderAccount())
                .eq(!ObjectUtils.isEmpty(data.getOrderId()), RunOrder::getOrderId, data.getOrderId())
                .ge(ObjUtil.isNotEmpty(vo.getParams().get("beginTime")), RunOrder::getCreateTime, vo.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(vo.getParams().get("endTime")), RunOrder::getCreateTime, vo.getParams().get("endTime"))
                .orderByDesc(RunOrder::getCreateTime)
        );
        return page(page,vo);
    }
    public List<RunOrder> queryList(RunBean data){
        List<RunOrder> list = runOrderService.lambdaQuery()
                .eq(!ObjectUtils.isEmpty(data.getId()), RunOrder::getId, data.getId())
                .eq(!ObjectUtils.isEmpty(data.getAssociatedId()), RunOrder::getAssociatedId, data.getAssociatedId())
                .eq(!ObjectUtils.isEmpty(data.getAmountType()), RunOrder::getAmountType, data.getAmountType())
                .eq(!ObjectUtils.isEmpty(data.getRunType()), RunOrder::getRunType, data.getRunType())
                .eq(!ObjectUtils.isEmpty(data.getRunOrderType()), RunOrder::getRunOrderType, data.getRunOrderType())
                .eq(!ObjectUtils.isEmpty(data.getOrderAccount()), RunOrder::getOrderAccount, data.getOrderAccount())
                .eq(!ObjectUtils.isEmpty(data.getOrderId()), RunOrder::getOrderId, data.getOrderId())
                .ge(ObjUtil.isNotEmpty(data.getParams().get("beginTime")), RunOrder::getCreateTime, data.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(data.getParams().get("endTime")), RunOrder::getCreateTime, data.getParams().get("endTime"))
                .orderByDesc(RunOrder::getCreateTime).list();
        return list;
    }
}
