package com.xhai.mall.dao;

import com.xhai.mall.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 优惠券管理自定义查询Dao
 * @Author:dolphin
 */
public interface SmsCouponDao {
    SmsCouponParam getItem(@Param("id") Long id);
}
