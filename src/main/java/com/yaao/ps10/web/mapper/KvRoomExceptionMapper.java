package com.yaao.ps10.web.mapper;

import com.yaao.ps10.web.model.KvRoomException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KvRoomExceptionMapper {
    long countByExample(KvRoomException example);

    int deleteByExample(KvRoomException example);

    int deleteByPrimaryKey(Integer id);

    int insert(KvRoomException record);

    int insertSelective(KvRoomException record);

    List<KvRoomException> selectByExample(KvRoomException example);

    KvRoomException selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KvRoomException record);

    int updateByExample(@Param("record") KvRoomException record);

    int updateByPrimaryKeySelective(KvRoomException record);

    int updateByPrimaryKey(KvRoomException record);

    KvRoomException selectByKvRoomException(KvRoomException record);
}