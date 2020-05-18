package com.yaao.ps10.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

/**
 * 用户处理类
 * */
@RestController
public class UserTableController {
    @RequestMapping("register")
    public String registerUser(){
        return null;
    }
}
