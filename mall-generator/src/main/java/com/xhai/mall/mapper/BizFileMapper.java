package com.xhai.mall.mapper;

import com.xhai.mall.model.BizFile;
import com.xhai.mall.model.BizFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizFileMapper {
    int countByExample(BizFileExample example);

    int deleteByExample(BizFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizFile record);

    int insertSelective(BizFile record);

    List<BizFile> selectByExample(BizFileExample example);

    BizFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizFile record, @Param("example") BizFileExample example);

    int updateByExample(@Param("record") BizFile record, @Param("example") BizFileExample example);

    int updateByPrimaryKeySelective(BizFile record);

    int updateByPrimaryKey(BizFile record);
}