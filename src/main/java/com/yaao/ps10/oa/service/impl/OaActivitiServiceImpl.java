package com.yaao.ps10.oa.service.impl;

import com.yaao.ps10.base.mapper.UserTableMapper;
import com.yaao.ps10.base.model.UserTable;
import com.yaao.ps10.oa.mapper.ActHiTaskInstMapper;
import com.yaao.ps10.oa.model.ActHiTaskInst;
import com.yaao.ps10.oa.service.OaActivitiService;

import javax.annotation.Resource;

public class OaActivitiServiceImpl implements OaActivitiService {
    @Resource
    UserTableMapper userTableMapper;
    @Resource
    ActHiTaskInstMapper actHiTaskInstMapper;
    @Override
    public String findLeaderByUserId(Integer id) {
        return userTableMapper.selectLeaderByUserId(id);
    }

    @Override
    public ActHiTaskInst getActHiTaskId(ActHiTaskInst actHiTaskInst) {
        return actHiTaskInstMapper.selectByActHiTaskInst(actHiTaskInst);
    }
}
