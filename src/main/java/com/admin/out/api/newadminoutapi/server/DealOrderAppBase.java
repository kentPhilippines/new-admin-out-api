package com.admin.out.api.newadminoutapi.server;

import cn.hutool.core.util.ObjUtil;
import com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp;
import com.admin.out.api.newadminoutapi.dao.domain.RunOrder;
import com.admin.out.api.newadminoutapi.dao.service.DealOrderAppService;
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
                .eq(!ObjectUtils.isEmpty(data.getApporderid()), DealOrderApp::getApporderid, data.getApporderid())
                .eq(!ObjectUtils.isEmpty(data.getOrderaccount()), DealOrderApp::getOrderaccount, data.getOrderaccount())
                .eq(!ObjectUtils.isEmpty(data.getOrderid()), DealOrderApp::getOrderid, data.getOrderid())
                .eq(!ObjectUtils.isEmpty(data.getRetain1()), DealOrderApp::getRetain1, data.getRetain1())
                .eq(!ObjectUtils.isEmpty(data.getStatus()), DealOrderApp::getOrderstatus, data.getOrderstatus())
                .ge(ObjUtil.isNotEmpty(vo.getParams().get("beginTime")), DealOrderApp::getCreatetime, vo.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(vo.getParams().get("endTime")), DealOrderApp::getCreatetime, vo.getParams().get("endTime"))
                .orderByDesc(DealOrderApp::getCreatetime)
        );
        return page(page,vo);
    }
    public List<DealOrderApp> queryList(DealOrderApp data){
        List<DealOrderApp> list = dealOrderAppService.lambdaQuery()
                .eq(!ObjectUtils.isEmpty(data.getId()), DealOrderApp::getId, data.getId())
                .eq(!ObjectUtils.isEmpty(data.getApporderid()), DealOrderApp::getApporderid, data.getApporderid())
                .eq(!ObjectUtils.isEmpty(data.getOrderaccount()), DealOrderApp::getOrderaccount, data.getOrderaccount())
                .eq(!ObjectUtils.isEmpty(data.getOrderid()), DealOrderApp::getOrderid, data.getOrderid())
                .eq(!ObjectUtils.isEmpty(data.getRetain1()), DealOrderApp::getRetain1, data.getRetain1())
                .eq(!ObjectUtils.isEmpty(data.getStatus()), DealOrderApp::getOrderstatus, data.getOrderstatus())
                .ge(ObjUtil.isNotEmpty(data.getParams().get("beginTime")), DealOrderApp::getCreatetime, data.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(data.getParams().get("endTime")), DealOrderApp::getCreatetime, data.getParams().get("endTime"))
                .orderByDesc(DealOrderApp::getCreatetime).list();
        return list;
    }
}
