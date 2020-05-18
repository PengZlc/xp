package com.yaao.ps10.quartz.util;

import com.yaao.ps10.quartz.model.TaskScheduleJob;
import com.yaao.ps10.web.controller.InspectWorkController;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;

@Component
public class TaskUtils {
	public final static Logger log = Logger.getLogger(TaskUtils.class);

	/**
	 * 通过反射调用scheduleJob中定义的方法
	 */
	public static void invokMethod(TaskScheduleJob scheduleJob) {
		System.out.println("开始任务了======================");
		Object object = null;
		Class<?> clazz = null;
		System.out.println("getSpringId==="+scheduleJob.getSpringId());
		InspectWorkController inspectWorkController = ApplicationContextHelper.getBean(scheduleJob.getSpringId());
		inspectWorkController.startInspectWork();
		// springId不为空先按springId查找bean
		if (StringUtils.isNotBlank(scheduleJob.getSpringId())) {
			object = SpringUtils.getBean(scheduleJob.getSpringId());
			System.out.println(SpringUtils.getBean(scheduleJob.getSpringId()));
		} else if (StringUtils.isNotBlank(scheduleJob.getBeanClass())) {
			try {
				clazz = Class.forName(scheduleJob.getBeanClass());
				object = clazz.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (object == null) {
			log.debug("任务名称 = [" + scheduleJob.getJobName()+ "]---------------未启动成功，请检查是否配置正确！！！");
			return;
		}
		clazz = object.getClass();
		Method method = null;
		try {
			method = clazz.getDeclaredMethod(scheduleJob.getMethodName(), null);
			log.debug("调用方法" + method.toString());
		} catch (NoSuchMethodException e) {
			log.debug("任务名称 = [" + scheduleJob.getMethodName()+ "]---------------未启动成功，方法名设置错误！！！");
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}
}
