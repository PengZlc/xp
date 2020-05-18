package com.yaao.ps10.app.service.impl;

import com.yaao.ps10.app.service.LoginAppService;
import com.yaao.ps10.base.mapper.UserTableMapper;
import com.yaao.ps10.base.model.UserTable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class LoginAppServiceImpl implements LoginAppService {
    @Resource
    UserTableMapper userTableMapper;

    @Override
    public UserTable getUserTableByUser(String userName, String pwd) {
        return userTableMapper.selectByParams(userName,pwd);
    }
}
