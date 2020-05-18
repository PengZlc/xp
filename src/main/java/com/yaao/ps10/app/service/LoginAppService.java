package com.yaao.ps10.app.service;

import com.yaao.ps10.base.model.UserTable;

public interface LoginAppService {

    /**
     *根据用户查询用户信息
     * @param userName 用户名
     * @param pwd 加密后的密码
     * @return UserTable
     */
    UserTable getUserTableByUser(String userName,String pwd);
}
