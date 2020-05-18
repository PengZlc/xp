package com.yaao.ps10.web.service;

import com.yaao.ps10.base.model.SiteTable;
import com.yaao.ps10.web.model.*;

import java.util.List;
import java.util.Map;


public interface InspectWorkService {

    /**
     * 获取所有巡检任务
     * @return List<InspectWork>
     * */
    List<InspectWork> getAllInspectWorkList();

    /**
     * 获取已完成或超时巡检任务
     * @param map 参数集合
     * @return List<InspectWork>
     */
    List<InspectWork> getCompInspectWorkByMap(Map<String, Object> map);
    /**
    * 根据ID获取巡检任务
    * */
     InspectWork getInspectWork(int id);

    /**
    * 根据ID删除巡检任务
    * */
    int delInspectWorkById(int id);

    /**
    * 带条件查询巡检任务
    * */
    List<InspectWork> getInspectWorkByMap(Map<String, Object> map);


    /**
     * 获取NFC卡总数与完成数
     * */
    String getNfcCountById(Integer id);

    /**
     * 获取站点信息
     * */
    List<SiteTable> getSiteInfoById(int id, int type);

    /**
     * 获取机房信息
     * */
    List<RoomState> getRoomInfoById(String processInstanceId, String userId, int i, String siteId);

    /**
     * 获取机房状态信息
     * */
    InspectRoomState getInspectRoomState(InspectRoomState roomState);
    /**
     * 更新机房状态
     * */
    void updateRoomState(InspectRoomState roomState);
    /**
     * 巡检更新未完成原因
     * */
    void updateInspectStateById(InspectWork inspectWork, Integer flag);
    /**
     * 获App获取巡检任务问题汇总
     * */
    List<KvRoomException> getKvRoomExceptionById(KvRoomException kvRoomException);
    /**
     * 更新巡检任务状态
     * */
    void updateInspectWork(InspectWork inspectWork);
    /**
     * 更新个人巡检任务状态
     * */
    void updateInspectUser(InspectUser inspectUser);
    /**
     * 巡检获取NFC信息集合
     * */
    List<NfcDataTable> getNfcDataInfo(NfcDataTable nfcDataTable);
    /**
     * 巡检获取NFC信息
     * */
    NfcDataTable getNfcModelByNfc(NfcDataTable nfcDataTable);
    /**
     * 更新NFC卡状态
     * */
    void updateNfcStateByNfc(NfcDataTable nfcDataTable);

    /**
     * 获取机房评估后信息
     * @param processInstanceId 流程Id
     * @return List<KvEvaluate>
     */
    List<KvEvaluate> getEvaluateById(String processInstanceId);

    /**
     * web获取巡检记录
     * @param map 查询条件
     * @return List<InspectWork>
     */
    List<InspectWork> getInspectListByMap(Map<String, Object> map);

    /**
     * 开始巡检任务
     */
    void startInspectWork();
}
