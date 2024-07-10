package com.admin.out.api.newadminoutapi.vo.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * <p>
 * 分页-响应body
 * </p>
 *
 * @author andy
 * @since 2020/3/12
 */
@Data
public class ResPage<T> {
    private long current = 1;
    private long size = 10;
    private List<T> list = Collections.emptyList();
    private long total = 0;
    private long pages = 0;

    @NotNull
    public static <K> ResPage<K> get(Page<K> page) {
        ResPage<K> p = new ResPage<>();
        if (null != page) {
            p.setPages(page.getPages());
            p.setList(page.getRecords());
            p.setTotal(page.getTotal());
            p.setCurrent(page.getCurrent());
            p.setSize(page.getSize());
        }
        return p;
    }
}
