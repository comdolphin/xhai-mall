package com.xhai.mall.model;

import java.io.Serializable;
import java.util.Date;

public class SysUpdateRecorde implements Serializable {
    private Long id;

    /**
     * 更新版本
     *
     * @mbggenerated
     */
    private String version;

    /**
     * 更新记录备注
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 项目更新时间
     *
     * @mbggenerated
     */
    private Date recordeTime;

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRecordeTime() {
        return recordeTime;
    }

    public void setRecordeTime(Date recordeTime) {
        this.recordeTime = recordeTime;
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
        sb.append(", version=").append(version);
        sb.append(", description=").append(description);
        sb.append(", recordeTime=").append(recordeTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}