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
 * 会员提现记录表
 * @TableName alipay_withdraw
 */
@TableName(value ="alipay_withdraw")
@Data
public class Withdraw implements Serializable {
    private Map<String, Object> params;
    /**
     * 商户后台管理员
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 会员提现单号
     */
    private String orderid;

    /**
     * 会员id(唯一识别号)(index索引)
     */
    private String userid;

    /**
     * 商户提现1，码商提现2
     */
    private String withdrawtype;

    /**
     * 银行卡号
     */
    private String bankno;

    /**
     * 开户人
     */
    private String accname;

    /**
     *  1处理中2成功3失败4已推送处理
     */
    private String orderstatus;

    /**
     * 开户行
     */
    private String bankname;

    /**
     * 提现金额
     */
    private BigDecimal amount;

    /**
     * 手续费
     */
    private BigDecimal fee;

    /**
     * 真实到账金额
     */
    private BigDecimal actualamount;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 提现成功回调地址
     */
    private String notify;

    /**
     * 数据创建时间
     */
    private Date createtime;

    /**
     * 数据修改时间
     */
    private Date submittime;

    /**
     * 1数据可用2数据无用
     */
    private Integer status;

    /**
     * 代付产品类型
     */
    private String wittype;

    /**
     * 代付下游商户订单号
     */
    private String apporderid;

    /**
     * 用户代付权重
     */
    private String weight;

    /**
     * 代付来源  1API   2后台   3 码商客户端
     */
    private String retain1;

    /**
     * 代付发起ip地址
     */
    private String retain2;

    /**
     * 商户后台管理员（申请人）
     */
    private String apply;

    /**
     * 审核人
     */
    private String approval;

    /**
     * 审核意见
     */
    private String comment;

    /**
     * 如果是银行代付 银行标识号
     */
    private String bankcode;

    /**
     * 代付渠道
     */
    private String witchannel;

    /**
     * 当匹配的出款渠道为自营渠道时候实际手动出款渠道
     */
    private String channelid;

    /**
     * 货币类型
     */
    private String currency;

    /**
     * eth手续费是否结算，1已结算2未结算
     */
    private Integer ethfee;

    /**
     * usdt交易hash唯一值
     */
    private String txhash;

    /**
     * 是否推送代付订单， 1 已推送  0 未推送，默认为已推送
     */
    private Integer pushorder;

    /**
     * 
     */
    private String sgin;

    /**
     * 
     */
    private String amount1;

    /**
     * 
     */
    private String actualamount1;

    /**
     * 
     */
    private String fee1;

    /**
     * 
     */
    private Integer exported;

    /**
     * 请求数据
     */
    private String request;

    /**
     * 响应
     */
    private String response;

    /**
     * 1 扣款结算     0 未扣款结算
     */
    private Integer paystatus;

    /**
     * 等待推送时间
     */
    private Integer watingtime;

    /**
     * 0 不挂起，1挂起 就是停止操作
     */
    private Integer moremacth;

    /**
     * 备注
     */
    private String dealdescribe;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 商户后台管理员
     */
    public Integer getId() {
        return id;
    }

    /**
     * 商户后台管理员
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 会员提现单号
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 会员提现单号
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 会员id(唯一识别号)(index索引)
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 会员id(唯一识别号)(index索引)
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 商户提现1，码商提现2
     */
    public String getWithdrawtype() {
        return withdrawtype;
    }

    /**
     * 商户提现1，码商提现2
     */
    public void setWithdrawtype(String withdrawtype) {
        this.withdrawtype = withdrawtype;
    }

    /**
     * 银行卡号
     */
    public String getBankno() {
        return bankno;
    }

    /**
     * 银行卡号
     */
    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    /**
     * 开户人
     */
    public String getAccname() {
        return accname;
    }

    /**
     * 开户人
     */
    public void setAccname(String accname) {
        this.accname = accname;
    }

    /**
     *  1处理中2成功3失败4已推送处理
     */
    public String getOrderstatus() {
        return orderstatus;
    }

    /**
     *  1处理中2成功3失败4已推送处理
     */
    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    /**
     * 开户行
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 开户行
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * 提现金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 提现金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 手续费
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 手续费
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 真实到账金额
     */
    public BigDecimal getActualamount() {
        return actualamount;
    }

    /**
     * 真实到账金额
     */
    public void setActualamount(BigDecimal actualamount) {
        this.actualamount = actualamount;
    }

    /**
     * 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 提现成功回调地址
     */
    public String getNotify() {
        return notify;
    }

    /**
     * 提现成功回调地址
     */
    public void setNotify(String notify) {
        this.notify = notify;
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
     * 1数据可用2数据无用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 1数据可用2数据无用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 代付产品类型
     */
    public String getWittype() {
        return wittype;
    }

    /**
     * 代付产品类型
     */
    public void setWittype(String wittype) {
        this.wittype = wittype;
    }

    /**
     * 代付下游商户订单号
     */
    public String getApporderid() {
        return apporderid;
    }

    /**
     * 代付下游商户订单号
     */
    public void setApporderid(String apporderid) {
        this.apporderid = apporderid;
    }

    /**
     * 用户代付权重
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 用户代付权重
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 代付来源  1API   2后台   3 码商客户端
     */
    public String getRetain1() {
        return retain1;
    }

    /**
     * 代付来源  1API   2后台   3 码商客户端
     */
    public void setRetain1(String retain1) {
        this.retain1 = retain1;
    }

    /**
     * 代付发起ip地址
     */
    public String getRetain2() {
        return retain2;
    }

    /**
     * 代付发起ip地址
     */
    public void setRetain2(String retain2) {
        this.retain2 = retain2;
    }

    /**
     * 商户后台管理员（申请人）
     */
    public String getApply() {
        return apply;
    }

    /**
     * 商户后台管理员（申请人）
     */
    public void setApply(String apply) {
        this.apply = apply;
    }

    /**
     * 审核人
     */
    public String getApproval() {
        return approval;
    }

    /**
     * 审核人
     */
    public void setApproval(String approval) {
        this.approval = approval;
    }

    /**
     * 审核意见
     */
    public String getComment() {
        return comment;
    }

    /**
     * 审核意见
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 如果是银行代付 银行标识号
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
     * 如果是银行代付 银行标识号
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    /**
     * 代付渠道
     */
    public String getWitchannel() {
        return witchannel;
    }

    /**
     * 代付渠道
     */
    public void setWitchannel(String witchannel) {
        this.witchannel = witchannel;
    }

    /**
     * 当匹配的出款渠道为自营渠道时候实际手动出款渠道
     */
    public String getChannelid() {
        return channelid;
    }

    /**
     * 当匹配的出款渠道为自营渠道时候实际手动出款渠道
     */
    public void setChannelid(String channelid) {
        this.channelid = channelid;
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
     * eth手续费是否结算，1已结算2未结算
     */
    public Integer getEthfee() {
        return ethfee;
    }

    /**
     * eth手续费是否结算，1已结算2未结算
     */
    public void setEthfee(Integer ethfee) {
        this.ethfee = ethfee;
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
     * 是否推送代付订单， 1 已推送  0 未推送，默认为已推送
     */
    public Integer getPushorder() {
        return pushorder;
    }

    /**
     * 是否推送代付订单， 1 已推送  0 未推送，默认为已推送
     */
    public void setPushorder(Integer pushorder) {
        this.pushorder = pushorder;
    }

    /**
     * 
     */
    public String getSgin() {
        return sgin;
    }

    /**
     * 
     */
    public void setSgin(String sgin) {
        this.sgin = sgin;
    }

    /**
     * 
     */
    public String getAmount1() {
        return amount1;
    }

    /**
     * 
     */
    public void setAmount1(String amount1) {
        this.amount1 = amount1;
    }

    /**
     * 
     */
    public String getActualamount1() {
        return actualamount1;
    }

    /**
     * 
     */
    public void setActualamount1(String actualamount1) {
        this.actualamount1 = actualamount1;
    }

    /**
     * 
     */
    public String getFee1() {
        return fee1;
    }

    /**
     * 
     */
    public void setFee1(String fee1) {
        this.fee1 = fee1;
    }

    /**
     * 
     */
    public Integer getExported() {
        return exported;
    }

    /**
     * 
     */
    public void setExported(Integer exported) {
        this.exported = exported;
    }

    /**
     * 请求数据
     */
    public String getRequest() {
        return request;
    }

    /**
     * 请求数据
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /**
     * 响应
     */
    public String getResponse() {
        return response;
    }

    /**
     * 响应
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * 1 扣款结算     0 未扣款结算
     */
    public Integer getPaystatus() {
        return paystatus;
    }

    /**
     * 1 扣款结算     0 未扣款结算
     */
    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    /**
     * 等待推送时间
     */
    public Integer getWatingtime() {
        return watingtime;
    }

    /**
     * 等待推送时间
     */
    public void setWatingtime(Integer watingtime) {
        this.watingtime = watingtime;
    }

    /**
     * 0 不挂起，1挂起 就是停止操作
     */
    public Integer getMoremacth() {
        return moremacth;
    }

    /**
     * 0 不挂起，1挂起 就是停止操作
     */
    public void setMoremacth(Integer moremacth) {
        this.moremacth = moremacth;
    }

    /**
     * 备注
     */
    public String getDealdescribe() {
        return dealdescribe;
    }

    /**
     * 备注
     */
    public void setDealdescribe(String dealdescribe) {
        this.dealdescribe = dealdescribe;
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
        Withdraw other = (Withdraw) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getWithdrawtype() == null ? other.getWithdrawtype() == null : this.getWithdrawtype().equals(other.getWithdrawtype()))
            && (this.getBankno() == null ? other.getBankno() == null : this.getBankno().equals(other.getBankno()))
            && (this.getAccname() == null ? other.getAccname() == null : this.getAccname().equals(other.getAccname()))
            && (this.getOrderstatus() == null ? other.getOrderstatus() == null : this.getOrderstatus().equals(other.getOrderstatus()))
            && (this.getBankname() == null ? other.getBankname() == null : this.getBankname().equals(other.getBankname()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getActualamount() == null ? other.getActualamount() == null : this.getActualamount().equals(other.getActualamount()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getNotify() == null ? other.getNotify() == null : this.getNotify().equals(other.getNotify()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getSubmittime() == null ? other.getSubmittime() == null : this.getSubmittime().equals(other.getSubmittime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWittype() == null ? other.getWittype() == null : this.getWittype().equals(other.getWittype()))
            && (this.getApporderid() == null ? other.getApporderid() == null : this.getApporderid().equals(other.getApporderid()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getRetain1() == null ? other.getRetain1() == null : this.getRetain1().equals(other.getRetain1()))
            && (this.getRetain2() == null ? other.getRetain2() == null : this.getRetain2().equals(other.getRetain2()))
            && (this.getApply() == null ? other.getApply() == null : this.getApply().equals(other.getApply()))
            && (this.getApproval() == null ? other.getApproval() == null : this.getApproval().equals(other.getApproval()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getBankcode() == null ? other.getBankcode() == null : this.getBankcode().equals(other.getBankcode()))
            && (this.getWitchannel() == null ? other.getWitchannel() == null : this.getWitchannel().equals(other.getWitchannel()))
            && (this.getChannelid() == null ? other.getChannelid() == null : this.getChannelid().equals(other.getChannelid()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getEthfee() == null ? other.getEthfee() == null : this.getEthfee().equals(other.getEthfee()))
            && (this.getTxhash() == null ? other.getTxhash() == null : this.getTxhash().equals(other.getTxhash()))
            && (this.getPushorder() == null ? other.getPushorder() == null : this.getPushorder().equals(other.getPushorder()))
            && (this.getSgin() == null ? other.getSgin() == null : this.getSgin().equals(other.getSgin()))
            && (this.getAmount1() == null ? other.getAmount1() == null : this.getAmount1().equals(other.getAmount1()))
            && (this.getActualamount1() == null ? other.getActualamount1() == null : this.getActualamount1().equals(other.getActualamount1()))
            && (this.getFee1() == null ? other.getFee1() == null : this.getFee1().equals(other.getFee1()))
            && (this.getExported() == null ? other.getExported() == null : this.getExported().equals(other.getExported()))
            && (this.getRequest() == null ? other.getRequest() == null : this.getRequest().equals(other.getRequest()))
            && (this.getResponse() == null ? other.getResponse() == null : this.getResponse().equals(other.getResponse()))
            && (this.getPaystatus() == null ? other.getPaystatus() == null : this.getPaystatus().equals(other.getPaystatus()))
            && (this.getWatingtime() == null ? other.getWatingtime() == null : this.getWatingtime().equals(other.getWatingtime()))
            && (this.getMoremacth() == null ? other.getMoremacth() == null : this.getMoremacth().equals(other.getMoremacth()))
            && (this.getDealdescribe() == null ? other.getDealdescribe() == null : this.getDealdescribe().equals(other.getDealdescribe()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getWithdrawtype() == null) ? 0 : getWithdrawtype().hashCode());
        result = prime * result + ((getBankno() == null) ? 0 : getBankno().hashCode());
        result = prime * result + ((getAccname() == null) ? 0 : getAccname().hashCode());
        result = prime * result + ((getOrderstatus() == null) ? 0 : getOrderstatus().hashCode());
        result = prime * result + ((getBankname() == null) ? 0 : getBankname().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getActualamount() == null) ? 0 : getActualamount().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getNotify() == null) ? 0 : getNotify().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getSubmittime() == null) ? 0 : getSubmittime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getWittype() == null) ? 0 : getWittype().hashCode());
        result = prime * result + ((getApporderid() == null) ? 0 : getApporderid().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getRetain1() == null) ? 0 : getRetain1().hashCode());
        result = prime * result + ((getRetain2() == null) ? 0 : getRetain2().hashCode());
        result = prime * result + ((getApply() == null) ? 0 : getApply().hashCode());
        result = prime * result + ((getApproval() == null) ? 0 : getApproval().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getBankcode() == null) ? 0 : getBankcode().hashCode());
        result = prime * result + ((getWitchannel() == null) ? 0 : getWitchannel().hashCode());
        result = prime * result + ((getChannelid() == null) ? 0 : getChannelid().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getEthfee() == null) ? 0 : getEthfee().hashCode());
        result = prime * result + ((getTxhash() == null) ? 0 : getTxhash().hashCode());
        result = prime * result + ((getPushorder() == null) ? 0 : getPushorder().hashCode());
        result = prime * result + ((getSgin() == null) ? 0 : getSgin().hashCode());
        result = prime * result + ((getAmount1() == null) ? 0 : getAmount1().hashCode());
        result = prime * result + ((getActualamount1() == null) ? 0 : getActualamount1().hashCode());
        result = prime * result + ((getFee1() == null) ? 0 : getFee1().hashCode());
        result = prime * result + ((getExported() == null) ? 0 : getExported().hashCode());
        result = prime * result + ((getRequest() == null) ? 0 : getRequest().hashCode());
        result = prime * result + ((getResponse() == null) ? 0 : getResponse().hashCode());
        result = prime * result + ((getPaystatus() == null) ? 0 : getPaystatus().hashCode());
        result = prime * result + ((getWatingtime() == null) ? 0 : getWatingtime().hashCode());
        result = prime * result + ((getMoremacth() == null) ? 0 : getMoremacth().hashCode());
        result = prime * result + ((getDealdescribe() == null) ? 0 : getDealdescribe().hashCode());
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
        sb.append(", userid=").append(userid);
        sb.append(", withdrawtype=").append(withdrawtype);
        sb.append(", bankno=").append(bankno);
        sb.append(", accname=").append(accname);
        sb.append(", orderstatus=").append(orderstatus);
        sb.append(", bankname=").append(bankname);
        sb.append(", amount=").append(amount);
        sb.append(", fee=").append(fee);
        sb.append(", actualamount=").append(actualamount);
        sb.append(", mobile=").append(mobile);
        sb.append(", notify=").append(notify);
        sb.append(", createtime=").append(createtime);
        sb.append(", submittime=").append(submittime);
        sb.append(", status=").append(status);
        sb.append(", wittype=").append(wittype);
        sb.append(", apporderid=").append(apporderid);
        sb.append(", weight=").append(weight);
        sb.append(", retain1=").append(retain1);
        sb.append(", retain2=").append(retain2);
        sb.append(", apply=").append(apply);
        sb.append(", approval=").append(approval);
        sb.append(", comment=").append(comment);
        sb.append(", bankcode=").append(bankcode);
        sb.append(", witchannel=").append(witchannel);
        sb.append(", channelid=").append(channelid);
        sb.append(", currency=").append(currency);
        sb.append(", ethfee=").append(ethfee);
        sb.append(", txhash=").append(txhash);
        sb.append(", pushorder=").append(pushorder);
        sb.append(", sgin=").append(sgin);
        sb.append(", amount1=").append(amount1);
        sb.append(", actualamount1=").append(actualamount1);
        sb.append(", fee1=").append(fee1);
        sb.append(", exported=").append(exported);
        sb.append(", request=").append(request);
        sb.append(", response=").append(response);
        sb.append(", paystatus=").append(paystatus);
        sb.append(", watingtime=").append(watingtime);
        sb.append(", moremacth=").append(moremacth);
        sb.append(", dealdescribe=").append(dealdescribe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}