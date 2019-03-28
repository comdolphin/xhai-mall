package com.xhai.mall.model;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {
    private Long id;

    /**
     * 已登录用户ID
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 日志类型（系统操作日志，用户访问日志，异常记录日志）
     *
     * @mbggenerated
     */
    private String type;

    /**
     * 日志级别
     *
     * @mbggenerated
     */
    private String logLevel;

    /**
     * 日志内容（业务操作）
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 请求参数（业务操作）
     *
     * @mbggenerated
     */
    private String params;

    /**
     * 爬虫类型（当访问者被鉴定为爬虫时该字段表示爬虫的类型）
     *
     * @mbggenerated
     */
    private String spiderType;

    /**
     * 操作用户的ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * 操作用户的user_agent
     *
     * @mbggenerated
     */
    private String ua;

    /**
     * 评论时的系统类型
     *
     * @mbggenerated
     */
    private String os;

    /**
     * 评论时的浏览器类型
     *
     * @mbggenerated
     */
    private String browser;

    /**
     * 请求的路径
     *
     * @mbggenerated
     */
    private String requestUrl;

    /**
     * 请求来源地址
     *
     * @mbggenerated
     */
    private String referer;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getSpiderType() {
        return spiderType;
    }

    public void setSpiderType(String spiderType) {
        this.spiderType = spiderType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
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
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", logLevel=").append(logLevel);
        sb.append(", content=").append(content);
        sb.append(", params=").append(params);
        sb.append(", spiderType=").append(spiderType);
        sb.append(", ip=").append(ip);
        sb.append(", ua=").append(ua);
        sb.append(", os=").append(os);
        sb.append(", browser=").append(browser);
        sb.append(", requestUrl=").append(requestUrl);
        sb.append(", referer=").append(referer);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}