package com.xhai.mall.mapper;

import com.xhai.mall.model.BizArticleLove;
import com.xhai.mall.model.BizArticleLoveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizArticleLoveMapper {
    int countByExample(BizArticleLoveExample example);

    int deleteByExample(BizArticleLoveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizArticleLove record);

    int insertSelective(BizArticleLove record);

    List<BizArticleLove> selectByExample(BizArticleLoveExample example);

    BizArticleLove selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizArticleLove record, @Param("example") BizArticleLoveExample example);

    int updateByExample(@Param("record") BizArticleLove record, @Param("example") BizArticleLoveExample example);

    int updateByPrimaryKeySelective(BizArticleLove record);

    int updateByPrimaryKey(BizArticleLove record);
}