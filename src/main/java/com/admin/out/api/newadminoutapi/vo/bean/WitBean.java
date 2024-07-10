package com.admin.out.api.newadminoutapi.vo.bean;

import com.admin.out.api.newadminoutapi.dao.domain.Withdraw;
import lombok.Data;

import java.util.Map;
@Data
public class WitBean extends Withdraw {
    private Map<String, Object> params;
}
