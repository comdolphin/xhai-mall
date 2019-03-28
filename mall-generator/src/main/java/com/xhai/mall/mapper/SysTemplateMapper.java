package com.xhai.mall.mapper;

import com.xhai.mall.model.SysTemplate;
import com.xhai.mall.model.SysTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateMapper {
    int countByExample(SysTemplateExample example);

    int deleteByExample(SysTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysTemplate record);

    int insertSelective(SysTemplate record);

    List<SysTemplate> selectByExampleWithBLOBs(SysTemplateExample example);

    List<SysTemplate> selectByExample(SysTemplateExample example);

    SysTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysTemplate record, @Param("example") SysTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") SysTemplate record, @Param("example") SysTemplateExample example);

    int updateByExample(@Param("record") SysTemplate record, @Param("example") SysTemplateExample example);

    int updateByPrimaryKeySelective(SysTemplate record);

    int updateByPrimaryKeyWithBLOBs(SysTemplate record);

    int updateByPrimaryKey(SysTemplate record);
}