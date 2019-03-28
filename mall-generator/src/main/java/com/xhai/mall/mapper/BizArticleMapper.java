package com.xhai.mall.mapper;

import com.xhai.mall.model.BizArticle;
import com.xhai.mall.model.BizArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizArticleMapper {
    int countByExample(BizArticleExample example);

    int deleteByExample(BizArticleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizArticle record);

    int insertSelective(BizArticle record);

    List<BizArticle> selectByExampleWithBLOBs(BizArticleExample example);

    List<BizArticle> selectByExample(BizArticleExample example);

    BizArticle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizArticle record, @Param("example") BizArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") BizArticle record, @Param("example") BizArticleExample example);

    int updateByExample(@Param("record") BizArticle record, @Param("example") BizArticleExample example);

    int updateByPrimaryKeySelective(BizArticle record);

    int updateByPrimaryKeyWithBLOBs(BizArticle record);

    int updateByPrimaryKey(BizArticle record);
}