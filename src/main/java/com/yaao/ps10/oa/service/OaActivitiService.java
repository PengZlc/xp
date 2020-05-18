package com.yaao.ps10.oa.service;

import com.yaao.ps10.oa.model.ActHiTaskInst;

public interface OaActivitiService {

    String findLeaderByUserId(Integer id);

    ActHiTaskInst getActHiTaskId(ActHiTaskInst actHiTaskInst);
}
