package com.admin.out.api.newadminoutapi.dao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 流水订单记录表
 * @TableName alipay_run_order
 */
@TableName(value ="alipay_run_order")
public class RunOrder implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 流水订单id(全局唯一索引)
     */
    @TableField(value = "orderId")
    private String orderId;

    /**
     * 关联订单号(普通索引)
     */
    @TableField(value = "associatedId")
    private String associatedId;

    /**
     * 关联账户
     */
    @TableField(value = "orderAccount")
    private String orderAccount;

    /**
     * 流水类型(1充值交易,2系统加款,3交易手续费,4系统扣款,5代付,6代付手续费,7冻结,8解冻,9代付手手续费冻结,10代付冻结,11增加交易点数,12点数扣除,13代理商分润，14码商分润，17人工加点数，18人工减点数，19 卡商交易加钱，20下游商户交易加款，21下游商户交易手续费扣款)
     */
    @TableField(value = "runOrderType")
    private Integer runOrderType;

    /**
     * 流水金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 流水关联ip
     */
    @TableField(value = "generationIp")
    private String generationIp;

    /**
     * 流水描述
     */
    @TableField(value = "dealDescribe")
    private String dealDescribe;

    /**
     * 入款记录账户
     */
    @TableField(value = "acountR")
    private String acountR;

    /**
     * 出款记录账户
     */
    @TableField(value = "accountW")
    private String accountW;

    /**
     * 数据创建时间
     */
    @TableField(value = "createTime")
    private Date createTime;

    /**
     * 数据最近一次修改时间
     */
    @TableField(value = "submitTime")
    private Date submitTime;

    /**
     * 状态:1可使用；0不可使用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 流水状态  1.自然状态 2.人工操作
     */
    @TableField(value = "runType")
    private String runType;

    /**
     * 1支出0收入
     */
    @TableField(value = "amountType")
    private String amountType;

    /**
     * 当前账户余额
     */
    @TableField(value = "amountNow")
    private BigDecimal amountNow;

    /**
     * 记录当前代理商的资金来源账户
     */
    @TableField(value = "retain4")
    private String retain4;

    /**
     * 备用字段添加业务使用
     */
    @TableField(value = "retain5")
    private String retain5;

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
     * 流水订单id(全局唯一索引)
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 流水订单id(全局唯一索引)
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 关联订单号(普通索引)
     */
    public String getAssociatedId() {
        return associatedId;
    }

    /**
     * 关联订单号(普通索引)
     */
    public void setAssociatedId(String associatedId) {
        this.associatedId = associatedId;
    }

    /**
     * 关联账户
     */
    public String getOrderAccount() {
        return orderAccount;
    }

    /**
     * 关联账户
     */
    public void setOrderAccount(String orderAccount) {
        this.orderAccount = orderAccount;
    }

    /**
     * 流水类型(1充值交易,2系统加款,3交易手续费,4系统扣款,5代付,6代付手续费,7冻结,8解冻,9代付手手续费冻结,10代付冻结,11增加交易点数,12点数扣除,13代理商分润，14码商分润，17人工加点数，18人工减点数，19 卡商交易加钱，20下游商户交易加款，21下游商户交易手续费扣款)
     */
    public Integer getRunOrderType() {
        return runOrderType;
    }

    /**
     * 流水类型(1充值交易,2系统加款,3交易手续费,4系统扣款,5代付,6代付手续费,7冻结,8解冻,9代付手手续费冻结,10代付冻结,11增加交易点数,12点数扣除,13代理商分润，14码商分润，17人工加点数，18人工减点数，19 卡商交易加钱，20下游商户交易加款，21下游商户交易手续费扣款)
     */
    public void setRunOrderType(Integer runOrderType) {
        this.runOrderType = runOrderType;
    }

    /**
     * 流水金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 流水金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 流水关联ip
     */
    public String getGenerationIp() {
        return generationIp;
    }

    /**
     * 流水关联ip
     */
    public void setGenerationIp(String generationIp) {
        this.generationIp = generationIp;
    }

    /**
     * 流水描述
     */
    public String getDealDescribe() {
        return dealDescribe;
    }

    /**
     * 流水描述
     */
    public void setDealDescribe(String dealDescribe) {
        this.dealDescribe = dealDescribe;
    }

    /**
     * 入款记录账户
     */
    public String getAcountR() {
        return acountR;
    }

    /**
     * 入款记录账户
     */
    public void setAcountR(String acountR) {
        this.acountR = acountR;
    }

    /**
     * 出款记录账户
     */
    public String getAccountW() {
        return accountW;
    }

    /**
     * 出款记录账户
     */
    public void setAccountW(String accountW) {
        this.accountW = accountW;
    }

    /**
     * 数据创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据最近一次修改时间
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * 数据最近一次修改时间
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
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
     * 流水状态  1.自然状态 2.人工操作
     */
    public String getRunType() {
        return runType;
    }

    /**
     * 流水状态  1.自然状态 2.人工操作
     */
    public void setRunType(String runType) {
        this.runType = runType;
    }

    /**
     * 1支出0收入
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * 1支出0收入
     */
    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    /**
     * 当前账户余额
     */
    public BigDecimal getAmountNow() {
        return amountNow;
    }

    /**
     * 当前账户余额
     */
    public void setAmountNow(BigDecimal amountNow) {
        this.amountNow = amountNow;
    }

    /**
     * 记录当前代理商的资金来源账户
     */
    public String getRetain4() {
        return retain4;
    }

    /**
     * 记录当前代理商的资金来源账户
     */
    public void setRetain4(String retain4) {
        this.retain4 = retain4;
    }

    /**
     * 备用字段添加业务使用
     */
    public String getRetain5() {
        return retain5;
    }

    /**
     * 备用字段添加业务使用
     */
    public void setRetain5(String retain5) {
        this.retain5 = retain5;
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
        RunOrder other = (RunOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getAssociatedId() == null ? other.getAssociatedId() == null : this.getAssociatedId().equals(other.getAssociatedId()))
            && (this.getOrderAccount() == null ? other.getOrderAccount() == null : this.getOrderAccount().equals(other.getOrderAccount()))
            && (this.getRunOrderType() == null ? other.getRunOrderType() == null : this.getRunOrderType().equals(other.getRunOrderType()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getGenerationIp() == null ? other.getGenerationIp() == null : this.getGenerationIp().equals(other.getGenerationIp()))
            && (this.getDealDescribe() == null ? other.getDealDescribe() == null : this.getDealDescribe().equals(other.getDealDescribe()))
            && (this.getAcountR() == null ? other.getAcountR() == null : this.getAcountR().equals(other.getAcountR()))
            && (this.getAccountW() == null ? other.getAccountW() == null : this.getAccountW().equals(other.getAccountW()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSubmitTime() == null ? other.getSubmitTime() == null : this.getSubmitTime().equals(other.getSubmitTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRunType() == null ? other.getRunType() == null : this.getRunType().equals(other.getRunType()))
            && (this.getAmountType() == null ? other.getAmountType() == null : this.getAmountType().equals(other.getAmountType()))
            && (this.getAmountNow() == null ? other.getAmountNow() == null : this.getAmountNow().equals(other.getAmountNow()))
            && (this.getRetain4() == null ? other.getRetain4() == null : this.getRetain4().equals(other.getRetain4()))
            && (this.getRetain5() == null ? other.getRetain5() == null : this.getRetain5().equals(other.getRetain5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getAssociatedId() == null) ? 0 : getAssociatedId().hashCode());
        result = prime * result + ((getOrderAccount() == null) ? 0 : getOrderAccount().hashCode());
        result = prime * result + ((getRunOrderType() == null) ? 0 : getRunOrderType().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getGenerationIp() == null) ? 0 : getGenerationIp().hashCode());
        result = prime * result + ((getDealDescribe() == null) ? 0 : getDealDescribe().hashCode());
        result = prime * result + ((getAcountR() == null) ? 0 : getAcountR().hashCode());
        result = prime * result + ((getAccountW() == null) ? 0 : getAccountW().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRunType() == null) ? 0 : getRunType().hashCode());
        result = prime * result + ((getAmountType() == null) ? 0 : getAmountType().hashCode());
        result = prime * result + ((getAmountNow() == null) ? 0 : getAmountNow().hashCode());
        result = prime * result + ((getRetain4() == null) ? 0 : getRetain4().hashCode());
        result = prime * result + ((getRetain5() == null) ? 0 : getRetain5().hashCode());
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
        sb.append(", associatedId=").append(associatedId);
        sb.append(", orderAccount=").append(orderAccount);
        sb.append(", runOrderType=").append(runOrderType);
        sb.append(", amount=").append(amount);
        sb.append(", generationIp=").append(generationIp);
        sb.append(", dealDescribe=").append(dealDescribe);
        sb.append(", acountR=").append(acountR);
        sb.append(", accountW=").append(accountW);
        sb.append(", createTime=").append(createTime);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", status=").append(status);
        sb.append(", runType=").append(runType);
        sb.append(", amountType=").append(amountType);
        sb.append(", amountNow=").append(amountNow);
        sb.append(", retain4=").append(retain4);
        sb.append(", retain5=").append(retain5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}