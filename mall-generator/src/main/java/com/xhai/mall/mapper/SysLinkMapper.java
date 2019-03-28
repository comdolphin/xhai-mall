package com.xhai.mall.mapper;

import com.xhai.mall.model.SysLink;
import com.xhai.mall.model.SysLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLinkMapper {
    int countByExample(SysLinkExample example);

    int deleteByExample(SysLinkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysLink record);

    int insertSelective(SysLink record);

    List<SysLink> selectByExample(SysLinkExample example);

    SysLink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysLink record, @Param("example") SysLinkExample example);

    int updateByExample(@Param("record") SysLink record, @Param("example") SysLinkExample example);

    int updateByPrimaryKeySelective(SysLink record);

    int updateByPrimaryKey(SysLink record);
}