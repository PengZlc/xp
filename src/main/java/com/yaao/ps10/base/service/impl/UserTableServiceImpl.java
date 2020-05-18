package com.yaao.ps10.base.service.impl;

import com.yaao.ps10.base.mapper.UserTableMapper;
import com.yaao.ps10.base.model.UserTable;
import com.yaao.ps10.base.service.UserTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserTableServiceImpl implements UserTableService {

    @Resource
    UserTableMapper userTableMapper;

    @Override
    public UserTable getUserTableById(Integer userId) {
        return userTableMapper.selectByPrimaryKey(userId);
    }

    @Override
    public UserTable getUserTableByUser(String userName, String pwd) {
        return userTableMapper.selectByParams(userName,pwd);
    }

    @Override
    public UserTable selectByUser(UserTable userTable) {
        return userTableMapper.selectByUser(userTable);
    }
}
