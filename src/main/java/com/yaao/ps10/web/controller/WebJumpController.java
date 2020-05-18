package com.yaao.ps10.web.controller;


import com.yaao.ps10.base.service.UserTableService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/pages")
public class WebJumpController {
    @Resource
    HttpSession httpSession;
    @Resource
    UserTableService userTableService;

    /**
     * 巡检列表
     * */
    @GetMapping("/index")
    public String to(Model model){
        return "/index";
    }

    /**
     * 巡检列表
     * */
    @GetMapping("/inspect")
    public String toInspect(Model model){
        return "inspects/inspect";
    }

    @RequestMapping("/view/inspect")
    public String getViewInspectWork(){ return "inspects/user-edit"; }
    /**
     * 任务调度列表
     * */
    @GetMapping("/schedule")
    public String toSchedule(Model model){ return "schedule/schedule"; }
    /**
     * 添加任务调度
     * */
    @RequestMapping("/schedule/add")
    public String toAddSchedule(){ return "schedule/schedule-add"; }
}
