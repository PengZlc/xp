package com.yaao.ps10.app.service;


import com.yaao.ps10.web.model.InspectRoomState;
import com.yaao.ps10.web.model.KvEvaluate;
import com.yaao.ps10.web.model.KvRoomException;

public interface DataManageAppService {

    /**
     *获取已完成巡检表单
     * @param inspectRoomState 机房状态表
     * @return InspectRoomState
     */
    InspectRoomState getInspectFormJSON(InspectRoomState inspectRoomState);

    /**
     *获取未完成巡检表单
     * @param roomId 机房Id
     * @param userId 用户Id
     * @return InspectRoomState
     */
    String getInspectUnFormJSON(Integer roomId,Integer userId);

    /**
     *app提交机房未刷NFC卡原因
     * @param inspectRoomState 机房状态表
     * @return int
     */
    void submitNoCreditNFCAccount(InspectRoomState inspectRoomState);

    /**
     *app获取机房未刷NFC卡原因
     * @param inspectRoomState 机房状态表
     * @return InspectRoomState
     */
    InspectRoomState getNoCreditNFCAccount(InspectRoomState inspectRoomState);

    /**
     *app提交机房巡检内容
     * @param inspectRoomState 机房状态表
     */
    void updateRoomStateTable(InspectRoomState inspectRoomState);

    /**
     *app提交异常机房信息
     * @param kvRoomException 机房状态表
     */
    void saveKvRoomException(KvRoomException kvRoomException);

    /**
     *app提交否决机房
     * @param kvEvaluate 否决机房
     * @param flag 标识
     */
    int submitVetoRoomByModel(KvEvaluate kvEvaluate, Integer flag);
}
