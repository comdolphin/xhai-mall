package com.xhai.mall.mapper;

import com.xhai.mall.model.BizArticleLook;
import com.xhai.mall.model.BizArticleLookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizArticleLookMapper {
    int countByExample(BizArticleLookExample example);

    int deleteByExample(BizArticleLookExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizArticleLook record);

    int insertSelective(BizArticleLook record);

    List<BizArticleLook> selectByExample(BizArticleLookExample example);

    BizArticleLook selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizArticleLook record, @Param("example") BizArticleLookExample example);

    int updateByExample(@Param("record") BizArticleLook record, @Param("example") BizArticleLookExample example);

    int updateByPrimaryKeySelective(BizArticleLook record);

    int updateByPrimaryKey(BizArticleLook record);
}