package com.admin.out.api.newadminoutapi.vo.page;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * <p>
 * 带排序的
 * </p>
 *
 * @author andy
 * @since 2020/3/12
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ReqSortPage<T> extends BasePage {
    private String sortKey;
    private String[] sortField;
    private T data;

    @Override
    public <K> Page<K> getPage() {
        Page<K> page = super.getPage();

        if(!"".equals(sortKey) && null != sortKey){
            if (ASC_SORT.equalsIgnoreCase(sortKey.toUpperCase())) {
                page.setOrders(OrderItem.ascs(sortField));
            }
            if (DESC_SORT.equalsIgnoreCase(sortKey.toUpperCase())) {
                page.setOrders(OrderItem.descs(sortField));
            }
        }
        return page;
    }
}

