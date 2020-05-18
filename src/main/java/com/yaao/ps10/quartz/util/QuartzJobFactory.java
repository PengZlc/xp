package com.yaao.ps10.quartz.util;


import com.yaao.ps10.quartz.model.TaskScheduleJob;
import com.yaao.ps10.web.service.InspectWorkService;
import org.quartz.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * 计划任务执行处 无状态
 */
@Component
public class QuartzJobFactory implements Job {
	@Resource
	InspectWorkService inspectWorkService;

	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		//获取任务详情中的dataMap集合
		JobDetail jobDetail = jobExecutionContext.getJobDetail();
		JobDataMap jobDataMap = jobDetail.getJobDataMap();
		String jobName=	jobExecutionContext.getJobDetail().getKey().getName();
		TaskScheduleJob scheduleJob=null;
		try {
			scheduleJob = (TaskScheduleJob) jobExecutionContext.getScheduler().getContext().get(jobName);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		if(scheduleJob!=null){
			if (scheduleJob.getJobTyle().equals("1")){
				inspectWorkService.startInspectWork();
			}
		}
	}
}