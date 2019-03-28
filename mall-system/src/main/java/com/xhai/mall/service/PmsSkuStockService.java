package com.xhai.mall.service;

import com.xhai.mall.model.PmsSkuStock;

import java.util.List;

/**
 * sku商品库存管理Service
 * @Author:dolphin
 */
public interface PmsSkuStockService {
    /**
     * 根据产品id和skuCode模糊搜索
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * 批量更新商品库存信息
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
