package com.xhai.mall.dto;

import com.xhai.mall.model.OmsOrder;
import com.xhai.mall.model.OmsOrderItem;
import com.xhai.mall.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * @Author:dolphin
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
