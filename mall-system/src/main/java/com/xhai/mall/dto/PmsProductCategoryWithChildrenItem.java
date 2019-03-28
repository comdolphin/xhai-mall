package com.xhai.mall.dto;

import com.xhai.mall.model.PmsProductCategory;

import java.util.List;

/**
 * @Author:dolphin
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}
