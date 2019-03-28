package com.xhai.mall.mapper;

import com.xhai.mall.model.BizArticleTags;
import com.xhai.mall.model.BizArticleTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizArticleTagsMapper {
    int countByExample(BizArticleTagsExample example);

    int deleteByExample(BizArticleTagsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizArticleTags record);

    int insertSelective(BizArticleTags record);

    List<BizArticleTags> selectByExample(BizArticleTagsExample example);

    BizArticleTags selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizArticleTags record, @Param("example") BizArticleTagsExample example);

    int updateByExample(@Param("record") BizArticleTags record, @Param("example") BizArticleTagsExample example);

    int updateByPrimaryKeySelective(BizArticleTags record);

    int updateByPrimaryKey(BizArticleTags record);
}