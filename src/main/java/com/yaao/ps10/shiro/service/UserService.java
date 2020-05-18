package com.yaao.ps10.shiro.service;

import com.yaao.ps10.shiro.pojo.UserBean;

public interface UserService {
    UserBean findByName(String username);
}
