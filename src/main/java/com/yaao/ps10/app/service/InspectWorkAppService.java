package com.yaao.ps10.app.service;

import com.yaao.ps10.base.model.UserTable;
import com.yaao.ps10.web.model.InspectWork;
import com.yaao.ps10.web.model.KvEvaluate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InspectWorkAppService {
    /**
     * 获取用户信息
     * @param userId 用户Id
     * @return  UserTable
     */
    UserTable getUserInfoById(Integer userId);

    /**
     *获取巡检评估列表
     * @param mapValue 参数集合
     * @return List<InspectWork>
     */
    List<InspectWork> getWaitAssessmentByMap(Map<String, Object> mapValue);

    /**
     * app获取已否决列表
     * @param map
     * @return List<KvEvaluate>
     */
    List<KvEvaluate> getKvEvaluateByMap(HashMap<String, Object> map);

    /**
     * app获取用户信息集合
     * @param userTable
     * @return List<UserTable>
     */
    List<UserTable> getUserInfoByUser(UserTable userTable);
}
