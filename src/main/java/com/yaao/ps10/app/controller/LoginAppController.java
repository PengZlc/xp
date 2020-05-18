package com.yaao.ps10.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.yaao.ps10.app.service.LoginAppService;
import com.yaao.ps10.app.utils.AesUtil;
import com.yaao.ps10.base.model.UserTable;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
* app登录功能
* */
@RestController
public class LoginAppController {
    @Resource
    LoginAppService loginAppService;
    /**
     * app登录
     * @param  userName 登录名
     * @param password 登录密码
     * @return reJson
     */
    @RequestMapping("logins")
    public JSONObject login(@RequestParam("username") String userName,@RequestParam("password") String password){
        JSONObject reJson = new JSONObject();
        try{
            if (!StringUtils.isEmpty(userName)&!StringUtils.isEmpty(password)) {
                /* 密码，Aes加密*/
                String pwd = AesUtil.aesEncrypt(password, AesUtil.KEY);
                /*根据用户名与密码获取用户信息*/
                UserTable userTable = loginAppService.getUserTableByUser(userName,pwd);
                System.out.println(userTable);
                if (userTable!=null){
                    /*组装app所需JSON格式*/
                    reJson.put("logincode", 0);
                    reJson.put("sex", userTable.getSex());
                    reJson.put("dept", userTable.getDepartmentName());
                    reJson.put("id", userTable.getMemberid());
                    reJson.put("roleId", userTable.getRoleid());
                    reJson.put("role", userTable.getRoleName()==null?"":userTable.getRoleName());
                    reJson.put("tele", userTable.getTelphone());
                    reJson.put("email", userTable.getEmail());
                    reJson.put("carcode",userTable.getCardcode());
                    reJson.put("deptId", userTable.getDepartmentid());
                }else{
                    reJson.put("logincode",3);
                    reJson.put("msg","用户名或密码错误");
                }
            }else{
                reJson.put("logincode",1);
                reJson.put("msg","用户名或密码为空");
            }
        }catch (Exception e){
            try {
                throw e;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return reJson;
    }
}
