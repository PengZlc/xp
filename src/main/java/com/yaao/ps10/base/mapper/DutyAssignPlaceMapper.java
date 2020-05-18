package com.yaao.ps10.base.mapper;

import com.yaao.ps10.base.model.DutyAssignPlace;
import com.yaao.ps10.base.model.DutyAssignPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DutyAssignPlaceMapper {
    long countByExample(DutyAssignPlaceExample example);

    int deleteByExample(DutyAssignPlaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DutyAssignPlace record);

    int insertSelective(DutyAssignPlace record);

    List<DutyAssignPlace> selectByExample(DutyAssignPlaceExample example);

    DutyAssignPlace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DutyAssignPlace record, @Param("example") DutyAssignPlaceExample example);

    int updateByExample(@Param("record") DutyAssignPlace record, @Param("example") DutyAssignPlaceExample example);

    int updateByPrimaryKeySelective(DutyAssignPlace record);

    int updateByPrimaryKey(DutyAssignPlace record);

    List<DutyAssignPlace> selectAll();
}