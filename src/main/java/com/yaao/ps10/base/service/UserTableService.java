package com.yaao.ps10.base.service;

import com.yaao.ps10.base.model.UserTable;

public interface UserTableService {
    /**
     *根据用户id查询用户信息
     * @param userId 用户Id
     * @return UserTable
     */
    UserTable getUserTableById(Integer userId);

    /**
     *根据用户查询用户信息
     * @param userName 用户名
     * @param pwd 加密后的密码
     * @return UserTable
     */
    UserTable getUserTableByUser(String userName,String pwd);

    /**
     *根据用户用户信息
     * @param userTable 用户
     * @return UserTable
     */
    UserTable selectByUser(UserTable userTable);
}
