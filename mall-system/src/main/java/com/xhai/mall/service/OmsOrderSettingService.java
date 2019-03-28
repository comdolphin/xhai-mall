package com.xhai.mall.service;

import com.xhai.mall.model.OmsOrderSetting;

/**
 * 订单设置Service
 * @Author:dolphin
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
