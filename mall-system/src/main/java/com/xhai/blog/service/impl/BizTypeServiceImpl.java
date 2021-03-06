package com.xhai.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhai.blog.dto.Type;
import com.xhai.blog.service.BizTypeService;
import com.xhai.mall.blog.business.vo.TypeConditionVO;
import com.xhai.mall.mapper.BizTypeMapper;
import com.xhai.mall.model.BizType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: dolphin
 */
@Service
public class BizTypeServiceImpl implements BizTypeService {
    @Autowired
    private BizTypeMapper bizTypeMapper;

    @Override
    public PageInfo<Type> findPageBreakByCondition(TypeConditionVO vo) {
        PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
        List<BizType> list = bizTypeMapper.findPageBreakByCondition(vo);
        List<Type> boList = getTypes(list);
        if (boList == null) return null;
        PageInfo bean = new PageInfo<BizType>(list);
        bean.setList(boList);
        return bean;
    }

    @Override
    public List<Type> listParent() {
        List<BizType> list = bizTypeMapper.listParent();
        return getTypes(list);
    }

    @Override
    public List<Type> listTypeForMenu() {
        TypeConditionVO vo = new TypeConditionVO();
        vo.setPageNumber(1);
        vo.setPageSize(100);
        PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
        List<BizType> entityList = bizTypeMapper.listTypeForMenu();
        return getTypes(entityList);
    }

    private List<Type> getTypes(List<BizType> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        List<Type> boList = new ArrayList<>();
        for (BizType bizType : list) {
            boList.add(new Type(bizType));
        }
        return boList;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Type insert(Type entity) {
        Assert.notNull(entity, "Type不可为空！");
        entity.setUpdateTime(new Date());
        entity.setCreateTime(new Date());
        bizTypeMapper.insertSelective(entity.getBizType());
        return entity;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean removeByPrimaryKey(Long primaryKey) {
        return bizTypeMapper.deleteByPrimaryKey(primaryKey) > 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateSelective(Type entity) {
        Assert.notNull(entity, "Type不可为空！");
        entity.setUpdateTime(new Date());
        return bizTypeMapper.updateByPrimaryKeySelective(entity.getBizType()) > 0;
    }

    @Override
    public Type getByPrimaryKey(Long primaryKey) {
        Assert.notNull(primaryKey, "PrimaryKey不可为空！");
        BizType entity = bizTypeMapper.selectByPrimaryKey(primaryKey);
        return null == entity ? null : new Type(entity);
    }

    /*@Override
    public List<Type> listAll() {
        TypeConditionVO vo = new TypeConditionVO();
        vo.setPageNumber(1);
        vo.setPageSize(100);
        PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
        List<BizType> entityList = bizTypeMapper.selectAll();

        List<Type> list = getTypes(entityList);
        if (list == null) return null;
        return list;
    }*/
}
