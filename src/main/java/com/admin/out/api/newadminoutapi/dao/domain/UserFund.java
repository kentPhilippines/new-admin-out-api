package com.admin.out.api.newadminoutapi.dao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户资金账户表
 * @TableName alipay_user_fund
 */
@TableName(value ="alipay_user_fund")
public class UserFund implements Serializable {
    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账户id【登录账户】
     */
    @TableField(value = "userId")
    private String userId;

    /**
     * 账户昵称【登录账户名】
     */
    @TableField(value = "userName")
    private String userName;

    /**
     * 现金账户【当前可取现】
     */
    @TableField(value = "cashBalance")
    private BigDecimal cashBalance;

    /**
     * 充值点数
     */
    @TableField(value = "rechargeNumber")
    private BigDecimal rechargeNumber;

    /**
     * 冻结账户
     */
    @TableField(value = "freezeBalance")
    private BigDecimal freezeBalance;

    /**
     * 可取现账户金额【码商账户余额=现金账户+充值点数-冻结金额】
     */
    @TableField(value = "accountBalance")
    private BigDecimal accountBalance;

    /**
     * 累计交易额
     */
    @TableField(value = "sumDealAmount")
    private BigDecimal sumDealAmount;

    /**
     * 累计充值金额【充值成功时统计记录】
     */
    @TableField(value = "sumRechargeAmount")
    private BigDecimal sumRechargeAmount;

    /**
     * 累计利润金额
     */
    @TableField(value = "sumProfit")
    private BigDecimal sumProfit;

    /**
     * 累计代付金额
     */
    @TableField(value = "sumWitAmount")
    private BigDecimal sumWitAmount;

    /**
     * 累计代理商利润【如果当前账户为商户则该数据为0】
     */
    @TableField(value = "sumAgentProfit")
    private BigDecimal sumAgentProfit;

    /**
     * 累计接单笔数
     */
    @TableField(value = "sumOrderCount")
    private Integer sumOrderCount;

    /**
     * 当日代付金额
     */
    @TableField(value = "todayWitAmount")
    private Long todayWitAmount;

    /**
     * 当日接单金额
     */
    @TableField(value = "todayDealAmount")
    private BigDecimal todayDealAmount;

    /**
     * 当日接单利润【代理利润+接单利润=当日利润】
     */
    @TableField(value = "todayProfit")
    private BigDecimal todayProfit;

    /**
     * 当日接单笔数
     */
    @TableField(value = "todayOrderCount")
    private Integer todayOrderCount;

    /**
     * 当日代理商利润【如果当前账户为商户则该数据为0】
     */
    @TableField(value = "todayAgentProfit")
    private BigDecimal todayAgentProfit;

    /**
     * 用户类型,商户1 码商2渠道商户3
     */
    @TableField(value = "userType")
    private String userType;

    /**
     * 代理商id【如果存在代理商则存在数据,如果不存在代理商则为null】
     */
    @TableField(value = "agent")
    private String agent;

    /**
     * 是否为代理商:1代理商2普通码商3渠道商【分润结算类型看用户类型userType】
     */
    @TableField(value = "isAgent")
    private String isAgent;

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
     * 数据版本号【数据修改锁】
     */
    @TableField(value = "version")
    private Integer version;

    /**
     * 货币类型
     */
    @TableField(value = "currency")
    private String currency;

    /**
     * 授权额度
     */
    @TableField(value = "quota")
    private BigDecimal quota;

    /**
     * 卡商接单历史
     */
    @TableField(value = "sumOtherWitAmount")
    private BigDecimal sumOtherWitAmount;

    /**
     * 卡商当日接单历史
     */
    @TableField(value = "todayOtherWitAmount")
    private BigDecimal todayOtherWitAmount;

    /**
     * 
     */
    @TableField(value = "deposit")
    private BigDecimal deposit;

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
     * 账户id【登录账户】
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 账户id【登录账户】
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 账户昵称【登录账户名】
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 账户昵称【登录账户名】
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 现金账户【当前可取现】
     */
    public BigDecimal getCashBalance() {
        return cashBalance;
    }

    /**
     * 现金账户【当前可取现】
     */
    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    /**
     * 充值点数
     */
    public BigDecimal getRechargeNumber() {
        return rechargeNumber;
    }

    /**
     * 充值点数
     */
    public void setRechargeNumber(BigDecimal rechargeNumber) {
        this.rechargeNumber = rechargeNumber;
    }

    /**
     * 冻结账户
     */
    public BigDecimal getFreezeBalance() {
        return freezeBalance;
    }

    /**
     * 冻结账户
     */
    public void setFreezeBalance(BigDecimal freezeBalance) {
        this.freezeBalance = freezeBalance;
    }

    /**
     * 可取现账户金额【码商账户余额=现金账户+充值点数-冻结金额】
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    /**
     * 可取现账户金额【码商账户余额=现金账户+充值点数-冻结金额】
     */
    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * 累计交易额
     */
    public BigDecimal getSumDealAmount() {
        return sumDealAmount;
    }

    /**
     * 累计交易额
     */
    public void setSumDealAmount(BigDecimal sumDealAmount) {
        this.sumDealAmount = sumDealAmount;
    }

    /**
     * 累计充值金额【充值成功时统计记录】
     */
    public BigDecimal getSumRechargeAmount() {
        return sumRechargeAmount;
    }

    /**
     * 累计充值金额【充值成功时统计记录】
     */
    public void setSumRechargeAmount(BigDecimal sumRechargeAmount) {
        this.sumRechargeAmount = sumRechargeAmount;
    }

    /**
     * 累计利润金额
     */
    public BigDecimal getSumProfit() {
        return sumProfit;
    }

    /**
     * 累计利润金额
     */
    public void setSumProfit(BigDecimal sumProfit) {
        this.sumProfit = sumProfit;
    }

    /**
     * 累计代付金额
     */
    public BigDecimal getSumWitAmount() {
        return sumWitAmount;
    }

    /**
     * 累计代付金额
     */
    public void setSumWitAmount(BigDecimal sumWitAmount) {
        this.sumWitAmount = sumWitAmount;
    }

    /**
     * 累计代理商利润【如果当前账户为商户则该数据为0】
     */
    public BigDecimal getSumAgentProfit() {
        return sumAgentProfit;
    }

    /**
     * 累计代理商利润【如果当前账户为商户则该数据为0】
     */
    public void setSumAgentProfit(BigDecimal sumAgentProfit) {
        this.sumAgentProfit = sumAgentProfit;
    }

    /**
     * 累计接单笔数
     */
    public Integer getSumOrderCount() {
        return sumOrderCount;
    }

    /**
     * 累计接单笔数
     */
    public void setSumOrderCount(Integer sumOrderCount) {
        this.sumOrderCount = sumOrderCount;
    }

    /**
     * 当日代付金额
     */
    public Long getTodayWitAmount() {
        return todayWitAmount;
    }

    /**
     * 当日代付金额
     */
    public void setTodayWitAmount(Long todayWitAmount) {
        this.todayWitAmount = todayWitAmount;
    }

    /**
     * 当日接单金额
     */
    public BigDecimal getTodayDealAmount() {
        return todayDealAmount;
    }

    /**
     * 当日接单金额
     */
    public void setTodayDealAmount(BigDecimal todayDealAmount) {
        this.todayDealAmount = todayDealAmount;
    }

    /**
     * 当日接单利润【代理利润+接单利润=当日利润】
     */
    public BigDecimal getTodayProfit() {
        return todayProfit;
    }

    /**
     * 当日接单利润【代理利润+接单利润=当日利润】
     */
    public void setTodayProfit(BigDecimal todayProfit) {
        this.todayProfit = todayProfit;
    }

    /**
     * 当日接单笔数
     */
    public Integer getTodayOrderCount() {
        return todayOrderCount;
    }

    /**
     * 当日接单笔数
     */
    public void setTodayOrderCount(Integer todayOrderCount) {
        this.todayOrderCount = todayOrderCount;
    }

    /**
     * 当日代理商利润【如果当前账户为商户则该数据为0】
     */
    public BigDecimal getTodayAgentProfit() {
        return todayAgentProfit;
    }

    /**
     * 当日代理商利润【如果当前账户为商户则该数据为0】
     */
    public void setTodayAgentProfit(BigDecimal todayAgentProfit) {
        this.todayAgentProfit = todayAgentProfit;
    }

    /**
     * 用户类型,商户1 码商2渠道商户3
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 用户类型,商户1 码商2渠道商户3
     */
    public void setUserType(String userType) {
        this.userType = userType;
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
     * 是否为代理商:1代理商2普通码商3渠道商【分润结算类型看用户类型userType】
     */
    public String getIsAgent() {
        return isAgent;
    }

    /**
     * 是否为代理商:1代理商2普通码商3渠道商【分润结算类型看用户类型userType】
     */
    public void setIsAgent(String isAgent) {
        this.isAgent = isAgent;
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
     * 数据版本号【数据修改锁】
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 数据版本号【数据修改锁】
     */
    public void setVersion(Integer version) {
        this.version = version;
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
     * 授权额度
     */
    public BigDecimal getQuota() {
        return quota;
    }

    /**
     * 授权额度
     */
    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }

    /**
     * 卡商接单历史
     */
    public BigDecimal getSumOtherWitAmount() {
        return sumOtherWitAmount;
    }

    /**
     * 卡商接单历史
     */
    public void setSumOtherWitAmount(BigDecimal sumOtherWitAmount) {
        this.sumOtherWitAmount = sumOtherWitAmount;
    }

    /**
     * 卡商当日接单历史
     */
    public BigDecimal getTodayOtherWitAmount() {
        return todayOtherWitAmount;
    }

    /**
     * 卡商当日接单历史
     */
    public void setTodayOtherWitAmount(BigDecimal todayOtherWitAmount) {
        this.todayOtherWitAmount = todayOtherWitAmount;
    }

    /**
     * 
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * 
     */
    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
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
        UserFund other = (UserFund) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getCashBalance() == null ? other.getCashBalance() == null : this.getCashBalance().equals(other.getCashBalance()))
            && (this.getRechargeNumber() == null ? other.getRechargeNumber() == null : this.getRechargeNumber().equals(other.getRechargeNumber()))
            && (this.getFreezeBalance() == null ? other.getFreezeBalance() == null : this.getFreezeBalance().equals(other.getFreezeBalance()))
            && (this.getAccountBalance() == null ? other.getAccountBalance() == null : this.getAccountBalance().equals(other.getAccountBalance()))
            && (this.getSumDealAmount() == null ? other.getSumDealAmount() == null : this.getSumDealAmount().equals(other.getSumDealAmount()))
            && (this.getSumRechargeAmount() == null ? other.getSumRechargeAmount() == null : this.getSumRechargeAmount().equals(other.getSumRechargeAmount()))
            && (this.getSumProfit() == null ? other.getSumProfit() == null : this.getSumProfit().equals(other.getSumProfit()))
            && (this.getSumWitAmount() == null ? other.getSumWitAmount() == null : this.getSumWitAmount().equals(other.getSumWitAmount()))
            && (this.getSumAgentProfit() == null ? other.getSumAgentProfit() == null : this.getSumAgentProfit().equals(other.getSumAgentProfit()))
            && (this.getSumOrderCount() == null ? other.getSumOrderCount() == null : this.getSumOrderCount().equals(other.getSumOrderCount()))
            && (this.getTodayWitAmount() == null ? other.getTodayWitAmount() == null : this.getTodayWitAmount().equals(other.getTodayWitAmount()))
            && (this.getTodayDealAmount() == null ? other.getTodayDealAmount() == null : this.getTodayDealAmount().equals(other.getTodayDealAmount()))
            && (this.getTodayProfit() == null ? other.getTodayProfit() == null : this.getTodayProfit().equals(other.getTodayProfit()))
            && (this.getTodayOrderCount() == null ? other.getTodayOrderCount() == null : this.getTodayOrderCount().equals(other.getTodayOrderCount()))
            && (this.getTodayAgentProfit() == null ? other.getTodayAgentProfit() == null : this.getTodayAgentProfit().equals(other.getTodayAgentProfit()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()))
            && (this.getIsAgent() == null ? other.getIsAgent() == null : this.getIsAgent().equals(other.getIsAgent()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSubmitTime() == null ? other.getSubmitTime() == null : this.getSubmitTime().equals(other.getSubmitTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getQuota() == null ? other.getQuota() == null : this.getQuota().equals(other.getQuota()))
            && (this.getSumOtherWitAmount() == null ? other.getSumOtherWitAmount() == null : this.getSumOtherWitAmount().equals(other.getSumOtherWitAmount()))
            && (this.getTodayOtherWitAmount() == null ? other.getTodayOtherWitAmount() == null : this.getTodayOtherWitAmount().equals(other.getTodayOtherWitAmount()))
            && (this.getDeposit() == null ? other.getDeposit() == null : this.getDeposit().equals(other.getDeposit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getCashBalance() == null) ? 0 : getCashBalance().hashCode());
        result = prime * result + ((getRechargeNumber() == null) ? 0 : getRechargeNumber().hashCode());
        result = prime * result + ((getFreezeBalance() == null) ? 0 : getFreezeBalance().hashCode());
        result = prime * result + ((getAccountBalance() == null) ? 0 : getAccountBalance().hashCode());
        result = prime * result + ((getSumDealAmount() == null) ? 0 : getSumDealAmount().hashCode());
        result = prime * result + ((getSumRechargeAmount() == null) ? 0 : getSumRechargeAmount().hashCode());
        result = prime * result + ((getSumProfit() == null) ? 0 : getSumProfit().hashCode());
        result = prime * result + ((getSumWitAmount() == null) ? 0 : getSumWitAmount().hashCode());
        result = prime * result + ((getSumAgentProfit() == null) ? 0 : getSumAgentProfit().hashCode());
        result = prime * result + ((getSumOrderCount() == null) ? 0 : getSumOrderCount().hashCode());
        result = prime * result + ((getTodayWitAmount() == null) ? 0 : getTodayWitAmount().hashCode());
        result = prime * result + ((getTodayDealAmount() == null) ? 0 : getTodayDealAmount().hashCode());
        result = prime * result + ((getTodayProfit() == null) ? 0 : getTodayProfit().hashCode());
        result = prime * result + ((getTodayOrderCount() == null) ? 0 : getTodayOrderCount().hashCode());
        result = prime * result + ((getTodayAgentProfit() == null) ? 0 : getTodayAgentProfit().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        result = prime * result + ((getIsAgent() == null) ? 0 : getIsAgent().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getQuota() == null) ? 0 : getQuota().hashCode());
        result = prime * result + ((getSumOtherWitAmount() == null) ? 0 : getSumOtherWitAmount().hashCode());
        result = prime * result + ((getTodayOtherWitAmount() == null) ? 0 : getTodayOtherWitAmount().hashCode());
        result = prime * result + ((getDeposit() == null) ? 0 : getDeposit().hashCode());
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
        sb.append(", cashBalance=").append(cashBalance);
        sb.append(", rechargeNumber=").append(rechargeNumber);
        sb.append(", freezeBalance=").append(freezeBalance);
        sb.append(", accountBalance=").append(accountBalance);
        sb.append(", sumDealAmount=").append(sumDealAmount);
        sb.append(", sumRechargeAmount=").append(sumRechargeAmount);
        sb.append(", sumProfit=").append(sumProfit);
        sb.append(", sumWitAmount=").append(sumWitAmount);
        sb.append(", sumAgentProfit=").append(sumAgentProfit);
        sb.append(", sumOrderCount=").append(sumOrderCount);
        sb.append(", todayWitAmount=").append(todayWitAmount);
        sb.append(", todayDealAmount=").append(todayDealAmount);
        sb.append(", todayProfit=").append(todayProfit);
        sb.append(", todayOrderCount=").append(todayOrderCount);
        sb.append(", todayAgentProfit=").append(todayAgentProfit);
        sb.append(", userType=").append(userType);
        sb.append(", agent=").append(agent);
        sb.append(", isAgent=").append(isAgent);
        sb.append(", createTime=").append(createTime);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", currency=").append(currency);
        sb.append(", quota=").append(quota);
        sb.append(", sumOtherWitAmount=").append(sumOtherWitAmount);
        sb.append(", todayOtherWitAmount=").append(todayOtherWitAmount);
        sb.append(", deposit=").append(deposit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}