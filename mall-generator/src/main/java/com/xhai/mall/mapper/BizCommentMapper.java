package com.xhai.mall.mapper;

import com.xhai.mall.model.BizComment;
import com.xhai.mall.model.BizCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizCommentMapper {
    int countByExample(BizCommentExample example);

    int deleteByExample(BizCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizComment record);

    int insertSelective(BizComment record);

    List<BizComment> selectByExample(BizCommentExample example);

    BizComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizComment record, @Param("example") BizCommentExample example);

    int updateByExample(@Param("record") BizComment record, @Param("example") BizCommentExample example);

    int updateByPrimaryKeySelective(BizComment record);

    int updateByPrimaryKey(BizComment record);
}