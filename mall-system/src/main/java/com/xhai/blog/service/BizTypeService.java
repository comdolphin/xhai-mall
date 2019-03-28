package com.xhai.blog.service;

import com.github.pagehelper.PageInfo;
import com.xhai.blog.dto.Type;
import com.xhai.mall.blog.business.vo.TypeConditionVO;
import com.xhai.mall.blog.framework.object.AbstractService;

import java.util.List;

/**
 * @Author: dolphin
 */
public interface BizTypeService extends AbstractService<Type, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Type> findPageBreakByCondition(TypeConditionVO vo);

    List<Type> listParent();

    List<Type> listTypeForMenu();
}
