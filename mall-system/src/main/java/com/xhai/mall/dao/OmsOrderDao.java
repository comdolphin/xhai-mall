package com.xhai.mall.dao;

import com.xhai.mall.dto.OmsOrderDeliveryParam;
import com.xhai.mall.dto.OmsOrderDetail;
import com.xhai.mall.dto.OmsOrderQueryParam;
import com.xhai.mall.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单自定义查询Dao
 * @Author:dolphin
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
