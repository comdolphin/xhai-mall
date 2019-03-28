package com.xhai.mall.mapper;

import com.xhai.mall.model.BizTags;
import com.xhai.mall.model.BizTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizTagsMapper {
    int countByExample(BizTagsExample example);

    int deleteByExample(BizTagsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizTags record);

    int insertSelective(BizTags record);

    List<BizTags> selectByExample(BizTagsExample example);

    BizTags selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizTags record, @Param("example") BizTagsExample example);

    int updateByExample(@Param("record") BizTags record, @Param("example") BizTagsExample example);

    int updateByPrimaryKeySelective(BizTags record);

    int updateByPrimaryKey(BizTags record);
}