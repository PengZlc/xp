package com.yaao.ps10.app.service.impl;

import com.yaao.ps10.app.service.InspectWorkAppService;
import com.yaao.ps10.base.mapper.UserTableMapper;
import com.yaao.ps10.base.model.UserTable;
import com.yaao.ps10.web.mapper.InspectWorkMapper;
import com.yaao.ps10.web.mapper.KvEvaluateMapper;
import com.yaao.ps10.web.model.InspectWork;
import com.yaao.ps10.web.model.KvEvaluate;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InspectWorkAppServiceImpl implements InspectWorkAppService {

    @Resource
    InspectWorkMapper inspectWorkMapper;
    @Resource
    UserTableMapper userTableMapper;
    @Resource
    KvEvaluateMapper kvEvaluateMapper;

    @Override
    public UserTable getUserInfoById(Integer userId) {
        return userTableMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<InspectWork> getWaitAssessmentByMap(Map<String, Object> map) {
        /**/
        List<InspectWork> list;
        list = inspectWorkMapper.getSpecialWaitAssessmentByMap(map);
        if (list.isEmpty()&&list.size()==0){
            list = inspectWorkMapper.getWaitAssessmentByMap(map);

        }
        return list;
    }

    @Override
    public List<KvEvaluate> getKvEvaluateByMap(HashMap<String, Object> map) {
        return kvEvaluateMapper.getKvEvaluateByMap(map);
    }

    @Override
    public List<UserTable> getUserInfoByUser(UserTable userTable) {
        return userTableMapper.getUserInfoByUser(userTable);
    }
}
