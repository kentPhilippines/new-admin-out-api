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
 * 流水订单记录表
 * @TableName alipay_run_order
 */
@TableName(value ="alipay_run_order")
@Data
public class RunOrder implements Serializable {
    private Map<String, Object> params;
    /**
     * 数据id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 流水订单id(全局唯一索引)
     */
    private String orderid;

    /**
     * 关联订单号(普通索引)
     */
    private String associatedid;

    /**
     * 关联账户
     */
    private String orderaccount;

    /**
     * 流水类型(1充值交易,2系统加款,3交易手续费,4系统扣款,5代付,6代付手续费,7冻结,8解冻,9代付手手续费冻结,10代付冻结,11增加交易点数,12点数扣除,13代理商分润，14码商分润，17人工加点数，18人工减点数，19 卡商交易加钱，20下游商户交易加款，21下游商户交易手续费扣款)
     */
    private Integer runordertype;

    /**
     * 流水金额
     */
    private BigDecimal amount;

    /**
     * 流水关联ip
     */
    private String generationip;

    /**
     * 流水描述
     */
    private String dealdescribe;

    /**
     * 入款记录账户
     */
    private String acountr;

    /**
     * 出款记录账户
     */
    private String accountw;

    /**
     * 数据创建时间
     */
    private Date createtime;

    /**
     * 数据最近一次修改时间
     */
    private Date submittime;

    /**
     * 状态:1可使用；0不可使用
     */
    private Integer status;

    /**
     * 流水状态  1.自然状态 2.人工操作
     */
    private String runtype;

    /**
     * 1支出0收入
     */
    private String amounttype;

    /**
     * 当前账户余额
     */
    private BigDecimal amountnow;

    /**
     * 记录当前代理商的资金来源账户
     */
    private String retain4;

    /**
     * 备用字段添加业务使用
     */
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
    public String getOrderid() {
        return orderid;
    }

    /**
     * 流水订单id(全局唯一索引)
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 关联订单号(普通索引)
     */
    public String getAssociatedid() {
        return associatedid;
    }

    /**
     * 关联订单号(普通索引)
     */
    public void setAssociatedid(String associatedid) {
        this.associatedid = associatedid;
    }

    /**
     * 关联账户
     */
    public String getOrderaccount() {
        return orderaccount;
    }

    /**
     * 关联账户
     */
    public void setOrderaccount(String orderaccount) {
        this.orderaccount = orderaccount;
    }

    /**
     * 流水类型(1充值交易,2系统加款,3交易手续费,4系统扣款,5代付,6代付手续费,7冻结,8解冻,9代付手手续费冻结,10代付冻结,11增加交易点数,12点数扣除,13代理商分润，14码商分润，17人工加点数，18人工减点数，19 卡商交易加钱，20下游商户交易加款，21下游商户交易手续费扣款)
     */
    public Integer getRunordertype() {
        return runordertype;
    }

    /**
     * 流水类型(1充值交易,2系统加款,3交易手续费,4系统扣款,5代付,6代付手续费,7冻结,8解冻,9代付手手续费冻结,10代付冻结,11增加交易点数,12点数扣除,13代理商分润，14码商分润，17人工加点数，18人工减点数，19 卡商交易加钱，20下游商户交易加款，21下游商户交易手续费扣款)
     */
    public void setRunordertype(Integer runordertype) {
        this.runordertype = runordertype;
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
    public String getGenerationip() {
        return generationip;
    }

    /**
     * 流水关联ip
     */
    public void setGenerationip(String generationip) {
        this.generationip = generationip;
    }

    /**
     * 流水描述
     */
    public String getDealdescribe() {
        return dealdescribe;
    }

    /**
     * 流水描述
     */
    public void setDealdescribe(String dealdescribe) {
        this.dealdescribe = dealdescribe;
    }

    /**
     * 入款记录账户
     */
    public String getAcountr() {
        return acountr;
    }

    /**
     * 入款记录账户
     */
    public void setAcountr(String acountr) {
        this.acountr = acountr;
    }

    /**
     * 出款记录账户
     */
    public String getAccountw() {
        return accountw;
    }

    /**
     * 出款记录账户
     */
    public void setAccountw(String accountw) {
        this.accountw = accountw;
    }

    /**
     * 数据创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 数据创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 数据最近一次修改时间
     */
    public Date getSubmittime() {
        return submittime;
    }

    /**
     * 数据最近一次修改时间
     */
    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
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
    public String getRuntype() {
        return runtype;
    }

    /**
     * 流水状态  1.自然状态 2.人工操作
     */
    public void setRuntype(String runtype) {
        this.runtype = runtype;
    }

    /**
     * 1支出0收入
     */
    public String getAmounttype() {
        return amounttype;
    }

    /**
     * 1支出0收入
     */
    public void setAmounttype(String amounttype) {
        this.amounttype = amounttype;
    }

    /**
     * 当前账户余额
     */
    public BigDecimal getAmountnow() {
        return amountnow;
    }

    /**
     * 当前账户余额
     */
    public void setAmountnow(BigDecimal amountnow) {
        this.amountnow = amountnow;
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
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getAssociatedid() == null ? other.getAssociatedid() == null : this.getAssociatedid().equals(other.getAssociatedid()))
            && (this.getOrderaccount() == null ? other.getOrderaccount() == null : this.getOrderaccount().equals(other.getOrderaccount()))
            && (this.getRunordertype() == null ? other.getRunordertype() == null : this.getRunordertype().equals(other.getRunordertype()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getGenerationip() == null ? other.getGenerationip() == null : this.getGenerationip().equals(other.getGenerationip()))
            && (this.getDealdescribe() == null ? other.getDealdescribe() == null : this.getDealdescribe().equals(other.getDealdescribe()))
            && (this.getAcountr() == null ? other.getAcountr() == null : this.getAcountr().equals(other.getAcountr()))
            && (this.getAccountw() == null ? other.getAccountw() == null : this.getAccountw().equals(other.getAccountw()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getSubmittime() == null ? other.getSubmittime() == null : this.getSubmittime().equals(other.getSubmittime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRuntype() == null ? other.getRuntype() == null : this.getRuntype().equals(other.getRuntype()))
            && (this.getAmounttype() == null ? other.getAmounttype() == null : this.getAmounttype().equals(other.getAmounttype()))
            && (this.getAmountnow() == null ? other.getAmountnow() == null : this.getAmountnow().equals(other.getAmountnow()))
            && (this.getRetain4() == null ? other.getRetain4() == null : this.getRetain4().equals(other.getRetain4()))
            && (this.getRetain5() == null ? other.getRetain5() == null : this.getRetain5().equals(other.getRetain5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getAssociatedid() == null) ? 0 : getAssociatedid().hashCode());
        result = prime * result + ((getOrderaccount() == null) ? 0 : getOrderaccount().hashCode());
        result = prime * result + ((getRunordertype() == null) ? 0 : getRunordertype().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getGenerationip() == null) ? 0 : getGenerationip().hashCode());
        result = prime * result + ((getDealdescribe() == null) ? 0 : getDealdescribe().hashCode());
        result = prime * result + ((getAcountr() == null) ? 0 : getAcountr().hashCode());
        result = prime * result + ((getAccountw() == null) ? 0 : getAccountw().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getSubmittime() == null) ? 0 : getSubmittime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRuntype() == null) ? 0 : getRuntype().hashCode());
        result = prime * result + ((getAmounttype() == null) ? 0 : getAmounttype().hashCode());
        result = prime * result + ((getAmountnow() == null) ? 0 : getAmountnow().hashCode());
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
        sb.append(", orderid=").append(orderid);
        sb.append(", associatedid=").append(associatedid);
        sb.append(", orderaccount=").append(orderaccount);
        sb.append(", runordertype=").append(runordertype);
        sb.append(", amount=").append(amount);
        sb.append(", generationip=").append(generationip);
        sb.append(", dealdescribe=").append(dealdescribe);
        sb.append(", acountr=").append(acountr);
        sb.append(", accountw=").append(accountw);
        sb.append(", createtime=").append(createtime);
        sb.append(", submittime=").append(submittime);
        sb.append(", status=").append(status);
        sb.append(", runtype=").append(runtype);
        sb.append(", amounttype=").append(amounttype);
        sb.append(", amountnow=").append(amountnow);
        sb.append(", retain4=").append(retain4);
        sb.append(", retain5=").append(retain5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}