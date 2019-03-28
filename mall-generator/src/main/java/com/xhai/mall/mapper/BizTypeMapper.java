package com.xhai.mall.mapper;

import com.xhai.mall.blog.business.vo.TypeConditionVO;
import com.xhai.mall.model.BizType;
import com.xhai.mall.model.BizTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

public interface BizTypeMapper   {
    int countByExample(BizTypeExample example);

    int deleteByExample(BizTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizType record);

    int insertSelective(BizType record);

    List<BizType> selectByExample(BizTypeExample example);

    BizType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizType record, @Param("example") BizTypeExample example);

    int updateByExample(@Param("record") BizType record, @Param("example") BizTypeExample example);

    int updateByPrimaryKeySelective(BizType record);

    int updateByPrimaryKey(BizType record);
    /**
     * 分页查询
     * @param vo
     *
     * @return
     */
    List<BizType> findPageBreakByCondition(TypeConditionVO vo);

    List<BizType> listParent();

    List<BizType> listTypeForMenu();
}