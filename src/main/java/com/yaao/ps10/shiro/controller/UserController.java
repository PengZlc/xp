package com.yaao.ps10.shiro.controller;

import com.yaao.ps10.shiro.pojo.UserBean;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户页面跳转
 */
@Controller
public class UserController {

    /**
     * 个人中心，需认证可访问
     */
    @RequestMapping("/user/index")
    public String add(HttpServletRequest request){
        UserBean bean = (UserBean) SecurityUtils.getSubject().getPrincipal();
        request.setAttribute("userName", bean.getName());
        return "/user/index";
    }

    /**
     * 会员中心，需认证且角色为vip可访问
     */
    @RequestMapping("/vip/index")
    public String update(){
        return "/vip/index";
    }
}

