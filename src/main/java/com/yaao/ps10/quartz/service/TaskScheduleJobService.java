package com.yaao.ps10.quartz.service;

import com.yaao.ps10.quartz.model.TaskScheduleJob;
import org.quartz.SchedulerException;

import java.util.List;
import java.util.Map;

public interface TaskScheduleJobService {
    /**
     * 获取所有job
     * 数据库
     * */
    List<TaskScheduleJob> getAllJob();
    /**
     *获取所有调度
     * 数据库
     * */
    List<TaskScheduleJob> getAllTaskScheduleJob();
    /**
     *添加任务调度
     * 数据库
     * */
    void addTask(TaskScheduleJob job);
    /**
     * 添加job
     * */
    void addJob(TaskScheduleJob job) throws SchedulerException;

    /**
     * 更新调度时间
     * */
    void updateCron(Long jobId, String cron) throws SchedulerException;

    /**
     *改变任务状态
     * */
    void changeStatus(Long jobId, String cmd) throws SchedulerException;



    /**
     *获取调度
     * */
    TaskScheduleJob getTaskById(Long jobId);



    /**
     *获取所有调度
     * */
    Map<String, Object> findAllTask(Map<String, Object> params)
            throws Exception;
    /**
     * 暂停一个job
     * */
    void pauseJob(TaskScheduleJob scheduleJob) throws SchedulerException;

    /**
     * 恢复一个job
     * */
    void resumeJob(TaskScheduleJob scheduleJob) throws SchedulerException;

    /**
     * 删除一个job
     * */
    void deleteJob(TaskScheduleJob scheduleJob) throws SchedulerException;

}
