package com.xhai.mall.mapper;

import com.xhai.mall.model.SysUpdateRecorde;
import com.xhai.mall.model.SysUpdateRecordeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUpdateRecordeMapper {
    int countByExample(SysUpdateRecordeExample example);

    int deleteByExample(SysUpdateRecordeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUpdateRecorde record);

    int insertSelective(SysUpdateRecorde record);

    List<SysUpdateRecorde> selectByExample(SysUpdateRecordeExample example);

    SysUpdateRecorde selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUpdateRecorde record, @Param("example") SysUpdateRecordeExample example);

    int updateByExample(@Param("record") SysUpdateRecorde record, @Param("example") SysUpdateRecordeExample example);

    int updateByPrimaryKeySelective(SysUpdateRecorde record);

    int updateByPrimaryKey(SysUpdateRecorde record);
}