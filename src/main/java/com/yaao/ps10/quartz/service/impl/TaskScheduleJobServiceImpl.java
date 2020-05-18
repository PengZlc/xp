package com.yaao.ps10.quartz.service.impl;

import com.yaao.ps10.quartz.mapper.TaskScheduleJobMapper;
import com.yaao.ps10.quartz.model.TaskScheduleJob;
import com.yaao.ps10.quartz.service.TaskScheduleJobService;
import com.yaao.ps10.quartz.util.QuartzJobFactory;
import com.yaao.ps10.quartz.util.QuartzJobFactoryDisallowConcurrentExecution;
import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.*;

@Service(value = "taskScheduleJobService")
public class TaskScheduleJobServiceImpl implements TaskScheduleJobService {
    @Resource
    TaskScheduleJobMapper taskScheduleJobMapper;
    @Resource
    private SchedulerFactoryBean schedulerFactoryBean;

    @Override
    public List<TaskScheduleJob> getAllJob() {
        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            GroupMatcher<JobKey> matcher = GroupMatcher.anyJobGroup();
            Set<JobKey> jobKeys = scheduler.getJobKeys(matcher);
            List<TaskScheduleJob> jobList = new ArrayList<>();
            for (JobKey jobKey : jobKeys) {
                List<? extends Trigger> triggers = scheduler.getTriggersOfJob(jobKey);
                for (Trigger trigger : triggers) {
                    TaskScheduleJob job = new TaskScheduleJob();
                    job.setJobName(jobKey.getName());
                    job.setJobGroup(jobKey.getGroup());
                    job.setDescription("触发器:" + trigger.getKey());
                    Trigger.TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());
                    job.setJobStatus(triggerState.name());
                    if (trigger instanceof CronTrigger) {
                        CronTrigger cronTrigger = (CronTrigger) trigger;
                        String cronExpression = cronTrigger.getCronExpression();
                        job.setCronExpression(cronExpression);
                    }
                    jobList.add(job);
                }
            }
            return jobList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addJob(TaskScheduleJob job){
        try{
            if (job==null||!job.getIsconcurrent().equals(job.getJobStatus())){
                return;
            }
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            TriggerKey triggerKey = TriggerKey.triggerKey(job.getJobName(), job.getJobGroup());
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
            if (null == trigger) {
                Class clazz = job.CONCURRENT_IS.equals(job.getIsconcurrent()) ? QuartzJobFactory.class
                        : QuartzJobFactoryDisallowConcurrentExecution.class;
                //构建job信息
                JobDetail jobDetail = JobBuilder.newJob(clazz).
                        withIdentity(job.getJobName(), job.getJobGroup())
                        .build();
                scheduler.getContext().put(job.getJobName(), job);
                //表达式调度构建器(即任务执行的时间)
                CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
                //按新的cronExpression表达式构建一个新的trigger
                trigger = TriggerBuilder.newTrigger().
                        withIdentity(job.getJobName(), job.getJobGroup())
                        .withSchedule(scheduleBuilder)
                        .build();
                scheduler.scheduleJob(jobDetail, trigger);
            }else{
                // Trigger已存在，那么更新相应的定时设置
                CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
                // 按新的cronExpression表达式重新构建trigger
                trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).usingJobData("data", job.getCronExpression()).
                        withSchedule(scheduleBuilder).build();
                // 按新的trigger重新设置job执行
                scheduler.rescheduleJob(triggerKey, trigger);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateCron(Long jobId, String cron){
    }

    @Override
    public void changeStatus(Long jobId, String cmd){
        try {
            TaskScheduleJob job = getTaskById(jobId);
            if (job == null) {
                return;
            }
            if ("stop".equals(cmd)) {
                deleteJob(job);
                job.setJobStatus(TaskScheduleJob.STATUS_NOT_RUNNING);
            } else if ("start".equals(cmd)) {
                job.setJobStatus(TaskScheduleJob.STATUS_RUNNING);
                addJob(job);
            }
            taskScheduleJobMapper.updateByPrimaryKeySelective(job);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void addTask(TaskScheduleJob job) {
        try {
            job.setCreateTime(new Timestamp(new Date().getTime()));
            taskScheduleJobMapper.insertSelective(job);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public TaskScheduleJob getTaskById(Long jobId) {
        return taskScheduleJobMapper.selectByPrimaryKey(jobId);
    }

    @Override
    public List<TaskScheduleJob> getAllTaskScheduleJob() {
        return null;
    }

    @Override
    public Map<String, Object> findAllTask(Map<String, Object> params){
        return null;
    }

    @Override
    public void pauseJob(TaskScheduleJob scheduleJob){
        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            JobKey jobKey = JobKey.jobKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
            scheduler.pauseJob(jobKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void resumeJob(TaskScheduleJob scheduleJob){
        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            JobKey jobKey = JobKey.jobKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
            scheduler.resumeJob(jobKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteJob(TaskScheduleJob scheduleJob){
        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            JobKey jobKey = JobKey.jobKey(scheduleJob.getJobName(), scheduleJob.getJobGroup());
            scheduler.deleteJob(jobKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
