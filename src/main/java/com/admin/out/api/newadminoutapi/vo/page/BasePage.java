package com.admin.out.api.newadminoutapi.vo.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
 * <p>
 * 分页
 * </p>
 *
 * @author
 */
@Data
public class BasePage {
    public static final String DESC_SORT = "DESC";
    public static final String ASC_SORT = "ASC";
    @NotNull(message = "current不能为空")
    private long current = 1;
    @NotNull(message = "size不能为空")
    private long size = 20;

    public <T> Page<T> getPage() {
        return new Page<>(current, size);
    }

    public void setPage(long current, long size) {
        this.current = current;
        this.size = size;
    }
}