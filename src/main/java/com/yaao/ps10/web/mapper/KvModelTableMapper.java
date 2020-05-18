package com.yaao.ps10.web.mapper;

import com.yaao.ps10.web.model.KvModelTable;
import com.yaao.ps10.web.model.KvModelTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface KvModelTableMapper {
    long countByExample(KvModelTableExample example);

    int deleteByExample(KvModelTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KvModelTable record);

    int insertSelective(KvModelTable record);

    List<KvModelTable> selectByExampleWithBLOBs(KvModelTableExample example);

    List<KvModelTable> selectByExample(KvModelTableExample example);

    KvModelTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KvModelTable record, @Param("example") KvModelTableExample example);

    int updateByExampleWithBLOBs(@Param("record") KvModelTable record, @Param("example") KvModelTableExample example);

    int updateByExample(@Param("record") KvModelTable record, @Param("example") KvModelTableExample example);

    int updateByPrimaryKeySelective(KvModelTable record);

    int updateByPrimaryKeyWithBLOBs(KvModelTable record);

    int updateByPrimaryKey(KvModelTable record);

    List<KvModelTable> getKvModelTableByMap(@Param("record") Map<String, Object> map, int flag);
}