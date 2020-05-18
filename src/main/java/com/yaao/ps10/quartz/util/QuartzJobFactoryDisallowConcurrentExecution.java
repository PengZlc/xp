package com.yaao.ps10.quartz.util;

import com.yaao.ps10.quartz.model.TaskScheduleJob;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;



/**
 * 
 * @Description: 若一个方法一次执行不完下次轮转时则等待改方法执行完后才执行下一次操作
 */
@DisallowConcurrentExecution
public class QuartzJobFactoryDisallowConcurrentExecution implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

		String jobName=	context.getJobDetail().getKey().getName();;
		 TaskScheduleJob scheduleJob=null;
		try {
			scheduleJob = (TaskScheduleJob) context.getScheduler().getContext().get(jobName);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}if(scheduleJob!=null) {
		  TaskUtils.invokMethod(scheduleJob);
		}
	}
}