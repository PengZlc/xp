package com.yaao.ps10.oa.mapper;

import com.yaao.ps10.oa.model.ActHiTaskInst;
import com.yaao.ps10.oa.model.ActHiTaskInstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActHiTaskInstMapper {
    long countByExample(ActHiTaskInstExample example);

    int deleteByExample(ActHiTaskInstExample example);

    int deleteByPrimaryKey(String id);

    int insert(ActHiTaskInst record);

    int insertSelective(ActHiTaskInst record);

    List<ActHiTaskInst> selectByExample(ActHiTaskInstExample example);

    ActHiTaskInst selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ActHiTaskInst record, @Param("example") ActHiTaskInstExample example);

    int updateByExample(@Param("record") ActHiTaskInst record, @Param("example") ActHiTaskInstExample example);

    int updateByPrimaryKeySelective(ActHiTaskInst record);

    int updateByPrimaryKey(ActHiTaskInst record);

    ActHiTaskInst selectByActHiTaskInst(ActHiTaskInst actHiTaskInst);
}