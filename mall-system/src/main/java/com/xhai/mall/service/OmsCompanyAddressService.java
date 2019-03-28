package com.xhai.mall.service;

import com.xhai.mall.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管Service
 * @Author:dolphin
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
