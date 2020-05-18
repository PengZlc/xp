package com.yaao.ps10.web.mapper;

import com.yaao.ps10.web.model.NfcDataTable;
import com.yaao.ps10.web.model.NfcDataTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NfcDataTableMapper {
    long countByExample(NfcDataTableExample example);

    int deleteByExample(NfcDataTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NfcDataTable record);

    int insertSelective(NfcDataTable record);

    List<NfcDataTable> selectByExample(NfcDataTableExample example);

    NfcDataTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NfcDataTable record, @Param("example") NfcDataTableExample example);

    int updateByExample(@Param("record") NfcDataTable record, @Param("example") NfcDataTableExample example);

    int updateByPrimaryKeySelective(NfcDataTable record);

    int updateByPrimaryKey(NfcDataTable record);

    List<NfcDataTable> getNFCDataInfo(NfcDataTable record);
    
    NfcDataTable getNfcModelByNfc(NfcDataTable nfcDataTable);

}