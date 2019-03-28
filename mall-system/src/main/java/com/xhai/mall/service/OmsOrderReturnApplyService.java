package com.xhai.mall.service;

import com.xhai.mall.dto.OmsOrderReturnApplyResult;
import com.xhai.mall.dto.OmsReturnApplyQueryParam;
import com.xhai.mall.dto.OmsUpdateStatusParam;
import com.xhai.mall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 退货申请管理Service
 * @Author:dolphin
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
