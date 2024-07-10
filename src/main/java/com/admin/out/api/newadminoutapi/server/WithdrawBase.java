package com.admin.out.api.newadminoutapi.server;

import cn.hutool.core.util.ObjUtil;
import com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp;
import com.admin.out.api.newadminoutapi.dao.domain.Withdraw;
import com.admin.out.api.newadminoutapi.dao.service.WithdrawService;
import com.admin.out.api.newadminoutapi.vo.bean.WitBean;
import com.admin.out.api.newadminoutapi.vo.page.ReqPage;
import com.admin.out.api.newadminoutapi.vo.page.ResPage;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WithdrawBase extends BaseServer{
    private final WithdrawService withdrawService;
    public ResPage<Withdraw> queryPage(ReqPage<Withdraw> vo){
        var data = vo.getData();
        Page<Withdraw> page = withdrawService.page(vo.getPage(), new LambdaQueryWrapper<Withdraw>()
                .eq(!ObjectUtils.isEmpty(data.getId()), Withdraw::getId, data.getId())
                .eq(!ObjectUtils.isEmpty(data.getAppOrderId()), Withdraw::getAppOrderId, data.getAppOrderId())
                .eq(!ObjectUtils.isEmpty(data.getOrderId()), Withdraw::getOrderId, data.getOrderId())
                .eq(!ObjectUtils.isEmpty(data.getUserId()), Withdraw::getUserId, data.getUserId())
                .eq(!ObjectUtils.isEmpty(data.getOrderStatus()), Withdraw::getOrderStatus, data.getOrderStatus())
                .ge(ObjUtil.isNotEmpty(vo.getParams().get("beginTime")), Withdraw::getCreateTime, vo.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(vo.getParams().get("endTime")), Withdraw::getCreateTime, vo.getParams().get("endTime"))
                .orderByDesc(Withdraw::getCreateTime)
        );
        return page(page,vo);
    }
    public List<Withdraw> queryList(WitBean data){
        List<Withdraw> list = withdrawService.lambdaQuery()
                .eq(!ObjectUtils.isEmpty(data.getId()), Withdraw::getId, data.getId())
                .eq(!ObjectUtils.isEmpty(data.getAppOrderId()), Withdraw::getAppOrderId, data.getAppOrderId())
                .eq(!ObjectUtils.isEmpty(data.getOrderId()), Withdraw::getOrderId, data.getOrderId())
                .eq(!ObjectUtils.isEmpty(data.getUserId()), Withdraw::getUserId, data.getUserId())
                .eq(!ObjectUtils.isEmpty(data.getOrderStatus()), Withdraw::getOrderStatus, data.getOrderStatus())
                .ge(ObjUtil.isNotEmpty(data.getParams().get("beginTime")), Withdraw::getCreateTime, data.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(data.getParams().get("endTime")), Withdraw::getCreateTime, data.getParams().get("endTime"))
                .orderByDesc(Withdraw::getCreateTime).list();
        return list;
    }

}
