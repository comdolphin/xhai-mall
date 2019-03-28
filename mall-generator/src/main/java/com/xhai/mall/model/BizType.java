package com.xhai.mall.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Transient;

public class BizType implements Serializable {
    private Long id;

    private Long pid;

    /**
     * 文章类型名
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 类型介绍
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * 图标
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * 是否可用
     *
     * @mbggenerated
     */
    private Boolean available;

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

    /**
     * 父级
     */
    @Transient
    private BizType parent;

    @Transient
    private List<BizType> nodes;

    public List<BizType> getNodes() {
        return nodes;
    }

    public void setNodes(List<BizType> nodes) {
        this.nodes = nodes;
    }

    public BizType getParent() {
        return parent;
    }

    public void setParent(BizType parent) {
        this.parent = parent;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
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
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", available=").append(available);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}