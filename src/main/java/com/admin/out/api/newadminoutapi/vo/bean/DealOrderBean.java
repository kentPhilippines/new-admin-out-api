package com.admin.out.api.newadminoutapi.vo.bean;

import com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp;
import lombok.Data;

import java.util.Map;
@Data
public class DealOrderBean extends DealOrderApp {
    private Map<String, Object> params;

}
