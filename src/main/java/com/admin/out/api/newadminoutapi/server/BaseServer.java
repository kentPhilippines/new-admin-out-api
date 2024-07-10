package com.admin.out.api.newadminoutapi.server;

import com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp;
import com.admin.out.api.newadminoutapi.vo.page.ReqPage;
import com.admin.out.api.newadminoutapi.vo.page.ResPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

public class BaseServer<T> {
    ResPage<T> page(Page<T> page, ReqPage<T> vo){
        ResPage<T> resDtoResPage = new ResPage<>();
        List<T> records = page.getRecords();
        resDtoResPage.setPages(page.getPages());
        resDtoResPage.setCurrent(vo.getCurrent());
        resDtoResPage.setList(records);
        resDtoResPage.setSize(vo.getSize());
        resDtoResPage.setTotal(page.getTotal());
        return resDtoResPage;
    }
}
