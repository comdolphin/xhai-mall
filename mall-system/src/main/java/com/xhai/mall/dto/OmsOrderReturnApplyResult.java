package com.xhai.mall.dto;

import com.xhai.mall.model.OmsCompanyAddress;
import com.xhai.mall.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * @Author:dolphin
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
