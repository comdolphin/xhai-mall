package com.xhai.mall.model;

import java.io.Serializable;
import java.util.Date;

public class SysLink implements Serializable {
    private Long id;

    /**
     * 链接地址
     *
     * @mbggenerated
     */
    private String url;

    /**
     * 链接名
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 链接介绍
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 友链站长邮箱
     *
     * @mbggenerated
     */
    private String email;

    /**
     * 友链站长QQ
     *
     * @mbggenerated
     */
    private String qq;

    private String favicon;

    /**
     * 状态
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * 是否首页显示
     *
     * @mbggenerated
     */
    private Boolean homePageDisplay;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 来源：管理员添加、自动申请
     *
     * @mbggenerated
     */
    private String source;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getFavicon() {
        return favicon;
    }

    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getHomePageDisplay() {
        return homePageDisplay;
    }

    public void setHomePageDisplay(Boolean homePageDisplay) {
        this.homePageDisplay = homePageDisplay;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
        sb.append(", url=").append(url);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", email=").append(email);
        sb.append(", qq=").append(qq);
        sb.append(", favicon=").append(favicon);
        sb.append(", status=").append(status);
        sb.append(", homePageDisplay=").append(homePageDisplay);
        sb.append(", remark=").append(remark);
        sb.append(", source=").append(source);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}