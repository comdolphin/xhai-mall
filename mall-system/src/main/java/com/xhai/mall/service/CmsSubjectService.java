package com.xhai.mall.service;

import com.xhai.mall.model.CmsSubject;

import java.util.List;

/**
 * 商品专题Service
 * @Author:dolphin
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
