package com.yaao.ps10.base.mapper;

import com.yaao.ps10.base.model.NfcRecord;
import com.yaao.ps10.base.model.NfcRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NfcRecordMapper {
    long countByExample(NfcRecordExample example);

    int deleteByExample(NfcRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NfcRecord record);

    int insertSelective(NfcRecord record);

    List<NfcRecord> selectByExample(NfcRecordExample example);

    NfcRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NfcRecord record, @Param("example") NfcRecordExample example);

    int updateByExample(@Param("record") NfcRecord record, @Param("example") NfcRecordExample example);

    int updateByPrimaryKeySelective(NfcRecord record);

    int updateByPrimaryKey(NfcRecord record);

    String getNfcCountById(int id);
}