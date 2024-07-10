package com.admin.out.api.newadminoutapi.dao.domain;

import com.admin.out.api.newadminoutapi.dao.service.UserFundService;
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
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 账户id【登录账户】
     */
    private String userid;

    /**
     * 账户昵称【登录账户名】
     */
    private String username;

    /**
     * 现金账户【当前可取现】
     */
    private BigDecimal cashbalance;

    /**
     * 充值点数
     */
    private BigDecimal rechargenumber;

    /**
     * 冻结账户
     */
    private BigDecimal freezebalance;

    /**
     * 可取现账户金额【码商账户余额=现金账户+充值点数-冻结金额】
     */
    private BigDecimal accountbalance;

    /**
     * 累计交易额
     */
    private BigDecimal sumdealamount;

    /**
     * 累计充值金额【充值成功时统计记录】
     */
    private BigDecimal sumrechargeamount;

    /**
     * 累计利润金额
     */
    private BigDecimal sumprofit;

    /**
     * 累计代付金额
     */
    private BigDecimal sumwitamount;

    /**
     * 累计代理商利润【如果当前账户为商户则该数据为0】
     */
    private BigDecimal sumagentprofit;

    /**
     * 累计接单笔数
     */
    private Integer sumordercount;

    /**
     * 当日代付金额
     */
    private Long todaywitamount;

    /**
     * 当日接单金额
     */
    private BigDecimal todaydealamount;

    /**
     * 当日接单利润【代理利润+接单利润=当日利润】
     */
    private BigDecimal todayprofit;

    /**
     * 当日接单笔数
     */
    private Integer todayordercount;

    /**
     * 当日代理商利润【如果当前账户为商户则该数据为0】
     */
    private BigDecimal todayagentprofit;

    /**
     * 用户类型,商户1 码商2渠道商户3
     */
    private String usertype;

    /**
     * 代理商id【如果存在代理商则存在数据,如果不存在代理商则为null】
     */
    private String agent;

    /**
     * 是否为代理商:1代理商2普通码商3渠道商【分润结算类型看用户类型userType】
     */
    private String isagent;

    /**
     * 数据创建时间
     */
    private Date createtime;

    /**
     * 最后一次数据修改时间
     */
    private Date submittime;

    /**
     * 数据是否可用:1数据可用2数据无用
     */
    private Integer status;

    /**
     * 数据版本号【数据修改锁】
     */
    private Integer version;

    /**
     * 货币类型
     */
    private String currency;

    /**
     * 授权额度
     */
    private BigDecimal quota;

    /**
     * 卡商接单历史
     */
    private BigDecimal sumotherwitamount;

    /**
     * 卡商当日接单历史
     */
    private BigDecimal todayotherwitamount;

    /**
     * 
     */
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
    public String getUserid() {
        return userid;
    }

    /**
     * 账户id【登录账户】
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 账户昵称【登录账户名】
     */
    public String getUsername() {
        return username;
    }

    /**
     * 账户昵称【登录账户名】
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 现金账户【当前可取现】
     */
    public BigDecimal getCashbalance() {
        return cashbalance;
    }

    /**
     * 现金账户【当前可取现】
     */
    public void setCashbalance(BigDecimal cashbalance) {
        this.cashbalance = cashbalance;
    }

    /**
     * 充值点数
     */
    public BigDecimal getRechargenumber() {
        return rechargenumber;
    }

    /**
     * 充值点数
     */
    public void setRechargenumber(BigDecimal rechargenumber) {
        this.rechargenumber = rechargenumber;
    }

    /**
     * 冻结账户
     */
    public BigDecimal getFreezebalance() {
        return freezebalance;
    }

    /**
     * 冻结账户
     */
    public void setFreezebalance(BigDecimal freezebalance) {
        this.freezebalance = freezebalance;
    }

    /**
     * 可取现账户金额【码商账户余额=现金账户+充值点数-冻结金额】
     */
    public BigDecimal getAccountbalance() {
        return accountbalance;
    }

    /**
     * 可取现账户金额【码商账户余额=现金账户+充值点数-冻结金额】
     */
    public void setAccountbalance(BigDecimal accountbalance) {
        this.accountbalance = accountbalance;
    }

    /**
     * 累计交易额
     */
    public BigDecimal getSumdealamount() {
        return sumdealamount;
    }

    /**
     * 累计交易额
     */
    public void setSumdealamount(BigDecimal sumdealamount) {
        this.sumdealamount = sumdealamount;
    }

    /**
     * 累计充值金额【充值成功时统计记录】
     */
    public BigDecimal getSumrechargeamount() {
        return sumrechargeamount;
    }

    /**
     * 累计充值金额【充值成功时统计记录】
     */
    public void setSumrechargeamount(BigDecimal sumrechargeamount) {
        this.sumrechargeamount = sumrechargeamount;
    }

    /**
     * 累计利润金额
     */
    public BigDecimal getSumprofit() {
        return sumprofit;
    }

    /**
     * 累计利润金额
     */
    public void setSumprofit(BigDecimal sumprofit) {
        this.sumprofit = sumprofit;
    }

    /**
     * 累计代付金额
     */
    public BigDecimal getSumwitamount() {
        return sumwitamount;
    }

    /**
     * 累计代付金额
     */
    public void setSumwitamount(BigDecimal sumwitamount) {
        this.sumwitamount = sumwitamount;
    }

    /**
     * 累计代理商利润【如果当前账户为商户则该数据为0】
     */
    public BigDecimal getSumagentprofit() {
        return sumagentprofit;
    }

    /**
     * 累计代理商利润【如果当前账户为商户则该数据为0】
     */
    public void setSumagentprofit(BigDecimal sumagentprofit) {
        this.sumagentprofit = sumagentprofit;
    }

    /**
     * 累计接单笔数
     */
    public Integer getSumordercount() {
        return sumordercount;
    }

    /**
     * 累计接单笔数
     */
    public void setSumordercount(Integer sumordercount) {
        this.sumordercount = sumordercount;
    }

    /**
     * 当日代付金额
     */
    public Long getTodaywitamount() {
        return todaywitamount;
    }

    /**
     * 当日代付金额
     */
    public void setTodaywitamount(Long todaywitamount) {
        this.todaywitamount = todaywitamount;
    }

    /**
     * 当日接单金额
     */
    public BigDecimal getTodaydealamount() {
        return todaydealamount;
    }

    /**
     * 当日接单金额
     */
    public void setTodaydealamount(BigDecimal todaydealamount) {
        this.todaydealamount = todaydealamount;
    }

    /**
     * 当日接单利润【代理利润+接单利润=当日利润】
     */
    public BigDecimal getTodayprofit() {
        return todayprofit;
    }

    /**
     * 当日接单利润【代理利润+接单利润=当日利润】
     */
    public void setTodayprofit(BigDecimal todayprofit) {
        this.todayprofit = todayprofit;
    }

    /**
     * 当日接单笔数
     */
    public Integer getTodayordercount() {
        return todayordercount;
    }

    /**
     * 当日接单笔数
     */
    public void setTodayordercount(Integer todayordercount) {
        this.todayordercount = todayordercount;
    }

    /**
     * 当日代理商利润【如果当前账户为商户则该数据为0】
     */
    public BigDecimal getTodayagentprofit() {
        return todayagentprofit;
    }

    /**
     * 当日代理商利润【如果当前账户为商户则该数据为0】
     */
    public void setTodayagentprofit(BigDecimal todayagentprofit) {
        this.todayagentprofit = todayagentprofit;
    }

    /**
     * 用户类型,商户1 码商2渠道商户3
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * 用户类型,商户1 码商2渠道商户3
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
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
    public String getIsagent() {
        return isagent;
    }

    /**
     * 是否为代理商:1代理商2普通码商3渠道商【分润结算类型看用户类型userType】
     */
    public void setIsagent(String isagent) {
        this.isagent = isagent;
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
     * 最后一次数据修改时间
     */
    public Date getSubmittime() {
        return submittime;
    }

    /**
     * 最后一次数据修改时间
     */
    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
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
    public BigDecimal getSumotherwitamount() {
        return sumotherwitamount;
    }

    /**
     * 卡商接单历史
     */
    public void setSumotherwitamount(BigDecimal sumotherwitamount) {
        this.sumotherwitamount = sumotherwitamount;
    }

    /**
     * 卡商当日接单历史
     */
    public BigDecimal getTodayotherwitamount() {
        return todayotherwitamount;
    }

    /**
     * 卡商当日接单历史
     */
    public void setTodayotherwitamount(BigDecimal todayotherwitamount) {
        this.todayotherwitamount = todayotherwitamount;
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
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getCashbalance() == null ? other.getCashbalance() == null : this.getCashbalance().equals(other.getCashbalance()))
            && (this.getRechargenumber() == null ? other.getRechargenumber() == null : this.getRechargenumber().equals(other.getRechargenumber()))
            && (this.getFreezebalance() == null ? other.getFreezebalance() == null : this.getFreezebalance().equals(other.getFreezebalance()))
            && (this.getAccountbalance() == null ? other.getAccountbalance() == null : this.getAccountbalance().equals(other.getAccountbalance()))
            && (this.getSumdealamount() == null ? other.getSumdealamount() == null : this.getSumdealamount().equals(other.getSumdealamount()))
            && (this.getSumrechargeamount() == null ? other.getSumrechargeamount() == null : this.getSumrechargeamount().equals(other.getSumrechargeamount()))
            && (this.getSumprofit() == null ? other.getSumprofit() == null : this.getSumprofit().equals(other.getSumprofit()))
            && (this.getSumwitamount() == null ? other.getSumwitamount() == null : this.getSumwitamount().equals(other.getSumwitamount()))
            && (this.getSumagentprofit() == null ? other.getSumagentprofit() == null : this.getSumagentprofit().equals(other.getSumagentprofit()))
            && (this.getSumordercount() == null ? other.getSumordercount() == null : this.getSumordercount().equals(other.getSumordercount()))
            && (this.getTodaywitamount() == null ? other.getTodaywitamount() == null : this.getTodaywitamount().equals(other.getTodaywitamount()))
            && (this.getTodaydealamount() == null ? other.getTodaydealamount() == null : this.getTodaydealamount().equals(other.getTodaydealamount()))
            && (this.getTodayprofit() == null ? other.getTodayprofit() == null : this.getTodayprofit().equals(other.getTodayprofit()))
            && (this.getTodayordercount() == null ? other.getTodayordercount() == null : this.getTodayordercount().equals(other.getTodayordercount()))
            && (this.getTodayagentprofit() == null ? other.getTodayagentprofit() == null : this.getTodayagentprofit().equals(other.getTodayagentprofit()))
            && (this.getUsertype() == null ? other.getUsertype() == null : this.getUsertype().equals(other.getUsertype()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()))
            && (this.getIsagent() == null ? other.getIsagent() == null : this.getIsagent().equals(other.getIsagent()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getSubmittime() == null ? other.getSubmittime() == null : this.getSubmittime().equals(other.getSubmittime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getQuota() == null ? other.getQuota() == null : this.getQuota().equals(other.getQuota()))
            && (this.getSumotherwitamount() == null ? other.getSumotherwitamount() == null : this.getSumotherwitamount().equals(other.getSumotherwitamount()))
            && (this.getTodayotherwitamount() == null ? other.getTodayotherwitamount() == null : this.getTodayotherwitamount().equals(other.getTodayotherwitamount()))
            && (this.getDeposit() == null ? other.getDeposit() == null : this.getDeposit().equals(other.getDeposit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getCashbalance() == null) ? 0 : getCashbalance().hashCode());
        result = prime * result + ((getRechargenumber() == null) ? 0 : getRechargenumber().hashCode());
        result = prime * result + ((getFreezebalance() == null) ? 0 : getFreezebalance().hashCode());
        result = prime * result + ((getAccountbalance() == null) ? 0 : getAccountbalance().hashCode());
        result = prime * result + ((getSumdealamount() == null) ? 0 : getSumdealamount().hashCode());
        result = prime * result + ((getSumrechargeamount() == null) ? 0 : getSumrechargeamount().hashCode());
        result = prime * result + ((getSumprofit() == null) ? 0 : getSumprofit().hashCode());
        result = prime * result + ((getSumwitamount() == null) ? 0 : getSumwitamount().hashCode());
        result = prime * result + ((getSumagentprofit() == null) ? 0 : getSumagentprofit().hashCode());
        result = prime * result + ((getSumordercount() == null) ? 0 : getSumordercount().hashCode());
        result = prime * result + ((getTodaywitamount() == null) ? 0 : getTodaywitamount().hashCode());
        result = prime * result + ((getTodaydealamount() == null) ? 0 : getTodaydealamount().hashCode());
        result = prime * result + ((getTodayprofit() == null) ? 0 : getTodayprofit().hashCode());
        result = prime * result + ((getTodayordercount() == null) ? 0 : getTodayordercount().hashCode());
        result = prime * result + ((getTodayagentprofit() == null) ? 0 : getTodayagentprofit().hashCode());
        result = prime * result + ((getUsertype() == null) ? 0 : getUsertype().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        result = prime * result + ((getIsagent() == null) ? 0 : getIsagent().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getSubmittime() == null) ? 0 : getSubmittime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getQuota() == null) ? 0 : getQuota().hashCode());
        result = prime * result + ((getSumotherwitamount() == null) ? 0 : getSumotherwitamount().hashCode());
        result = prime * result + ((getTodayotherwitamount() == null) ? 0 : getTodayotherwitamount().hashCode());
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
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", cashbalance=").append(cashbalance);
        sb.append(", rechargenumber=").append(rechargenumber);
        sb.append(", freezebalance=").append(freezebalance);
        sb.append(", accountbalance=").append(accountbalance);
        sb.append(", sumdealamount=").append(sumdealamount);
        sb.append(", sumrechargeamount=").append(sumrechargeamount);
        sb.append(", sumprofit=").append(sumprofit);
        sb.append(", sumwitamount=").append(sumwitamount);
        sb.append(", sumagentprofit=").append(sumagentprofit);
        sb.append(", sumordercount=").append(sumordercount);
        sb.append(", todaywitamount=").append(todaywitamount);
        sb.append(", todaydealamount=").append(todaydealamount);
        sb.append(", todayprofit=").append(todayprofit);
        sb.append(", todayordercount=").append(todayordercount);
        sb.append(", todayagentprofit=").append(todayagentprofit);
        sb.append(", usertype=").append(usertype);
        sb.append(", agent=").append(agent);
        sb.append(", isagent=").append(isagent);
        sb.append(", createtime=").append(createtime);
        sb.append(", submittime=").append(submittime);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", currency=").append(currency);
        sb.append(", quota=").append(quota);
        sb.append(", sumotherwitamount=").append(sumotherwitamount);
        sb.append(", todayotherwitamount=").append(todayotherwitamount);
        sb.append(", deposit=").append(deposit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}