package com.yaao.ps10.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.yaao.ps10.app.service.DataManageAppService;
import com.yaao.ps10.web.model.InspectRoomState;
import com.yaao.ps10.web.model.KvEvaluate;
import com.yaao.ps10.web.model.KvRoomException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/data")
public class DataManageAppController {
    @Resource
    DataManageAppService dataManageAppService;
    /**
     * app获取未完成巡检表单JSON
     * @param userId 用户Id
     * @param roomId 机房Id
     * @author xp
     */
    @RequestMapping("getModelDataContent")
    public JSONObject getModelDataContent(@RequestParam(name = "roomId",required = false) String roomId,
                                    @RequestParam(name = "userId",required = false) String userId){
        JSONObject reJson = new JSONObject();
        try {
            if (!StringUtils.isEmpty(roomId)&!StringUtils.isEmpty(userId)) {
                String formJson = dataManageAppService.getInspectUnFormJSON(Integer.parseInt(roomId),Integer.parseInt(userId));
                reJson.put("code", 0);
                reJson.put("dataJson",formJson);
            }else{
                reJson.put("code", 1);
                reJson.put("msg","app传入的参数为空");
            }
        } catch (Exception e) {
            reJson.put("code", 1);
            reJson.put("msg","获取失败");
            throw e;
        }
        return reJson;
    }
    /**
     * app获取已完成巡检表单JSON
     * @param processId 流程Id
     * @param roomId 机房Id
     * @author xp
     */
    @RequestMapping("getCompModelDataContent")
    public JSONObject getCompModelDataContent(@RequestParam(name = "processId",required = false) String processId,
                                              @RequestParam(name = "roomId",required = false) String roomId){
        JSONObject reJson = new JSONObject();
        try {
            if (!StringUtils.isEmpty(processId)&!StringUtils.isEmpty(roomId)){
                InspectRoomState inspectRoomState = new InspectRoomState();
                inspectRoomState.setPiid(processId);
                inspectRoomState.setRoomId(Integer.parseInt(roomId));
                InspectRoomState inspectRoom = dataManageAppService.getInspectFormJSON(inspectRoomState);
                reJson.put("code",0);
                if (inspectRoom!=null){
                    reJson.put("code",0);
                    reJson.put("dataJson",inspectRoom.getAppDatajson());
                }else{
                    reJson.put("code", 1);
                    reJson.put("msg","获取失败");
                }
            }else{
                reJson.put("code", 1);
                reJson.put("msg","app传入的参数为空");
            }
        } catch (Exception e) {
            reJson.put("code", 1);
            reJson.put("msg","获取失败");
            throw e;
        }
       return reJson;
    }
    /**
     * app提交机房未刷NFC卡原因
     * @param roomId 机房Id
     * @param processId 流程Id
     * @param appAccount 未刷卡原因
     * @author xp
     */
    @RequestMapping("getSubmitAccountApp")
    public JSONObject submitNoCreditNFCByApp(@RequestParam(name = "processId",required = false) String processId,
                                    @RequestParam(name = "roomId",required = false) String roomId,
                                    @RequestParam(name = "appAccount",required = false) String appAccount){
        JSONObject reJson = new JSONObject();
        try {
            if (!StringUtils.isEmpty(roomId)&!StringUtils.isEmpty(processId)){
                InspectRoomState inspectRoomState = new InspectRoomState();
                inspectRoomState.setRoomId(Integer.parseInt(roomId));
                inspectRoomState.setPiid(processId);
                inspectRoomState.setAppnfcaccount(appAccount);
                dataManageAppService.submitNoCreditNFCAccount(inspectRoomState);
                reJson.put("code", 0);
            }else{
                reJson.put("code", 2);
                reJson.put("msg", "app传入参数为空");
            }
        } catch (Exception e) {
            reJson.put("code", 1);
            reJson.put("msg", "提交失败");
            throw e;
        }
        return  reJson;
    }
    /**
     * app获取机房未刷完卡原因
     * @param roomId 机房Id
     * @param processId 流程Id
     * @author xp
     */
    @RequestMapping("getAccountNfcApp")
    public JSONObject getNoCreditNFCAccount(@RequestParam(name = "processId",required = false) String processId,
                                 @RequestParam(name = "roomId",required = false) String roomId){
        JSONObject reJson = new JSONObject();
        try {
            if (!StringUtils.isEmpty(roomId)&!StringUtils.isEmpty(processId)){
                InspectRoomState inspectRoomState = new InspectRoomState();
                inspectRoomState.setRoomId(Integer.parseInt(roomId));
                inspectRoomState.setPiid(processId);
                inspectRoomState = dataManageAppService.getNoCreditNFCAccount(inspectRoomState);
                if (inspectRoomState!=null){
                    reJson.put("code", 0);
                    reJson.put("appAccount", inspectRoomState.getAppnfcaccount());
                }else{
                    reJson.put("code", 1);
                }
            }else{
                reJson.put("code", 2);
                reJson.put("msg", "app传入参数为空");
            }
        } catch (Exception e) {
            reJson.put("code", 1);
            throw e;
        }
        return reJson;
    }
    /**
     * app提交机房巡检内容
     * @param dataJson 表单内容
     * @author xp
     */
    @RequestMapping(value = "getRoomDataByPhone", method = RequestMethod.POST)
    public JSONObject submitRoomDataInfo(@RequestParam(name = "datajson",required = false) String dataJson){
        JSONObject reJson = new JSONObject();
        JSONObject jsonObject = JSONObject.parseObject(dataJson);
        try {
            /*用户Id，用户名，机房Id，机房名称，流程Id，*/
            int staffId=jsonObject.getInteger("staffId");
            String userName = jsonObject.getString("userName");
            int roomId = jsonObject.getInteger("roomId");
            String roomName = jsonObject.getString("roomName");
            String processInstanceId = jsonObject.getString("processInstanceId");
            /*获取机房问题汇总*/
            JSONObject dataJsonb = jsonObject.getJSONObject("dataJsonb");
            String dataContext = dataJsonb.getString("dataContext");
            /*获取巡检异常值,1-正常，2-异常*/
            Integer excFlag = jsonObject.getInteger("excFlag");
            InspectRoomState inspectRoomState = new InspectRoomState();
            inspectRoomState.setUserId(staffId);
            inspectRoomState.setPiid(processInstanceId);
            inspectRoomState.setRoomId(roomId);
            inspectRoomState.setDatacontent(dataContext);
            inspectRoomState.setAppDatajson(dataJson);
            inspectRoomState.setIsnotexception(excFlag);
            inspectRoomState.setState(2);
            /*更新机房状态表,存储app提交的巡检表单*/
            dataManageAppService.updateRoomStateTable(inspectRoomState);
           /*a更新机房异常值表，为pc端展示异常机房及其异常值*/
            if(excFlag!=null&&excFlag>1){
                KvRoomException kvRoomException=new KvRoomException();
                kvRoomException.setProcInstId(processInstanceId);
                kvRoomException.setRoomId(roomId);
                kvRoomException.setRoomName(roomName);
                kvRoomException.setDataContext(dataContext);
                kvRoomException.setIsnotexcep(1);
                kvRoomException.setSubmitTime(new Date());
                kvRoomException.setUsername(userName);
                dataManageAppService.saveKvRoomException(kvRoomException);
            }
            reJson.put("code", 1);
        } catch (Exception e) {
            e.printStackTrace();
            reJson.put("code", 0);
            reJson.put("msg", "提交失败");
        }
        return reJson;
    }
    /**
     * app否决机房
     * @param processInStanceId 流程Id
     * @param roomId 机房Id
     * @param userId 被否决人Id
     * @param noUserId 否决人Id
     * @param submitEvaluation 否决原因
     * @param flag 标识符
     * @author xp
     * */
    @RequestMapping("getSendAppNfcData")
    public JSONObject submitVetoRoomByApp(@RequestParam(name = "ProcessInStanceId",required = false) String processInStanceId,
                               @RequestParam(name = "roomId",required = false) Integer roomId,
                               @RequestParam(name = "userId",required = false) Integer userId,
                               @RequestParam(name = "noUserId",required = false) Integer noUserId,
                               @RequestParam(name = "SubmitEvaluation",required = false) String submitEvaluation,
                               @RequestParam(name = "flag",required = false) Integer flag){
        JSONObject reJson=new JSONObject();
        try {
            if (!StringUtils.isEmpty(processInStanceId)&!StringUtils.isEmpty(roomId)&
                    !StringUtils.isEmpty(userId)){
                KvEvaluate kvEvaluate = new KvEvaluate();
                kvEvaluate.setProcessid(processInStanceId);
                kvEvaluate.setRoomid(roomId);
                kvEvaluate.setUserid(userId);
                kvEvaluate.setNouserid(noUserId);
                kvEvaluate.setUsercontext(submitEvaluation);
                kvEvaluate.setCreatetime(new Date());
                dataManageAppService.submitVetoRoomByModel(kvEvaluate,flag);
                reJson.put("code", 0);
            }else{
                reJson.put("code", 2);
                reJson.put("msg", "app传入参数为空");
            }


        } catch (Exception e) {
            reJson.put("code", 0);
            throw e;
        }
        return reJson;
    }
}
