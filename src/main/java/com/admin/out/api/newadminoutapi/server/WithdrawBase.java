package com.admin.out.api.newadminoutapi.server;

import cn.hutool.core.util.ObjUtil;
import com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp;
import com.admin.out.api.newadminoutapi.dao.domain.Withdraw;
import com.admin.out.api.newadminoutapi.dao.service.WithdrawService;
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
                .eq(!ObjectUtils.isEmpty(data.getApporderid()), Withdraw::getApporderid, data.getApporderid())
                .eq(!ObjectUtils.isEmpty(data.getOrderid()), Withdraw::getOrderid, data.getOrderid())
                .eq(!ObjectUtils.isEmpty(data.getUserid()), Withdraw::getUserid, data.getUserid())
                .eq(!ObjectUtils.isEmpty(data.getOrderstatus()), Withdraw::getOrderstatus, data.getOrderstatus())
                .ge(ObjUtil.isNotEmpty(vo.getParams().get("beginTime")), Withdraw::getCreatetime, vo.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(vo.getParams().get("endTime")), Withdraw::getCreatetime, vo.getParams().get("endTime"))
                .orderByDesc(Withdraw::getCreatetime)
        );
        return page(page,vo);
    }
    public List<Withdraw> queryList(Withdraw data){
        List<Withdraw> list = withdrawService.lambdaQuery()
                .eq(!ObjectUtils.isEmpty(data.getId()), Withdraw::getId, data.getId())
                .eq(!ObjectUtils.isEmpty(data.getApporderid()), Withdraw::getApporderid, data.getApporderid())
                .eq(!ObjectUtils.isEmpty(data.getOrderid()), Withdraw::getOrderid, data.getOrderid())
                .eq(!ObjectUtils.isEmpty(data.getUserid()), Withdraw::getUserid, data.getUserid())
                .eq(!ObjectUtils.isEmpty(data.getOrderstatus()), Withdraw::getOrderstatus, data.getOrderstatus())
                .ge(ObjUtil.isNotEmpty(data.getParams().get("beginTime")), Withdraw::getCreatetime, data.getParams().get("beginTime"))
                .lt(ObjUtil.isNotEmpty(data.getParams().get("endTime")), Withdraw::getCreatetime, data.getParams().get("endTime"))
                .orderByDesc(Withdraw::getCreatetime).list();
        return list;
    }

}
