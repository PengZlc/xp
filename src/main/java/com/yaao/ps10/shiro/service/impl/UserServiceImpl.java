package com.yaao.ps10.shiro.service.impl;

import com.yaao.ps10.shiro.mapper.UserMapper;
import com.yaao.ps10.shiro.pojo.UserBean;
import com.yaao.ps10.shiro.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserBean findByName(String name) {
        // 查询用户是否存在
        UserBean bean = userMapper.findByName(name);
        if (bean != null) {
            // 查询用户信息、角色、权限
            bean = userMapper.findById(bean.getId());
        }
        return bean;
    }
}
