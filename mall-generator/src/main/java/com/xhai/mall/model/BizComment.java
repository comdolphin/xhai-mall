package com.xhai.mall.model;

import java.io.Serializable;
import java.util.Date;

public class BizComment implements Serializable {
    private Long id;

    /**
     * 被评论的文章或者页面的ID
     *
     * @mbggenerated
     */
    private Long sid;

    /**
     * 评论人的ID
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 父级评论的id
     *
     * @mbggenerated
     */
    private Long pid;

    /**
     * 评论人的QQ（未登录用户）
     *
     * @mbggenerated
     */
    private String qq;

    /**
     * 评论人的昵称（未登录用户）
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * 评论人的头像地址
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * 评论人的邮箱地址（未登录用户）
     *
     * @mbggenerated
     */
    private String email;

    /**
     * 评论人的网站地址（未登录用户）
     *
     * @mbggenerated
     */
    private String url;

    /**
     * 评论的状态
     *
     * @mbggenerated
     */
    private String status;

    /**
     * 评论时的ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * 经度
     *
     * @mbggenerated
     */
    private String lng;

    /**
     * 纬度
     *
     * @mbggenerated
     */
    private String lat;

    /**
     * 评论时的地址
     *
     * @mbggenerated
     */
    private String address;

    /**
     * 评论时的系统类型
     *
     * @mbggenerated
     */
    private String os;

    /**
     * 评论时的系统的简称
     *
     * @mbggenerated
     */
    private String osShortName;

    /**
     * 评论时的浏览器类型
     *
     * @mbggenerated
     */
    private String browser;

    /**
     * 评论时的浏览器的简称
     *
     * @mbggenerated
     */
    private String browserShortName;

    /**
     * 评论的内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 备注（审核不通过时添加）
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 支持（赞）
     *
     * @mbggenerated
     */
    private Integer support;

    /**
     * 反对（踩）
     *
     * @mbggenerated
     */
    private Integer oppose;

    /**
     * 添加时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsShortName() {
        return osShortName;
    }

    public void setOsShortName(String osShortName) {
        this.osShortName = osShortName;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getBrowserShortName() {
        return browserShortName;
    }

    public void setBrowserShortName(String browserShortName) {
        this.browserShortName = browserShortName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getOppose() {
        return oppose;
    }

    public void setOppose(Integer oppose) {
        this.oppose = oppose;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sid=").append(sid);
        sb.append(", userId=").append(userId);
        sb.append(", pid=").append(pid);
        sb.append(", qq=").append(qq);
        sb.append(", nickname=").append(nickname);
        sb.append(", avatar=").append(avatar);
        sb.append(", email=").append(email);
        sb.append(", url=").append(url);
        sb.append(", status=").append(status);
        sb.append(", ip=").append(ip);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", address=").append(address);
        sb.append(", os=").append(os);
        sb.append(", osShortName=").append(osShortName);
        sb.append(", browser=").append(browser);
        sb.append(", browserShortName=").append(browserShortName);
        sb.append(", content=").append(content);
        sb.append(", remark=").append(remark);
        sb.append(", support=").append(support);
        sb.append(", oppose=").append(oppose);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}