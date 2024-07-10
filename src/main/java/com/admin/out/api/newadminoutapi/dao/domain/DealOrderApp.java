package com.admin.out.api.newadminoutapi.dao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商户订单登记表
 * @TableName alipay_deal_order_app
 */
@TableName(value ="alipay_deal_order_app")
public class DealOrderApp implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单号
     */
    @TableField(value = "orderId")
    private String orderId;

    /**
     * 订单类型:1交易,5代付
     */
    @TableField(value = "orderType")
    private Integer orderType;

    /**
     * 订单关联商户账号
     */
    @TableField(value = "orderAccount")
    private String orderAccount;

    /**
     * 订单状态:1处理中2成功3未收到回调4失败5超时6订单申述7人工处理
     */
    @TableField(value = "orderStatus")
    private String orderStatus;

    /**
     * 交易备注
     */
    @TableField(value = "dealDescribe")
    private String dealDescribe;

    /**
     * 订单金额(原始金额)
     */
    @TableField(value = "orderAmount")
    private BigDecimal orderAmount;

    /**
     * 订单生成IP(源头ip)
     */
    @TableField(value = "orderIp")
    private String orderIp;

    /**
     * 交易外部订单号
     */
    @TableField(value = "appOrderId")
    private String appOrderId;

    /**
     * 使用费率id
     */
    @TableField(value = "feeId")
    private Integer feeId;

    /**
     * 订单异步回调地址
     */
    @TableField(value = "notify")
    private String notify;

    /**
     * 订单同步回调地址
     */
    @TableField(value = "back")
    private String back;

    /**
     * 数据修改时间
     */
    @TableField(value = "submitTime")
    private Date submitTime;

    /**
     * 数据生成时间（该时间等同于交易时间）
     */
    @TableField(value = "createTime")
    private Date createTime;

    /**
     * 状态:1可使用；0不可使用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 支付产品类型
     */
    @TableField(value = "retain1")
    private String retain1;

    /**
     * 代理商是否已结算 YES 为已结算，其他为未结算
     */
    @TableField(value = "retain2")
    private String retain2;

    /**
     * 当前订单结算费率手续费
     */
    @TableField(value = "retain3")
    private BigDecimal retain3;

    /**
     * 货币类型
     */
    @TableField(value = "currency")
    private String currency;

    /**
     * usdt交易hash唯一值
     */
    @TableField(value = "txhash")
    private String txhash;

    /**
     * 实际支付金额
     */
    @TableField(value = "actualAmount")
    private BigDecimal actualAmount;

    /**
     * 商户请求参数
     */
    @TableField(value = "request")
    private String request;

    /**
     * 响应参数
     */
    @TableField(value = "response")
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
    public String getOrderId() {
        return orderId;
    }

    /**
     * 订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单类型:1交易,5代付
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 订单类型:1交易,5代付
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 订单关联商户账号
     */
    public String getOrderAccount() {
        return orderAccount;
    }

    /**
     * 订单关联商户账号
     */
    public void setOrderAccount(String orderAccount) {
        this.orderAccount = orderAccount;
    }

    /**
     * 订单状态:1处理中2成功3未收到回调4失败5超时6订单申述7人工处理
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态:1处理中2成功3未收到回调4失败5超时6订单申述7人工处理
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 交易备注
     */
    public String getDealDescribe() {
        return dealDescribe;
    }

    /**
     * 交易备注
     */
    public void setDealDescribe(String dealDescribe) {
        this.dealDescribe = dealDescribe;
    }

    /**
     * 订单金额(原始金额)
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 订单金额(原始金额)
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 订单生成IP(源头ip)
     */
    public String getOrderIp() {
        return orderIp;
    }

    /**
     * 订单生成IP(源头ip)
     */
    public void setOrderIp(String orderIp) {
        this.orderIp = orderIp;
    }

    /**
     * 交易外部订单号
     */
    public String getAppOrderId() {
        return appOrderId;
    }

    /**
     * 交易外部订单号
     */
    public void setAppOrderId(String appOrderId) {
        this.appOrderId = appOrderId;
    }

    /**
     * 使用费率id
     */
    public Integer getFeeId() {
        return feeId;
    }

    /**
     * 使用费率id
     */
    public void setFeeId(Integer feeId) {
        this.feeId = feeId;
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
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * 数据修改时间
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * 数据生成时间（该时间等同于交易时间）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据生成时间（该时间等同于交易时间）
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * 实际支付金额
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
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
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()))
            && (this.getOrderAccount() == null ? other.getOrderAccount() == null : this.getOrderAccount().equals(other.getOrderAccount()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getDealDescribe() == null ? other.getDealDescribe() == null : this.getDealDescribe().equals(other.getDealDescribe()))
            && (this.getOrderAmount() == null ? other.getOrderAmount() == null : this.getOrderAmount().equals(other.getOrderAmount()))
            && (this.getOrderIp() == null ? other.getOrderIp() == null : this.getOrderIp().equals(other.getOrderIp()))
            && (this.getAppOrderId() == null ? other.getAppOrderId() == null : this.getAppOrderId().equals(other.getAppOrderId()))
            && (this.getFeeId() == null ? other.getFeeId() == null : this.getFeeId().equals(other.getFeeId()))
            && (this.getNotify() == null ? other.getNotify() == null : this.getNotify().equals(other.getNotify()))
            && (this.getBack() == null ? other.getBack() == null : this.getBack().equals(other.getBack()))
            && (this.getSubmitTime() == null ? other.getSubmitTime() == null : this.getSubmitTime().equals(other.getSubmitTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRetain1() == null ? other.getRetain1() == null : this.getRetain1().equals(other.getRetain1()))
            && (this.getRetain2() == null ? other.getRetain2() == null : this.getRetain2().equals(other.getRetain2()))
            && (this.getRetain3() == null ? other.getRetain3() == null : this.getRetain3().equals(other.getRetain3()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getTxhash() == null ? other.getTxhash() == null : this.getTxhash().equals(other.getTxhash()))
            && (this.getActualAmount() == null ? other.getActualAmount() == null : this.getActualAmount().equals(other.getActualAmount()))
            && (this.getRequest() == null ? other.getRequest() == null : this.getRequest().equals(other.getRequest()))
            && (this.getResponse() == null ? other.getResponse() == null : this.getResponse().equals(other.getResponse()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        result = prime * result + ((getOrderAccount() == null) ? 0 : getOrderAccount().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getDealDescribe() == null) ? 0 : getDealDescribe().hashCode());
        result = prime * result + ((getOrderAmount() == null) ? 0 : getOrderAmount().hashCode());
        result = prime * result + ((getOrderIp() == null) ? 0 : getOrderIp().hashCode());
        result = prime * result + ((getAppOrderId() == null) ? 0 : getAppOrderId().hashCode());
        result = prime * result + ((getFeeId() == null) ? 0 : getFeeId().hashCode());
        result = prime * result + ((getNotify() == null) ? 0 : getNotify().hashCode());
        result = prime * result + ((getBack() == null) ? 0 : getBack().hashCode());
        result = prime * result + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRetain1() == null) ? 0 : getRetain1().hashCode());
        result = prime * result + ((getRetain2() == null) ? 0 : getRetain2().hashCode());
        result = prime * result + ((getRetain3() == null) ? 0 : getRetain3().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getTxhash() == null) ? 0 : getTxhash().hashCode());
        result = prime * result + ((getActualAmount() == null) ? 0 : getActualAmount().hashCode());
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
        sb.append(", orderId=").append(orderId);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderAccount=").append(orderAccount);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", dealDescribe=").append(dealDescribe);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", orderIp=").append(orderIp);
        sb.append(", appOrderId=").append(appOrderId);
        sb.append(", feeId=").append(feeId);
        sb.append(", notify=").append(notify);
        sb.append(", back=").append(back);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", retain1=").append(retain1);
        sb.append(", retain2=").append(retain2);
        sb.append(", retain3=").append(retain3);
        sb.append(", currency=").append(currency);
        sb.append(", txhash=").append(txhash);
        sb.append(", actualAmount=").append(actualAmount);
        sb.append(", request=").append(request);
        sb.append(", response=").append(response);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}