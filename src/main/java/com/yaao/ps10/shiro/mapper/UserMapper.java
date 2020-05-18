package com.yaao.ps10.shiro.mapper;

import com.yaao.ps10.shiro.pojo.UserBean;

public interface UserMapper {
    // 查询用户信息
    UserBean findByName(String name);

    // 查询用户信息、角色、权限
    UserBean findById(String id);
}
