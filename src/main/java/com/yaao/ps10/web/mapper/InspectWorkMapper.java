package com.yaao.ps10.web.mapper;


import com.yaao.ps10.web.model.InspectWork;
import com.yaao.ps10.web.model.InspectWorkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface InspectWorkMapper {
    long countByExample(InspectWorkExample example);

    int deleteByExample(InspectWorkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectWork record);

    int insertSelective(InspectWork record);

    List<InspectWork> selectByExample(InspectWorkExample example);

    InspectWork selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectWork record, @Param("example") InspectWorkExample example);

    int updateByExample(@Param("record") InspectWork record, @Param("example") InspectWorkExample example);

    int updateByPrimaryKeySelective(InspectWork record);

    int updateByPrimaryKey(InspectWork record);

    List<InspectWork> getInspectWorkByMap(Map<String, Object> params);

    List<InspectWork> getAllInspectWorkList();

    void updateInspectWork(@Param("record") InspectWork record);

    List<InspectWork> getWaitAssessmentByMap(Map<String, Object> map);

    List<InspectWork> getSpecialWaitAssessmentByMap(Map<String, Object> map);

    List<InspectWork> getCompInspectWorkByMap(Map<String, Object> map);

    List<InspectWork> getInspectListByMap(Map<String, Object> map);
}