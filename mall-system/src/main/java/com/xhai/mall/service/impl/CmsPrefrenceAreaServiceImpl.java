package com.xhai.mall.service.impl;

import com.xhai.mall.mapper.CmsPrefrenceAreaMapper;
import com.xhai.mall.model.CmsPrefrenceArea;
import com.xhai.mall.model.CmsPrefrenceAreaExample;
import com.xhai.mall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * @Author:dolphin
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
