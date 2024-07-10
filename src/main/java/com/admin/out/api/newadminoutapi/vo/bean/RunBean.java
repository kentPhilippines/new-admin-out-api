package com.admin.out.api.newadminoutapi.vo.bean;

import com.admin.out.api.newadminoutapi.dao.domain.RunOrder;
import lombok.Data;

import java.util.Map;
@Data
public class RunBean extends RunOrder {
    private Map<String, Object> params;

}
