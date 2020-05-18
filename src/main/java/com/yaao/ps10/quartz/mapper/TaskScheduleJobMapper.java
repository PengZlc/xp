package com.yaao.ps10.quartz.mapper;

import com.yaao.ps10.quartz.model.TaskScheduleJob;
import com.yaao.ps10.quartz.model.TaskScheduleJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskScheduleJobMapper {
    long countByExample(TaskScheduleJobExample example);

    int deleteByExample(TaskScheduleJobExample example);

    int deleteByPrimaryKey(Long jobId);

    int insert(TaskScheduleJob record);

    int insertSelective(TaskScheduleJob record);

    List<TaskScheduleJob> selectByExampleWithBLOBs(TaskScheduleJobExample example);

    List<TaskScheduleJob> selectByExample(TaskScheduleJobExample example);

    TaskScheduleJob selectByPrimaryKey(Long jobId);

    int updateByExampleSelective(@Param("record") TaskScheduleJob record, @Param("example") TaskScheduleJobExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskScheduleJob record, @Param("example") TaskScheduleJobExample example);

    int updateByExample(@Param("record") TaskScheduleJob record, @Param("example") TaskScheduleJobExample example);

    int updateByPrimaryKeySelective(TaskScheduleJob record);

    int updateByPrimaryKeyWithBLOBs(TaskScheduleJob record);

    int updateByPrimaryKey(TaskScheduleJob record);
}