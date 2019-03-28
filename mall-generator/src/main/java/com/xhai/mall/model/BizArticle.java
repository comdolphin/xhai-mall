package com.xhai.mall.model;

import java.io.Serializable;
import java.util.Date;

public class BizArticle implements Serializable {
    private Long id;

    /**
     * 文章标题
     *
     *
     */
    private String title;

    /**
     * 用户ID
     *
     *
     */
    private Long userId;

    /**
     * 文章封面图片
     *
     *
     */
    private String coverImage;

    /**
     * 文章专属二维码地址
     *
     *
     */
    private String qrcodePath;

    /**
     *
     */

    private Boolean isMarkdown;

    /**
     * 是否置顶
     *
     *
     */
    private Boolean top;

    /**
     * 类型
     *
     *
     */
    private Long typeId;

    /**
     * 状态
     *
     *
     */
    private Boolean status;

    /**
     * 是否推荐
     *
     *
     */
    private Boolean recommended;

    /**
     * 是否原创
     *
     *
     */
    private Boolean original;

    /**
     * 文章简介，最多200字
     *
     *
     */
    private String description;

    /**
     * 文章关键字，优化搜索
     *
     *
     */
    private String keywords;

    /**
     * 是否开启评论
     *
     *
     */
    private Boolean comment;

    /**
     * 添加时间
     *
     *
     */
    private Date createTime;

    /**
     * 更新时间
     *
     *
     */
    private Date updateTime;

    /**
     * 文章内容
     *
     *
     */
    private String content;

    /**
     * markdown版的文章内容
     *
     *
     */
    private String contentMd;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getQrcodePath() {
        return qrcodePath;
    }

    public void setQrcodePath(String qrcodePath) {
        this.qrcodePath = qrcodePath;
    }

    public Boolean getIsMarkdown() {
        return isMarkdown;
    }

    public void setIsMarkdown(Boolean isMarkdown) {
        this.isMarkdown = isMarkdown;
    }

    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getRecommended() {
        return recommended;
    }

    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    public Boolean getOriginal() {
        return original;
    }

    public void setOriginal(Boolean original) {
        this.original = original;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Boolean getComment() {
        return comment;
    }

    public void setComment(Boolean comment) {
        this.comment = comment;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentMd() {
        return contentMd;
    }

    public void setContentMd(String contentMd) {
        this.contentMd = contentMd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", userId=").append(userId);
        sb.append(", coverImage=").append(coverImage);
        sb.append(", qrcodePath=").append(qrcodePath);
        sb.append(", isMarkdown=").append(isMarkdown);
        sb.append(", top=").append(top);
        sb.append(", typeId=").append(typeId);
        sb.append(", status=").append(status);
        sb.append(", recommended=").append(recommended);
        sb.append(", original=").append(original);
        sb.append(", description=").append(description);
        sb.append(", keywords=").append(keywords);
        sb.append(", comment=").append(comment);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", content=").append(content);
        sb.append(", contentMd=").append(contentMd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}