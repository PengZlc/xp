package com.yaao.ps10.web.mapper;

import com.yaao.ps10.web.model.RoomState;

import java.util.List;

public interface RoomStateMapper {

    List<RoomState> getRoomInfoById(String processInstanceId, String userId, int flag, String siteId);

}
