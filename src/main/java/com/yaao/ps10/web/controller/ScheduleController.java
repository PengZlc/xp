package com.yaao.ps10.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaao.ps10.quartz.model.TaskScheduleJob;
import com.yaao.ps10.quartz.service.TaskScheduleJobService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Resource
    TaskScheduleJobService taskScheduleJobService;

    @RequestMapping("/list")
    public String getAllTaskScheduleJob(@RequestParam(name="limit",required = false) Integer limit,
                                        @RequestParam(name="page",required = false) Integer page){
        JSONObject reJson = new JSONObject();
        try{
            /*分页查询巡检记录*/
            PageInfo<TaskScheduleJob> pageInfo = PageHelper.startPage(page,limit).doSelectPageInfo(()
                    ->taskScheduleJobService.getAllTaskScheduleJob());
            reJson.put("code", 0);
            reJson.put("count",pageInfo.getTotal());
            reJson.put("data", pageInfo.getList());
        }catch (Exception e){
            reJson.put("code",1);
            reJson.put("msg","获取任务调度列表失败");
            e.printStackTrace();
        }
        return reJson.toJSONString();
    }

    @RequestMapping("/add")
    public String addTaskScheduleJob(TaskScheduleJob taskScheduleJob){
        JSONObject reJson = new JSONObject();
        try{
            taskScheduleJobService.addTask(taskScheduleJob);
            reJson.put("code", 0);
        }catch (Exception e){
            reJson.put("code",1);
            reJson.put("msg","添加任务调度失败");
            e.printStackTrace();
        }
        return reJson.toJSONString();
    }

    @RequestMapping("/change")
    public String changeStatus(@RequestParam(name="order") String order){
        JSONObject reJson = new JSONObject();
        try{
            taskScheduleJobService.changeStatus((long) 232,order);
            reJson.put("code", 0);
        }catch (Exception e){
            reJson.put("code",1);
            reJson.put("msg","添加任务调度失败");
            e.printStackTrace();
        }
        return reJson.toJSONString();
    }
}
