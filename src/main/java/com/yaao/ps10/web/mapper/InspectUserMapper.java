package com.yaao.ps10.web.mapper;

import com.yaao.ps10.web.model.InspectUser;
import org.apache.ibatis.annotations.Param;

public interface InspectUserMapper {

    void updateInspectUser(@Param("record") InspectUser inspectUser);

}
