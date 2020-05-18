package com.yaao.ps10.web.mapper;

import com.yaao.ps10.web.model.KvEvaluate;
import com.yaao.ps10.web.model.KvEvaluateExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface KvEvaluateMapper {
    long countByExample(KvEvaluateExample example);

    int deleteByExample(KvEvaluateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KvEvaluate record);

    int insertSelective(KvEvaluate record);

    List<KvEvaluate> selectByExample(KvEvaluateExample example);

    KvEvaluate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KvEvaluate record, @Param("example") KvEvaluateExample example);

    int updateByExample(@Param("record") KvEvaluate record, @Param("example") KvEvaluateExample example);

    int updateByPrimaryKeySelective(KvEvaluate record);

    int updateByPrimaryKey(KvEvaluate record);

    List<KvEvaluate> getKvEvaluateById(String processInstanceId);

    List<KvEvaluate> getKvEvaluateByMap(HashMap<String, Object> map);

    long countBySelective(KvEvaluate record);
}