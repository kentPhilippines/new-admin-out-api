package com.admin.out.api.newadminoutapi.server;

import cn.hutool.core.util.ObjUtil;
import com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp;
import com.admin.out.api.newadminoutapi.dao.domain.RunOrder;
import com.admin.out.api.newadminoutapi.dao.service.DealOrderAppService;
import com.admin.out.api.newadminoutapi.vo.bean.DealOrderBean;
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
public class DealOrderAppBase extends BaseServer{
    private final DealOrderAppService dealOrderAppService;
    public ResPage<DealOrderApp> queryPage(ReqPage<DealOrderApp> vo){
        var data = vo.getData();
        Page<DealOrderApp> page = dealOrderAppService.page(vo.getPage(), new LambdaQueryWrapper<DealOrderApp>()
                .eq(!ObjectUtils.isEmpty(data.getId()), DealOrderApp::getId, data.getId())
                .eq(!ObjectUtils.isEmpty(data.getAppOrderId()), DealOrderApp::getAppOrderId, data.getAppOrderId())
                .eq(!ObjectUtils.isEmpty(data.getOrderAccount()), DealOrderApp::getOrderAccount, data.getOrderAccount())
                .eq(!ObjectUtils.isEmpty(data.getOrderId()), DealOrderApp::getOrderId, data.getOrderId())
                .eq(!ObjectUtils.isEmpty(data.getRetain1()), DealOrderApp::getRetain1, data.getRetain1())
                .eq(!ObjectUtils.isEmpty(data.getOrderStatus()), DealOrderApp::getOrderStatus, data.getOrderStatus())
                .ge(ObjUtil.isNotEmpty(vo.getParams().get("beginTime")), DealOrderApp::getCreateTime, vo.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(vo.getParams().get("endTime")), DealOrderApp::getCreateTime, vo.getParams().get("endTime"))
                .orderByDesc(DealOrderApp::getCreateTime)
        );
        return page(page,vo);
    }
    public List<DealOrderApp> queryList(DealOrderBean data){
        List<DealOrderApp> list = dealOrderAppService.lambdaQuery()
                .eq(!ObjectUtils.isEmpty(data.getId()), DealOrderApp::getId, data.getId())
                .eq(!ObjectUtils.isEmpty(data.getAppOrderId()), DealOrderApp::getAppOrderId, data.getAppOrderId())
                .eq(!ObjectUtils.isEmpty(data.getOrderAccount()), DealOrderApp::getOrderAccount, data.getOrderAccount())
                .eq(!ObjectUtils.isEmpty(data.getOrderId()), DealOrderApp::getOrderId, data.getOrderId())
                .eq(!ObjectUtils.isEmpty(data.getRetain1()), DealOrderApp::getRetain1, data.getRetain1())
                .eq(!ObjectUtils.isEmpty(data.getOrderStatus()), DealOrderApp::getOrderStatus, data.getOrderStatus())
                .ge(ObjUtil.isNotEmpty(data.getParams().get("beginTime")), DealOrderApp::getCreateTime, data.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(data.getParams().get("endTime")), DealOrderApp::getCreateTime, data.getParams().get("endTime"))
                .orderByDesc(DealOrderApp::getCreateTime).list();
        return list;
    }
}
