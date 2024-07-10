package com.admin.out.api.newadminoutapi.dao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户详情表
 * @TableName alipay_user_info
 */
@TableName(value ="alipay_user_info")
public class UserInfo implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id【登录账号】
     */
    @TableField(value = "userId")
    private String userId;

    /**
     * 用户昵称
     */
    @TableField(value = "userName")
    private String userName;

    /**
     * shiro加密秘钥【登录】
     */
    @TableField(value = "password")
    private String password;

    /**
     * shiro加密秘钥【资金】【商户则为交易秘钥】
     */
    @TableField(value = "payPasword")
    private String payPasword;

    /**
     * 秘钥加密盐值【加密算法】
     */
    @TableField(value = "salt")
    private String salt;

    /**
     * 用户类型,商户1 码商2
     */
    @TableField(value = "userType")
    private Integer userType;

    /**
     * 当前用户总开关 1开启0关闭【码商商户后台控制,该值只能在后台显示】
     */
    @TableField(value = "switchs")
    private Integer switchs;

    /**
     * 组群备注,如果为渠道账户则为渠道商户号
     */
    @TableField(value = "userNode")
    private String userNode;

    /**
     * 邮箱【修改账号秘钥邮件发送地址】
     */
    @TableField(value = "email")
    private String email;

    /**
     * 代理商id【如果存在代理商则存在数据,如果不存在代理商则为null】
     */
    @TableField(value = "agent")
    private String agent;

    /**
     * 是否为代理商:1代理商2普通码商【分润结算类型看用户类型userType】
     */
    @TableField(value = "isAgent")
    private String isAgent;

    /**
     * 信用等级为默认为100,掉单一次,或者出现故障一次减分0.001分,可人为加分
     */
    @TableField(value = "credit")
    private BigDecimal credit;

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以交易】
     */
    @TableField(value = "receiveOrderState")
    private Integer receiveOrderState;

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以代付】
     */
    @TableField(value = "remitOrderState")
    private Integer remitOrderState;

    /**
     * QQ联系方式
     */
    @TableField(value = "QQ")
    private String QQ;

    /**
     * 小飞机
     */
    @TableField(value = "telegram")
    private String telegram;

    /**
     * skype
     */
    @TableField(value = "skype")
    private String skype;

    /**
     * 数据创建时间
     */
    @TableField(value = "createTime")
    private Date createTime;

    /**
     * 最后一次数据修改时间
     */
    @TableField(value = "submitTime")
    private Date submitTime;

    /**
     * 数据是否可用:1数据可用2数据无用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 商户私钥
     */
    @TableField(value = "privateKey")
    private String privateKey;

    /**
     * 商户公钥
     */
    @TableField(value = "publicKey")
    private String publicKey;

    /**
     * 最小金额
     */
    @TableField(value = "minAmount")
    private BigDecimal minAmount;

    /**
     * 最大金额
     */
    @TableField(value = "maxAmount")
    private BigDecimal maxAmount;

    /**
     * 总金额限制
     */
    @TableField(value = "totalAmount")
    private BigDecimal totalAmount;

    /**
     * 下单次数
     */
    @TableField(value = "timesTotal")
    private Integer timesTotal;

    /**
     * 限制时间-开始时间
     */
    @TableField(value = "startTime")
    private String startTime;

    /**
     * 限制时间-结束时间
     */
    @TableField(value = "endTime")
    private String endTime;

    /**
     * 代付ip
     */
    @TableField(value = "witip")
    private String witip;

    /**
     * 供应队列code
     */
    @TableField(value = "queueList")
    private String queueList;

    /**
     * 交易IP设置【码商不填次地址无法交易】
     */
    @TableField(value = "dealUrl")
    private String dealUrl;

    /**
     * 码商充值,商户充值，卡商供应标识
     */
    @TableField(value = "qrRechargeList")
    private String qrRechargeList;

    /**
     * 0:手动代付;1:自动代付
     */
    @TableField(value = "autoWit")
    private Integer autoWit;

    /**
     * 是否开通反查接口 1  开通  0 不开通
     */
    @TableField(value = "enterWitOpen")
    private Integer enterWitOpen;

    /**
     * 商户回调接口
     */
    @TableField(value = "interFace")
    private String interFace;

    /**
     * 
     */
    @TableField(value = "balanceUrl")
    private String balanceUrl;

    /**
     * 自动出款 0 关闭 1 开启
     */
    @TableField(value = "autowitstatus")
    private Integer autowitstatus;

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
     * 用户id【登录账号】
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户id【登录账号】
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 用户昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户昵称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * shiro加密秘钥【登录】
     */
    public String getPassword() {
        return password;
    }

    /**
     * shiro加密秘钥【登录】
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * shiro加密秘钥【资金】【商户则为交易秘钥】
     */
    public String getPayPasword() {
        return payPasword;
    }

    /**
     * shiro加密秘钥【资金】【商户则为交易秘钥】
     */
    public void setPayPasword(String payPasword) {
        this.payPasword = payPasword;
    }

    /**
     * 秘钥加密盐值【加密算法】
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 秘钥加密盐值【加密算法】
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 用户类型,商户1 码商2
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 用户类型,商户1 码商2
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 当前用户总开关 1开启0关闭【码商商户后台控制,该值只能在后台显示】
     */
    public Integer getSwitchs() {
        return switchs;
    }

    /**
     * 当前用户总开关 1开启0关闭【码商商户后台控制,该值只能在后台显示】
     */
    public void setSwitchs(Integer switchs) {
        this.switchs = switchs;
    }

    /**
     * 组群备注,如果为渠道账户则为渠道商户号
     */
    public String getUserNode() {
        return userNode;
    }

    /**
     * 组群备注,如果为渠道账户则为渠道商户号
     */
    public void setUserNode(String userNode) {
        this.userNode = userNode;
    }

    /**
     * 邮箱【修改账号秘钥邮件发送地址】
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱【修改账号秘钥邮件发送地址】
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 代理商id【如果存在代理商则存在数据,如果不存在代理商则为null】
     */
    public String getAgent() {
        return agent;
    }

    /**
     * 代理商id【如果存在代理商则存在数据,如果不存在代理商则为null】
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }

    /**
     * 是否为代理商:1代理商2普通码商【分润结算类型看用户类型userType】
     */
    public String getIsAgent() {
        return isAgent;
    }

    /**
     * 是否为代理商:1代理商2普通码商【分润结算类型看用户类型userType】
     */
    public void setIsAgent(String isAgent) {
        this.isAgent = isAgent;
    }

    /**
     * 信用等级为默认为100,掉单一次,或者出现故障一次减分0.001分,可人为加分
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * 信用等级为默认为100,掉单一次,或者出现故障一次减分0.001分,可人为加分
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以交易】
     */
    public Integer getReceiveOrderState() {
        return receiveOrderState;
    }

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以交易】
     */
    public void setReceiveOrderState(Integer receiveOrderState) {
        this.receiveOrderState = receiveOrderState;
    }

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以代付】
     */
    public Integer getRemitOrderState() {
        return remitOrderState;
    }

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以代付】
     */
    public void setRemitOrderState(Integer remitOrderState) {
        this.remitOrderState = remitOrderState;
    }

    /**
     * QQ联系方式
     */
    public String getQQ() {
        return QQ;
    }

    /**
     * QQ联系方式
     */
    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    /**
     * 小飞机
     */
    public String getTelegram() {
        return telegram;
    }

    /**
     * 小飞机
     */
    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    /**
     * skype
     */
    public String getSkype() {
        return skype;
    }

    /**
     * skype
     */
    public void setSkype(String skype) {
        this.skype = skype;
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
     * 最后一次数据修改时间
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * 最后一次数据修改时间
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * 数据是否可用:1数据可用2数据无用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 数据是否可用:1数据可用2数据无用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 商户私钥
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * 商户私钥
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * 商户公钥
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * 商户公钥
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * 最小金额
     */
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * 最小金额
     */
    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * 最大金额
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * 最大金额
     */
    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * 总金额限制
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 总金额限制
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 下单次数
     */
    public Integer getTimesTotal() {
        return timesTotal;
    }

    /**
     * 下单次数
     */
    public void setTimesTotal(Integer timesTotal) {
        this.timesTotal = timesTotal;
    }

    /**
     * 限制时间-开始时间
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 限制时间-开始时间
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 限制时间-结束时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 限制时间-结束时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 代付ip
     */
    public String getWitip() {
        return witip;
    }

    /**
     * 代付ip
     */
    public void setWitip(String witip) {
        this.witip = witip;
    }

    /**
     * 供应队列code
     */
    public String getQueueList() {
        return queueList;
    }

    /**
     * 供应队列code
     */
    public void setQueueList(String queueList) {
        this.queueList = queueList;
    }

    /**
     * 交易IP设置【码商不填次地址无法交易】
     */
    public String getDealUrl() {
        return dealUrl;
    }

    /**
     * 交易IP设置【码商不填次地址无法交易】
     */
    public void setDealUrl(String dealUrl) {
        this.dealUrl = dealUrl;
    }

    /**
     * 码商充值,商户充值，卡商供应标识
     */
    public String getQrRechargeList() {
        return qrRechargeList;
    }

    /**
     * 码商充值,商户充值，卡商供应标识
     */
    public void setQrRechargeList(String qrRechargeList) {
        this.qrRechargeList = qrRechargeList;
    }

    /**
     * 0:手动代付;1:自动代付
     */
    public Integer getAutoWit() {
        return autoWit;
    }

    /**
     * 0:手动代付;1:自动代付
     */
    public void setAutoWit(Integer autoWit) {
        this.autoWit = autoWit;
    }

    /**
     * 是否开通反查接口 1  开通  0 不开通
     */
    public Integer getEnterWitOpen() {
        return enterWitOpen;
    }

    /**
     * 是否开通反查接口 1  开通  0 不开通
     */
    public void setEnterWitOpen(Integer enterWitOpen) {
        this.enterWitOpen = enterWitOpen;
    }

    /**
     * 商户回调接口
     */
    public String getInterFace() {
        return interFace;
    }

    /**
     * 商户回调接口
     */
    public void setInterFace(String interFace) {
        this.interFace = interFace;
    }

    /**
     * 
     */
    public String getBalanceUrl() {
        return balanceUrl;
    }

    /**
     * 
     */
    public void setBalanceUrl(String balanceUrl) {
        this.balanceUrl = balanceUrl;
    }

    /**
     * 自动出款 0 关闭 1 开启
     */
    public Integer getAutowitstatus() {
        return autowitstatus;
    }

    /**
     * 自动出款 0 关闭 1 开启
     */
    public void setAutowitstatus(Integer autowitstatus) {
        this.autowitstatus = autowitstatus;
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
        UserInfo other = (UserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPayPasword() == null ? other.getPayPasword() == null : this.getPayPasword().equals(other.getPayPasword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getSwitchs() == null ? other.getSwitchs() == null : this.getSwitchs().equals(other.getSwitchs()))
            && (this.getUserNode() == null ? other.getUserNode() == null : this.getUserNode().equals(other.getUserNode()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()))
            && (this.getIsAgent() == null ? other.getIsAgent() == null : this.getIsAgent().equals(other.getIsAgent()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getReceiveOrderState() == null ? other.getReceiveOrderState() == null : this.getReceiveOrderState().equals(other.getReceiveOrderState()))
            && (this.getRemitOrderState() == null ? other.getRemitOrderState() == null : this.getRemitOrderState().equals(other.getRemitOrderState()))
            && (this.getQQ() == null ? other.getQQ() == null : this.getQQ().equals(other.getQQ()))
            && (this.getTelegram() == null ? other.getTelegram() == null : this.getTelegram().equals(other.getTelegram()))
            && (this.getSkype() == null ? other.getSkype() == null : this.getSkype().equals(other.getSkype()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSubmitTime() == null ? other.getSubmitTime() == null : this.getSubmitTime().equals(other.getSubmitTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPrivateKey() == null ? other.getPrivateKey() == null : this.getPrivateKey().equals(other.getPrivateKey()))
            && (this.getPublicKey() == null ? other.getPublicKey() == null : this.getPublicKey().equals(other.getPublicKey()))
            && (this.getMinAmount() == null ? other.getMinAmount() == null : this.getMinAmount().equals(other.getMinAmount()))
            && (this.getMaxAmount() == null ? other.getMaxAmount() == null : this.getMaxAmount().equals(other.getMaxAmount()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getTimesTotal() == null ? other.getTimesTotal() == null : this.getTimesTotal().equals(other.getTimesTotal()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getWitip() == null ? other.getWitip() == null : this.getWitip().equals(other.getWitip()))
            && (this.getQueueList() == null ? other.getQueueList() == null : this.getQueueList().equals(other.getQueueList()))
            && (this.getDealUrl() == null ? other.getDealUrl() == null : this.getDealUrl().equals(other.getDealUrl()))
            && (this.getQrRechargeList() == null ? other.getQrRechargeList() == null : this.getQrRechargeList().equals(other.getQrRechargeList()))
            && (this.getAutoWit() == null ? other.getAutoWit() == null : this.getAutoWit().equals(other.getAutoWit()))
            && (this.getEnterWitOpen() == null ? other.getEnterWitOpen() == null : this.getEnterWitOpen().equals(other.getEnterWitOpen()))
            && (this.getInterFace() == null ? other.getInterFace() == null : this.getInterFace().equals(other.getInterFace()))
            && (this.getBalanceUrl() == null ? other.getBalanceUrl() == null : this.getBalanceUrl().equals(other.getBalanceUrl()))
            && (this.getAutowitstatus() == null ? other.getAutowitstatus() == null : this.getAutowitstatus().equals(other.getAutowitstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPayPasword() == null) ? 0 : getPayPasword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getSwitchs() == null) ? 0 : getSwitchs().hashCode());
        result = prime * result + ((getUserNode() == null) ? 0 : getUserNode().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        result = prime * result + ((getIsAgent() == null) ? 0 : getIsAgent().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getReceiveOrderState() == null) ? 0 : getReceiveOrderState().hashCode());
        result = prime * result + ((getRemitOrderState() == null) ? 0 : getRemitOrderState().hashCode());
        result = prime * result + ((getQQ() == null) ? 0 : getQQ().hashCode());
        result = prime * result + ((getTelegram() == null) ? 0 : getTelegram().hashCode());
        result = prime * result + ((getSkype() == null) ? 0 : getSkype().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        result = prime * result + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        result = prime * result + ((getMinAmount() == null) ? 0 : getMinAmount().hashCode());
        result = prime * result + ((getMaxAmount() == null) ? 0 : getMaxAmount().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getTimesTotal() == null) ? 0 : getTimesTotal().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getWitip() == null) ? 0 : getWitip().hashCode());
        result = prime * result + ((getQueueList() == null) ? 0 : getQueueList().hashCode());
        result = prime * result + ((getDealUrl() == null) ? 0 : getDealUrl().hashCode());
        result = prime * result + ((getQrRechargeList() == null) ? 0 : getQrRechargeList().hashCode());
        result = prime * result + ((getAutoWit() == null) ? 0 : getAutoWit().hashCode());
        result = prime * result + ((getEnterWitOpen() == null) ? 0 : getEnterWitOpen().hashCode());
        result = prime * result + ((getInterFace() == null) ? 0 : getInterFace().hashCode());
        result = prime * result + ((getBalanceUrl() == null) ? 0 : getBalanceUrl().hashCode());
        result = prime * result + ((getAutowitstatus() == null) ? 0 : getAutowitstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", payPasword=").append(payPasword);
        sb.append(", salt=").append(salt);
        sb.append(", userType=").append(userType);
        sb.append(", switchs=").append(switchs);
        sb.append(", userNode=").append(userNode);
        sb.append(", email=").append(email);
        sb.append(", agent=").append(agent);
        sb.append(", isAgent=").append(isAgent);
        sb.append(", credit=").append(credit);
        sb.append(", receiveOrderState=").append(receiveOrderState);
        sb.append(", remitOrderState=").append(remitOrderState);
        sb.append(", QQ=").append(QQ);
        sb.append(", telegram=").append(telegram);
        sb.append(", skype=").append(skype);
        sb.append(", createTime=").append(createTime);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", status=").append(status);
        sb.append(", privateKey=").append(privateKey);
        sb.append(", publicKey=").append(publicKey);
        sb.append(", minAmount=").append(minAmount);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", timesTotal=").append(timesTotal);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", witip=").append(witip);
        sb.append(", queueList=").append(queueList);
        sb.append(", dealUrl=").append(dealUrl);
        sb.append(", qrRechargeList=").append(qrRechargeList);
        sb.append(", autoWit=").append(autoWit);
        sb.append(", enterWitOpen=").append(enterWitOpen);
        sb.append(", interFace=").append(interFace);
        sb.append(", balanceUrl=").append(balanceUrl);
        sb.append(", autowitstatus=").append(autowitstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}