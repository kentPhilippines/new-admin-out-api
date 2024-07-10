package com.admin.out.api.newadminoutapi.dao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员提现记录表
 * @TableName alipay_withdraw
 */
@TableName(value ="alipay_withdraw")
public class Withdraw implements Serializable {
    /**
     * 商户后台管理员
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 会员提现单号
     */
    @TableField(value = "orderId")
    private String orderId;

    /**
     * 会员id(唯一识别号)(index索引)
     */
    @TableField(value = "userId")
    private String userId;

    /**
     * 商户提现1，码商提现2
     */
    @TableField(value = "withdrawType")
    private String withdrawType;

    /**
     * 银行卡号
     */
    @TableField(value = "bankNo")
    private String bankNo;

    /**
     * 开户人
     */
    @TableField(value = "accname")
    private String accname;

    /**
     *  1处理中2成功3失败4已推送处理
     */
    @TableField(value = "orderStatus")
    private String orderStatus;

    /**
     * 开户行
     */
    @TableField(value = "bankName")
    private String bankName;

    /**
     * 提现金额
     */
    @TableField(value = "amount")
    private BigDecimal amount;

    /**
     * 手续费
     */
    @TableField(value = "fee")
    private BigDecimal fee;

    /**
     * 真实到账金额
     */
    @TableField(value = "actualAmount")
    private BigDecimal actualAmount;

    /**
     * 手机号
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 提现成功回调地址
     */
    @TableField(value = "notify")
    private String notify;

    /**
     * 数据创建时间
     */
    @TableField(value = "createTime")
    private Date createTime;

    /**
     * 数据修改时间
     */
    @TableField(value = "submitTime")
    private Date submitTime;

    /**
     * 1数据可用2数据无用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 代付产品类型
     */
    @TableField(value = "witType")
    private String witType;

    /**
     * 代付下游商户订单号
     */
    @TableField(value = "appOrderId")
    private String appOrderId;

    /**
     * 用户代付权重
     */
    @TableField(value = "weight")
    private String weight;

    /**
     * 代付来源  1API   2后台   3 码商客户端
     */
    @TableField(value = "retain1")
    private String retain1;

    /**
     * 代付发起ip地址
     */
    @TableField(value = "retain2")
    private String retain2;

    /**
     * 商户后台管理员（申请人）
     */
    @TableField(value = "apply")
    private String apply;

    /**
     * 审核人
     */
    @TableField(value = "approval")
    private String approval;

    /**
     * 审核意见
     */
    @TableField(value = "comment")
    private String comment;

    /**
     * 如果是银行代付 银行标识号
     */
    @TableField(value = "bankcode")
    private String bankcode;

    /**
     * 代付渠道
     */
    @TableField(value = "witChannel")
    private String witChannel;

    /**
     * 当匹配的出款渠道为自营渠道时候实际手动出款渠道
     */
    @TableField(value = "channelId")
    private String channelId;

    /**
     * 货币类型
     */
    @TableField(value = "currency")
    private String currency;

    /**
     * eth手续费是否结算，1已结算2未结算
     */
    @TableField(value = "ethFee")
    private Integer ethFee;

    /**
     * usdt交易hash唯一值
     */
    @TableField(value = "txhash")
    private String txhash;

    /**
     * 是否推送代付订单， 1 已推送  0 未推送，默认为已推送
     */
    @TableField(value = "pushOrder")
    private Integer pushOrder;

    /**
     * 
     */
    @TableField(value = "sgin")
    private String sgin;

    /**
     * 
     */
    @TableField(value = "amount1")
    private String amount1;

    /**
     * 
     */
    @TableField(value = "actualAmount1")
    private String actualAmount1;

    /**
     * 
     */
    @TableField(value = "fee1")
    private String fee1;

    /**
     * 
     */
    @TableField(value = "exported")
    private Integer exported;

    /**
     * 请求数据
     */
    @TableField(value = "request")
    private String request;

    /**
     * 响应
     */
    @TableField(value = "response")
    private String response;

    /**
     * 1 扣款结算     0 未扣款结算
     */
    @TableField(value = "payStatus")
    private Integer payStatus;

    /**
     * 等待推送时间
     */
    @TableField(value = "watingTime")
    private Integer watingTime;

    /**
     * 0 不挂起，1挂起 就是停止操作
     */
    @TableField(value = "moreMacth")
    private Integer moreMacth;

    /**
     * 备注
     */
    @TableField(value = "dealDescribe")
    private String dealDescribe;

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
    public String getOrderId() {
        return orderId;
    }

    /**
     * 会员提现单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 会员id(唯一识别号)(index索引)
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 会员id(唯一识别号)(index索引)
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 商户提现1，码商提现2
     */
    public String getWithdrawType() {
        return withdrawType;
    }

    /**
     * 商户提现1，码商提现2
     */
    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType;
    }

    /**
     * 银行卡号
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * 银行卡号
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
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
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     *  1处理中2成功3失败4已推送处理
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 开户行
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 开户行
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
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
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * 真实到账金额
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
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
    public String getWitType() {
        return witType;
    }

    /**
     * 代付产品类型
     */
    public void setWitType(String witType) {
        this.witType = witType;
    }

    /**
     * 代付下游商户订单号
     */
    public String getAppOrderId() {
        return appOrderId;
    }

    /**
     * 代付下游商户订单号
     */
    public void setAppOrderId(String appOrderId) {
        this.appOrderId = appOrderId;
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
    public String getWitChannel() {
        return witChannel;
    }

    /**
     * 代付渠道
     */
    public void setWitChannel(String witChannel) {
        this.witChannel = witChannel;
    }

    /**
     * 当匹配的出款渠道为自营渠道时候实际手动出款渠道
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 当匹配的出款渠道为自营渠道时候实际手动出款渠道
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
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
    public Integer getEthFee() {
        return ethFee;
    }

    /**
     * eth手续费是否结算，1已结算2未结算
     */
    public void setEthFee(Integer ethFee) {
        this.ethFee = ethFee;
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
    public Integer getPushOrder() {
        return pushOrder;
    }

    /**
     * 是否推送代付订单， 1 已推送  0 未推送，默认为已推送
     */
    public void setPushOrder(Integer pushOrder) {
        this.pushOrder = pushOrder;
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
    public String getActualAmount1() {
        return actualAmount1;
    }

    /**
     * 
     */
    public void setActualAmount1(String actualAmount1) {
        this.actualAmount1 = actualAmount1;
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
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 1 扣款结算     0 未扣款结算
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 等待推送时间
     */
    public Integer getWatingTime() {
        return watingTime;
    }

    /**
     * 等待推送时间
     */
    public void setWatingTime(Integer watingTime) {
        this.watingTime = watingTime;
    }

    /**
     * 0 不挂起，1挂起 就是停止操作
     */
    public Integer getMoreMacth() {
        return moreMacth;
    }

    /**
     * 0 不挂起，1挂起 就是停止操作
     */
    public void setMoreMacth(Integer moreMacth) {
        this.moreMacth = moreMacth;
    }

    /**
     * 备注
     */
    public String getDealDescribe() {
        return dealDescribe;
    }

    /**
     * 备注
     */
    public void setDealDescribe(String dealDescribe) {
        this.dealDescribe = dealDescribe;
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
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getWithdrawType() == null ? other.getWithdrawType() == null : this.getWithdrawType().equals(other.getWithdrawType()))
            && (this.getBankNo() == null ? other.getBankNo() == null : this.getBankNo().equals(other.getBankNo()))
            && (this.getAccname() == null ? other.getAccname() == null : this.getAccname().equals(other.getAccname()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getActualAmount() == null ? other.getActualAmount() == null : this.getActualAmount().equals(other.getActualAmount()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getNotify() == null ? other.getNotify() == null : this.getNotify().equals(other.getNotify()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSubmitTime() == null ? other.getSubmitTime() == null : this.getSubmitTime().equals(other.getSubmitTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWitType() == null ? other.getWitType() == null : this.getWitType().equals(other.getWitType()))
            && (this.getAppOrderId() == null ? other.getAppOrderId() == null : this.getAppOrderId().equals(other.getAppOrderId()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getRetain1() == null ? other.getRetain1() == null : this.getRetain1().equals(other.getRetain1()))
            && (this.getRetain2() == null ? other.getRetain2() == null : this.getRetain2().equals(other.getRetain2()))
            && (this.getApply() == null ? other.getApply() == null : this.getApply().equals(other.getApply()))
            && (this.getApproval() == null ? other.getApproval() == null : this.getApproval().equals(other.getApproval()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getBankcode() == null ? other.getBankcode() == null : this.getBankcode().equals(other.getBankcode()))
            && (this.getWitChannel() == null ? other.getWitChannel() == null : this.getWitChannel().equals(other.getWitChannel()))
            && (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getEthFee() == null ? other.getEthFee() == null : this.getEthFee().equals(other.getEthFee()))
            && (this.getTxhash() == null ? other.getTxhash() == null : this.getTxhash().equals(other.getTxhash()))
            && (this.getPushOrder() == null ? other.getPushOrder() == null : this.getPushOrder().equals(other.getPushOrder()))
            && (this.getSgin() == null ? other.getSgin() == null : this.getSgin().equals(other.getSgin()))
            && (this.getAmount1() == null ? other.getAmount1() == null : this.getAmount1().equals(other.getAmount1()))
            && (this.getActualAmount1() == null ? other.getActualAmount1() == null : this.getActualAmount1().equals(other.getActualAmount1()))
            && (this.getFee1() == null ? other.getFee1() == null : this.getFee1().equals(other.getFee1()))
            && (this.getExported() == null ? other.getExported() == null : this.getExported().equals(other.getExported()))
            && (this.getRequest() == null ? other.getRequest() == null : this.getRequest().equals(other.getRequest()))
            && (this.getResponse() == null ? other.getResponse() == null : this.getResponse().equals(other.getResponse()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getWatingTime() == null ? other.getWatingTime() == null : this.getWatingTime().equals(other.getWatingTime()))
            && (this.getMoreMacth() == null ? other.getMoreMacth() == null : this.getMoreMacth().equals(other.getMoreMacth()))
            && (this.getDealDescribe() == null ? other.getDealDescribe() == null : this.getDealDescribe().equals(other.getDealDescribe()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getWithdrawType() == null) ? 0 : getWithdrawType().hashCode());
        result = prime * result + ((getBankNo() == null) ? 0 : getBankNo().hashCode());
        result = prime * result + ((getAccname() == null) ? 0 : getAccname().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getActualAmount() == null) ? 0 : getActualAmount().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getNotify() == null) ? 0 : getNotify().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getWitType() == null) ? 0 : getWitType().hashCode());
        result = prime * result + ((getAppOrderId() == null) ? 0 : getAppOrderId().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getRetain1() == null) ? 0 : getRetain1().hashCode());
        result = prime * result + ((getRetain2() == null) ? 0 : getRetain2().hashCode());
        result = prime * result + ((getApply() == null) ? 0 : getApply().hashCode());
        result = prime * result + ((getApproval() == null) ? 0 : getApproval().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getBankcode() == null) ? 0 : getBankcode().hashCode());
        result = prime * result + ((getWitChannel() == null) ? 0 : getWitChannel().hashCode());
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getEthFee() == null) ? 0 : getEthFee().hashCode());
        result = prime * result + ((getTxhash() == null) ? 0 : getTxhash().hashCode());
        result = prime * result + ((getPushOrder() == null) ? 0 : getPushOrder().hashCode());
        result = prime * result + ((getSgin() == null) ? 0 : getSgin().hashCode());
        result = prime * result + ((getAmount1() == null) ? 0 : getAmount1().hashCode());
        result = prime * result + ((getActualAmount1() == null) ? 0 : getActualAmount1().hashCode());
        result = prime * result + ((getFee1() == null) ? 0 : getFee1().hashCode());
        result = prime * result + ((getExported() == null) ? 0 : getExported().hashCode());
        result = prime * result + ((getRequest() == null) ? 0 : getRequest().hashCode());
        result = prime * result + ((getResponse() == null) ? 0 : getResponse().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getWatingTime() == null) ? 0 : getWatingTime().hashCode());
        result = prime * result + ((getMoreMacth() == null) ? 0 : getMoreMacth().hashCode());
        result = prime * result + ((getDealDescribe() == null) ? 0 : getDealDescribe().hashCode());
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
        sb.append(", userId=").append(userId);
        sb.append(", withdrawType=").append(withdrawType);
        sb.append(", bankNo=").append(bankNo);
        sb.append(", accname=").append(accname);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", bankName=").append(bankName);
        sb.append(", amount=").append(amount);
        sb.append(", fee=").append(fee);
        sb.append(", actualAmount=").append(actualAmount);
        sb.append(", mobile=").append(mobile);
        sb.append(", notify=").append(notify);
        sb.append(", createTime=").append(createTime);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", status=").append(status);
        sb.append(", witType=").append(witType);
        sb.append(", appOrderId=").append(appOrderId);
        sb.append(", weight=").append(weight);
        sb.append(", retain1=").append(retain1);
        sb.append(", retain2=").append(retain2);
        sb.append(", apply=").append(apply);
        sb.append(", approval=").append(approval);
        sb.append(", comment=").append(comment);
        sb.append(", bankcode=").append(bankcode);
        sb.append(", witChannel=").append(witChannel);
        sb.append(", channelId=").append(channelId);
        sb.append(", currency=").append(currency);
        sb.append(", ethFee=").append(ethFee);
        sb.append(", txhash=").append(txhash);
        sb.append(", pushOrder=").append(pushOrder);
        sb.append(", sgin=").append(sgin);
        sb.append(", amount1=").append(amount1);
        sb.append(", actualAmount1=").append(actualAmount1);
        sb.append(", fee1=").append(fee1);
        sb.append(", exported=").append(exported);
        sb.append(", request=").append(request);
        sb.append(", response=").append(response);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", watingTime=").append(watingTime);
        sb.append(", moreMacth=").append(moreMacth);
        sb.append(", dealDescribe=").append(dealDescribe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}