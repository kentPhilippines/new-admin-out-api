package com.admin.out.api.newadminoutapi.dao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * 商户订单登记表
 * @TableName alipay_deal_order_app
 */
@Data
@TableName(value ="alipay_deal_order_app")
public class DealOrderApp implements Serializable {
    private Map<String, Object> params;
    /**
     * 数据id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 订单号
     */
    private String orderid;

    /**
     * 订单类型:1交易,5代付
     */
    private Integer ordertype;

    /**
     * 订单关联商户账号
     */
    private String orderaccount;

    /**
     * 订单状态:1处理中2成功3未收到回调4失败5超时6订单申述7人工处理
     */
    private String orderstatus;

    /**
     * 交易备注
     */
    private String dealdescribe;

    /**
     * 订单金额(原始金额)
     */
    private BigDecimal orderamount;

    /**
     * 订单生成IP(源头ip)
     */
    private String orderip;

    /**
     * 交易外部订单号
     */
    private String apporderid;

    /**
     * 使用费率id
     */
    private Integer feeid;

    /**
     * 订单异步回调地址
     */
    private String notify;

    /**
     * 订单同步回调地址
     */
    private String back;

    /**
     * 数据修改时间
     */
    private Date submittime;

    /**
     * 数据生成时间（该时间等同于交易时间）
     */
    private Date createtime;

    /**
     * 状态:1可使用；0不可使用
     */
    private Integer status;

    /**
     * 支付产品类型
     */
    private String retain1;

    /**
     * 代理商是否已结算 YES 为已结算，其他为未结算
     */
    private String retain2;

    /**
     * 当前订单结算费率手续费
     */
    private BigDecimal retain3;

    /**
     * 货币类型
     */
    private String currency;

    /**
     * usdt交易hash唯一值
     */
    private String txhash;

    /**
     * 实际支付金额
     */
    private BigDecimal actualamount;

    /**
     * 商户请求参数
     */
    private String request;

    /**
     * 响应参数
     */
    private String response;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 数据id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 数据id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 订单号
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 订单号
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 订单类型:1交易,5代付
     */
    public Integer getOrdertype() {
        return ordertype;
    }

    /**
     * 订单类型:1交易,5代付
     */
    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    /**
     * 订单关联商户账号
     */
    public String getOrderaccount() {
        return orderaccount;
    }

    /**
     * 订单关联商户账号
     */
    public void setOrderaccount(String orderaccount) {
        this.orderaccount = orderaccount;
    }

    /**
     * 订单状态:1处理中2成功3未收到回调4失败5超时6订单申述7人工处理
     */
    public String getOrderstatus() {
        return orderstatus;
    }

    /**
     * 订单状态:1处理中2成功3未收到回调4失败5超时6订单申述7人工处理
     */
    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    /**
     * 交易备注
     */
    public String getDealdescribe() {
        return dealdescribe;
    }

    /**
     * 交易备注
     */
    public void setDealdescribe(String dealdescribe) {
        this.dealdescribe = dealdescribe;
    }

    /**
     * 订单金额(原始金额)
     */
    public BigDecimal getOrderamount() {
        return orderamount;
    }

    /**
     * 订单金额(原始金额)
     */
    public void setOrderamount(BigDecimal orderamount) {
        this.orderamount = orderamount;
    }

    /**
     * 订单生成IP(源头ip)
     */
    public String getOrderip() {
        return orderip;
    }

    /**
     * 订单生成IP(源头ip)
     */
    public void setOrderip(String orderip) {
        this.orderip = orderip;
    }

    /**
     * 交易外部订单号
     */
    public String getApporderid() {
        return apporderid;
    }

    /**
     * 交易外部订单号
     */
    public void setApporderid(String apporderid) {
        this.apporderid = apporderid;
    }

    /**
     * 使用费率id
     */
    public Integer getFeeid() {
        return feeid;
    }

    /**
     * 使用费率id
     */
    public void setFeeid(Integer feeid) {
        this.feeid = feeid;
    }

    /**
     * 订单异步回调地址
     */
    public String getNotify() {
        return notify;
    }

    /**
     * 订单异步回调地址
     */
    public void setNotify(String notify) {
        this.notify = notify;
    }

    /**
     * 订单同步回调地址
     */
    public String getBack() {
        return back;
    }

    /**
     * 订单同步回调地址
     */
    public void setBack(String back) {
        this.back = back;
    }

    /**
     * 数据修改时间
     */
    public Date getSubmittime() {
        return submittime;
    }

    /**
     * 数据修改时间
     */
    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    /**
     * 数据生成时间（该时间等同于交易时间）
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 数据生成时间（该时间等同于交易时间）
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 状态:1可使用；0不可使用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态:1可使用；0不可使用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 支付产品类型
     */
    public String getRetain1() {
        return retain1;
    }

    /**
     * 支付产品类型
     */
    public void setRetain1(String retain1) {
        this.retain1 = retain1;
    }

    /**
     * 代理商是否已结算 YES 为已结算，其他为未结算
     */
    public String getRetain2() {
        return retain2;
    }

    /**
     * 代理商是否已结算 YES 为已结算，其他为未结算
     */
    public void setRetain2(String retain2) {
        this.retain2 = retain2;
    }

    /**
     * 当前订单结算费率手续费
     */
    public BigDecimal getRetain3() {
        return retain3;
    }

    /**
     * 当前订单结算费率手续费
     */
    public void setRetain3(BigDecimal retain3) {
        this.retain3 = retain3;
    }

    /**
     * 货币类型
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 货币类型
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * usdt交易hash唯一值
     */
    public String getTxhash() {
        return txhash;
    }

    /**
     * usdt交易hash唯一值
     */
    public void setTxhash(String txhash) {
        this.txhash = txhash;
    }

    /**
     * 实际支付金额
     */
    public BigDecimal getActualamount() {
        return actualamount;
    }

    /**
     * 实际支付金额
     */
    public void setActualamount(BigDecimal actualamount) {
        this.actualamount = actualamount;
    }

    /**
     * 商户请求参数
     */
    public String getRequest() {
        return request;
    }

    /**
     * 商户请求参数
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /**
     * 响应参数
     */
    public String getResponse() {
        return response;
    }

    /**
     * 响应参数
     */
    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DealOrderApp other = (DealOrderApp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getOrdertype() == null ? other.getOrdertype() == null : this.getOrdertype().equals(other.getOrdertype()))
            && (this.getOrderaccount() == null ? other.getOrderaccount() == null : this.getOrderaccount().equals(other.getOrderaccount()))
            && (this.getOrderstatus() == null ? other.getOrderstatus() == null : this.getOrderstatus().equals(other.getOrderstatus()))
            && (this.getDealdescribe() == null ? other.getDealdescribe() == null : this.getDealdescribe().equals(other.getDealdescribe()))
            && (this.getOrderamount() == null ? other.getOrderamount() == null : this.getOrderamount().equals(other.getOrderamount()))
            && (this.getOrderip() == null ? other.getOrderip() == null : this.getOrderip().equals(other.getOrderip()))
            && (this.getApporderid() == null ? other.getApporderid() == null : this.getApporderid().equals(other.getApporderid()))
            && (this.getFeeid() == null ? other.getFeeid() == null : this.getFeeid().equals(other.getFeeid()))
            && (this.getNotify() == null ? other.getNotify() == null : this.getNotify().equals(other.getNotify()))
            && (this.getBack() == null ? other.getBack() == null : this.getBack().equals(other.getBack()))
            && (this.getSubmittime() == null ? other.getSubmittime() == null : this.getSubmittime().equals(other.getSubmittime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRetain1() == null ? other.getRetain1() == null : this.getRetain1().equals(other.getRetain1()))
            && (this.getRetain2() == null ? other.getRetain2() == null : this.getRetain2().equals(other.getRetain2()))
            && (this.getRetain3() == null ? other.getRetain3() == null : this.getRetain3().equals(other.getRetain3()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getTxhash() == null ? other.getTxhash() == null : this.getTxhash().equals(other.getTxhash()))
            && (this.getActualamount() == null ? other.getActualamount() == null : this.getActualamount().equals(other.getActualamount()))
            && (this.getRequest() == null ? other.getRequest() == null : this.getRequest().equals(other.getRequest()))
            && (this.getResponse() == null ? other.getResponse() == null : this.getResponse().equals(other.getResponse()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getOrdertype() == null) ? 0 : getOrdertype().hashCode());
        result = prime * result + ((getOrderaccount() == null) ? 0 : getOrderaccount().hashCode());
        result = prime * result + ((getOrderstatus() == null) ? 0 : getOrderstatus().hashCode());
        result = prime * result + ((getDealdescribe() == null) ? 0 : getDealdescribe().hashCode());
        result = prime * result + ((getOrderamount() == null) ? 0 : getOrderamount().hashCode());
        result = prime * result + ((getOrderip() == null) ? 0 : getOrderip().hashCode());
        result = prime * result + ((getApporderid() == null) ? 0 : getApporderid().hashCode());
        result = prime * result + ((getFeeid() == null) ? 0 : getFeeid().hashCode());
        result = prime * result + ((getNotify() == null) ? 0 : getNotify().hashCode());
        result = prime * result + ((getBack() == null) ? 0 : getBack().hashCode());
        result = prime * result + ((getSubmittime() == null) ? 0 : getSubmittime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRetain1() == null) ? 0 : getRetain1().hashCode());
        result = prime * result + ((getRetain2() == null) ? 0 : getRetain2().hashCode());
        result = prime * result + ((getRetain3() == null) ? 0 : getRetain3().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getTxhash() == null) ? 0 : getTxhash().hashCode());
        result = prime * result + ((getActualamount() == null) ? 0 : getActualamount().hashCode());
        result = prime * result + ((getRequest() == null) ? 0 : getRequest().hashCode());
        result = prime * result + ((getResponse() == null) ? 0 : getResponse().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", ordertype=").append(ordertype);
        sb.append(", orderaccount=").append(orderaccount);
        sb.append(", orderstatus=").append(orderstatus);
        sb.append(", dealdescribe=").append(dealdescribe);
        sb.append(", orderamount=").append(orderamount);
        sb.append(", orderip=").append(orderip);
        sb.append(", apporderid=").append(apporderid);
        sb.append(", feeid=").append(feeid);
        sb.append(", notify=").append(notify);
        sb.append(", back=").append(back);
        sb.append(", submittime=").append(submittime);
        sb.append(", createtime=").append(createtime);
        sb.append(", status=").append(status);
        sb.append(", retain1=").append(retain1);
        sb.append(", retain2=").append(retain2);
        sb.append(", retain3=").append(retain3);
        sb.append(", currency=").append(currency);
        sb.append(", txhash=").append(txhash);
        sb.append(", actualamount=").append(actualamount);
        sb.append(", request=").append(request);
        sb.append(", response=").append(response);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}