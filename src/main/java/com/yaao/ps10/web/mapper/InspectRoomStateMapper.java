package com.yaao.ps10.web.mapper;

import com.yaao.ps10.web.model.InspectRoomState;
import com.yaao.ps10.web.model.InspectRoomStateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectRoomStateMapper {
    long countByExample(InspectRoomStateExample example);

    int deleteByExample(InspectRoomStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectRoomState record);

    int insertSelective(InspectRoomState record);

    List<InspectRoomState> selectByExampleWithBLOBs(InspectRoomStateExample example);

    List<InspectRoomState> selectByExample(InspectRoomStateExample example);

    InspectRoomState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectRoomState record, @Param("example") InspectRoomStateExample example);

    int updateByExampleWithBLOBs(@Param("record") InspectRoomState record, @Param("example") InspectRoomStateExample example);

    int updateByExample(@Param("record") InspectRoomState record, @Param("example") InspectRoomStateExample example);

    int updateByPrimaryKeySelective(InspectRoomState record);

    int updateByPrimaryKeyWithBLOBs(InspectRoomState record);

    int updateByPrimaryKey(InspectRoomState record);

    InspectRoomState getInspectRoomState(InspectRoomState record);

    void updateInspectRoomState(InspectRoomState record);
}