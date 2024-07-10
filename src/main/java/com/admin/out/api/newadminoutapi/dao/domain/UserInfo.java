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
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id【登录账号】
     */
    private String userid;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * shiro加密秘钥【登录】
     */
    private String password;

    /**
     * shiro加密秘钥【资金】【商户则为交易秘钥】
     */
    private String paypasword;

    /**
     * 秘钥加密盐值【加密算法】
     */
    private String salt;

    /**
     * 用户类型,商户1 码商2
     */
    private Integer usertype;

    /**
     * 当前用户总开关 1开启0关闭【码商商户后台控制,该值只能在后台显示】
     */
    private Integer switchs;

    /**
     * 组群备注,如果为渠道账户则为渠道商户号
     */
    private String usernode;

    /**
     * 邮箱【修改账号秘钥邮件发送地址】
     */
    private String email;

    /**
     * 代理商id【如果存在代理商则存在数据,如果不存在代理商则为null】
     */
    private String agent;

    /**
     * 是否为代理商:1代理商2普通码商【分润结算类型看用户类型userType】
     */
    private String isagent;

    /**
     * 信用等级为默认为100,掉单一次,或者出现故障一次减分0.001分,可人为加分
     */
    private BigDecimal credit;

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以交易】
     */
    private Integer receiveorderstate;

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以代付】
     */
    private Integer remitorderstate;

    /**
     * QQ联系方式
     */
    private String qq;

    /**
     * 小飞机
     */
    private String telegram;

    /**
     * skype
     */
    private String skype;

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
     * 商户私钥
     */
    private String privatekey;

    /**
     * 商户公钥
     */
    private String publickey;

    /**
     * 最小金额
     */
    private BigDecimal minamount;

    /**
     * 最大金额
     */
    private BigDecimal maxamount;

    /**
     * 总金额限制
     */
    private BigDecimal totalamount;

    /**
     * 下单次数
     */
    private Integer timestotal;

    /**
     * 限制时间-开始时间
     */
    private String starttime;

    /**
     * 限制时间-结束时间
     */
    private String endtime;

    /**
     * 代付ip
     */
    private String witip;

    /**
     * 供应队列code
     */
    private String queuelist;

    /**
     * 交易IP设置【码商不填次地址无法交易】
     */
    private String dealurl;

    /**
     * 码商充值,商户充值，卡商供应标识
     */
    private String qrrechargelist;

    /**
     * 0:手动代付;1:自动代付
     */
    private Integer autowit;

    /**
     * 是否开通反查接口 1  开通  0 不开通
     */
    private Integer enterwitopen;


    /**
     * 
     */
    private String balanceurl;

    /**
     * 自动出款 0 关闭 1 开启
     */
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
    public String getUserid() {
        return userid;
    }

    /**
     * 用户id【登录账号】
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 用户昵称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户昵称
     */
    public void setUsername(String username) {
        this.username = username;
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
    public String getPaypasword() {
        return paypasword;
    }

    /**
     * shiro加密秘钥【资金】【商户则为交易秘钥】
     */
    public void setPaypasword(String paypasword) {
        this.paypasword = paypasword;
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
    public Integer getUsertype() {
        return usertype;
    }

    /**
     * 用户类型,商户1 码商2
     */
    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
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
    public String getUsernode() {
        return usernode;
    }

    /**
     * 组群备注,如果为渠道账户则为渠道商户号
     */
    public void setUsernode(String usernode) {
        this.usernode = usernode;
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
    public String getIsagent() {
        return isagent;
    }

    /**
     * 是否为代理商:1代理商2普通码商【分润结算类型看用户类型userType】
     */
    public void setIsagent(String isagent) {
        this.isagent = isagent;
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
    public Integer getReceiveorderstate() {
        return receiveorderstate;
    }

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以交易】
     */
    public void setReceiveorderstate(Integer receiveorderstate) {
        this.receiveorderstate = receiveorderstate;
    }

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以代付】
     */
    public Integer getRemitorderstate() {
        return remitorderstate;
    }

    /**
     * 是否处于入款接单状态 1 接单 2 暂停接单【下游商户则为是否可以代付】
     */
    public void setRemitorderstate(Integer remitorderstate) {
        this.remitorderstate = remitorderstate;
    }

    /**
     * QQ联系方式
     */
    public String getQq() {
        return qq;
    }

    /**
     * QQ联系方式
     */
    public void setQq(String qq) {
        this.qq = qq;
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
     * 商户私钥
     */
    public String getPrivatekey() {
        return privatekey;
    }

    /**
     * 商户私钥
     */
    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    /**
     * 商户公钥
     */
    public String getPublickey() {
        return publickey;
    }

    /**
     * 商户公钥
     */
    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    /**
     * 最小金额
     */
    public BigDecimal getMinamount() {
        return minamount;
    }

    /**
     * 最小金额
     */
    public void setMinamount(BigDecimal minamount) {
        this.minamount = minamount;
    }

    /**
     * 最大金额
     */
    public BigDecimal getMaxamount() {
        return maxamount;
    }

    /**
     * 最大金额
     */
    public void setMaxamount(BigDecimal maxamount) {
        this.maxamount = maxamount;
    }

    /**
     * 总金额限制
     */
    public BigDecimal getTotalamount() {
        return totalamount;
    }

    /**
     * 总金额限制
     */
    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * 下单次数
     */
    public Integer getTimestotal() {
        return timestotal;
    }

    /**
     * 下单次数
     */
    public void setTimestotal(Integer timestotal) {
        this.timestotal = timestotal;
    }

    /**
     * 限制时间-开始时间
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * 限制时间-开始时间
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 限制时间-结束时间
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 限制时间-结束时间
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
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
    public String getQueuelist() {
        return queuelist;
    }

    /**
     * 供应队列code
     */
    public void setQueuelist(String queuelist) {
        this.queuelist = queuelist;
    }

    /**
     * 交易IP设置【码商不填次地址无法交易】
     */
    public String getDealurl() {
        return dealurl;
    }

    /**
     * 交易IP设置【码商不填次地址无法交易】
     */
    public void setDealurl(String dealurl) {
        this.dealurl = dealurl;
    }

    /**
     * 码商充值,商户充值，卡商供应标识
     */
    public String getQrrechargelist() {
        return qrrechargelist;
    }

    /**
     * 码商充值,商户充值，卡商供应标识
     */
    public void setQrrechargelist(String qrrechargelist) {
        this.qrrechargelist = qrrechargelist;
    }

    /**
     * 0:手动代付;1:自动代付
     */
    public Integer getAutowit() {
        return autowit;
    }

    /**
     * 0:手动代付;1:自动代付
     */
    public void setAutowit(Integer autowit) {
        this.autowit = autowit;
    }

    /**
     * 是否开通反查接口 1  开通  0 不开通
     */
    public Integer getEnterwitopen() {
        return enterwitopen;
    }

    /**
     * 是否开通反查接口 1  开通  0 不开通
     */
    public void setEnterwitopen(Integer enterwitopen) {
        this.enterwitopen = enterwitopen;
    }




    /**
     * 
     */
    public String getBalanceurl() {
        return balanceurl;
    }

    /**
     * 
     */
    public void setBalanceurl(String balanceurl) {
        this.balanceurl = balanceurl;
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
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPaypasword() == null ? other.getPaypasword() == null : this.getPaypasword().equals(other.getPaypasword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getUsertype() == null ? other.getUsertype() == null : this.getUsertype().equals(other.getUsertype()))
            && (this.getSwitchs() == null ? other.getSwitchs() == null : this.getSwitchs().equals(other.getSwitchs()))
            && (this.getUsernode() == null ? other.getUsernode() == null : this.getUsernode().equals(other.getUsernode()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAgent() == null ? other.getAgent() == null : this.getAgent().equals(other.getAgent()))
            && (this.getIsagent() == null ? other.getIsagent() == null : this.getIsagent().equals(other.getIsagent()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getReceiveorderstate() == null ? other.getReceiveorderstate() == null : this.getReceiveorderstate().equals(other.getReceiveorderstate()))
            && (this.getRemitorderstate() == null ? other.getRemitorderstate() == null : this.getRemitorderstate().equals(other.getRemitorderstate()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getTelegram() == null ? other.getTelegram() == null : this.getTelegram().equals(other.getTelegram()))
            && (this.getSkype() == null ? other.getSkype() == null : this.getSkype().equals(other.getSkype()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getSubmittime() == null ? other.getSubmittime() == null : this.getSubmittime().equals(other.getSubmittime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPrivatekey() == null ? other.getPrivatekey() == null : this.getPrivatekey().equals(other.getPrivatekey()))
            && (this.getPublickey() == null ? other.getPublickey() == null : this.getPublickey().equals(other.getPublickey()))
            && (this.getMinamount() == null ? other.getMinamount() == null : this.getMinamount().equals(other.getMinamount()))
            && (this.getMaxamount() == null ? other.getMaxamount() == null : this.getMaxamount().equals(other.getMaxamount()))
            && (this.getTotalamount() == null ? other.getTotalamount() == null : this.getTotalamount().equals(other.getTotalamount()))
            && (this.getTimestotal() == null ? other.getTimestotal() == null : this.getTimestotal().equals(other.getTimestotal()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getWitip() == null ? other.getWitip() == null : this.getWitip().equals(other.getWitip()))
            && (this.getQueuelist() == null ? other.getQueuelist() == null : this.getQueuelist().equals(other.getQueuelist()))
            && (this.getDealurl() == null ? other.getDealurl() == null : this.getDealurl().equals(other.getDealurl()))
            && (this.getQrrechargelist() == null ? other.getQrrechargelist() == null : this.getQrrechargelist().equals(other.getQrrechargelist()))
            && (this.getAutowit() == null ? other.getAutowit() == null : this.getAutowit().equals(other.getAutowit()))
            && (this.getEnterwitopen() == null ? other.getEnterwitopen() == null : this.getEnterwitopen().equals(other.getEnterwitopen()))
            && (this.getBalanceurl() == null ? other.getBalanceurl() == null : this.getBalanceurl().equals(other.getBalanceurl()))
            && (this.getAutowitstatus() == null ? other.getAutowitstatus() == null : this.getAutowitstatus().equals(other.getAutowitstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPaypasword() == null) ? 0 : getPaypasword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getUsertype() == null) ? 0 : getUsertype().hashCode());
        result = prime * result + ((getSwitchs() == null) ? 0 : getSwitchs().hashCode());
        result = prime * result + ((getUsernode() == null) ? 0 : getUsernode().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAgent() == null) ? 0 : getAgent().hashCode());
        result = prime * result + ((getIsagent() == null) ? 0 : getIsagent().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getReceiveorderstate() == null) ? 0 : getReceiveorderstate().hashCode());
        result = prime * result + ((getRemitorderstate() == null) ? 0 : getRemitorderstate().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getTelegram() == null) ? 0 : getTelegram().hashCode());
        result = prime * result + ((getSkype() == null) ? 0 : getSkype().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getSubmittime() == null) ? 0 : getSubmittime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPrivatekey() == null) ? 0 : getPrivatekey().hashCode());
        result = prime * result + ((getPublickey() == null) ? 0 : getPublickey().hashCode());
        result = prime * result + ((getMinamount() == null) ? 0 : getMinamount().hashCode());
        result = prime * result + ((getMaxamount() == null) ? 0 : getMaxamount().hashCode());
        result = prime * result + ((getTotalamount() == null) ? 0 : getTotalamount().hashCode());
        result = prime * result + ((getTimestotal() == null) ? 0 : getTimestotal().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getWitip() == null) ? 0 : getWitip().hashCode());
        result = prime * result + ((getQueuelist() == null) ? 0 : getQueuelist().hashCode());
        result = prime * result + ((getDealurl() == null) ? 0 : getDealurl().hashCode());
        result = prime * result + ((getQrrechargelist() == null) ? 0 : getQrrechargelist().hashCode());
        result = prime * result + ((getAutowit() == null) ? 0 : getAutowit().hashCode());
        result = prime * result + ((getEnterwitopen() == null) ? 0 : getEnterwitopen().hashCode());
        result = prime * result + ((getBalanceurl() == null) ? 0 : getBalanceurl().hashCode());
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
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", paypasword=").append(paypasword);
        sb.append(", salt=").append(salt);
        sb.append(", usertype=").append(usertype);
        sb.append(", switchs=").append(switchs);
        sb.append(", usernode=").append(usernode);
        sb.append(", email=").append(email);
        sb.append(", agent=").append(agent);
        sb.append(", isagent=").append(isagent);
        sb.append(", credit=").append(credit);
        sb.append(", receiveorderstate=").append(receiveorderstate);
        sb.append(", remitorderstate=").append(remitorderstate);
        sb.append(", qq=").append(qq);
        sb.append(", telegram=").append(telegram);
        sb.append(", skype=").append(skype);
        sb.append(", createtime=").append(createtime);
        sb.append(", submittime=").append(submittime);
        sb.append(", status=").append(status);
        sb.append(", privatekey=").append(privatekey);
        sb.append(", publickey=").append(publickey);
        sb.append(", minamount=").append(minamount);
        sb.append(", maxamount=").append(maxamount);
        sb.append(", totalamount=").append(totalamount);
        sb.append(", timestotal=").append(timestotal);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", witip=").append(witip);
        sb.append(", queuelist=").append(queuelist);
        sb.append(", dealurl=").append(dealurl);
        sb.append(", qrrechargelist=").append(qrrechargelist);
        sb.append(", autowit=").append(autowit);
        sb.append(", enterwitopen=").append(enterwitopen);
        sb.append(", balanceurl=").append(balanceurl);
        sb.append(", autowitstatus=").append(autowitstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}