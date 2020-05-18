package com.yaao.ps10.app.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaao.ps10.app.service.InspectWorkAppService;
import com.yaao.ps10.base.model.SiteTable;
import com.yaao.ps10.base.model.UserTable;
import com.yaao.ps10.web.model.*;
import com.yaao.ps10.web.service.InspectWorkService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.io.File;
import java.util.*;
@RestController
@RequestMapping("/app")
public class InspectWorkAppController {
    @Resource
    InspectWorkService inspectWorkService;
    @Resource
    InspectWorkAppService inspectWorkAppService;
    @Resource
    ServletContext servletContext;

    /**
    *app获取巡检记录，新任务/待办任务
    * @param userId 用户Id
    * @param userName 用户名称
    * @author xp
    * */
    @ResponseBody
    @RequestMapping("/getInspectWorkForApp")
    public JSONObject getUnInspectWorkByApp(@RequestParam(name="userId") String userId,
                                            @RequestParam(name="userName") String userName){
        JSONObject reJson = new JSONObject();
        JSONObject jsonObject = new JSONObject();
        Map<String, Object> map = new HashMap<>();
        map.put("userId",userId);
        map.put("userName",userName);
        List<InspectWork> list;
        JSONArray jsonArrayN = new JSONArray();
        JSONArray jsonArrayO = new JSONArray();
        try {
           /* 根据用户ID和用户名获取所有巡检任务*/
            list = inspectWorkService.getInspectWorkByMap(map);
            /*组装APP所需JSON格式*/
            list.forEach(s->{
                            if (s.getFlag()==0){//新任务
                                JSONObject obj = new JSONObject();
                                obj.put("TaskId",s.getId());
                                obj.put("TaskName", s.getName());
                                obj.put("TaskType", 1);
                                obj.put("Grade", s.getGrade());
                                obj.put("RequiredEndTime", s.getRequiredendtime());
                                obj.put("ProcessInStanceId", s.getPiid());
                                obj.put("BussinessKey", s.getBusinesskey());
                                obj.put("taskDefKey", s.getTaskdefkey());
                                obj.put("UserName", s.getInitiateuser()!=null?s.getInitiateuser():"");
                                obj.put("nfcCode",s.getNfccode()!=null?s.getNfccode():2);
                                obj.put("compNfcNum",s.getValidinflag());//NFC完成卡数量
                                obj.put("nfcCount", s.getValidinstate());//NFC卡总数量
                                obj.put("note", s.getNote()!=null?s.getNote():"");//备注
                                jsonArrayN.add(obj);
                            }else{//待办任务
                                JSONObject obj = new JSONObject();
                                obj.put("TaskId",s.getId());
                                obj.put("TaskName", s.getName());
                                obj.put("TaskType", 1);
                                obj.put("Grade", s.getGrade());
                                obj.put("RequiredEndTime", s.getRequiredendtime());
                                obj.put("ProcessInStanceId", s.getPiid());
                                obj.put("BussinessKey", s.getBusinesskey());
                                obj.put("taskDefKey", s.getTaskdefkey());
                                obj.put("UserName", s.getInitiateuser()!=null?s.getInitiateuser():"");
                                obj.put("nfcCode",s.getNfccode()!=null?s.getNfccode():2);
                                obj.put("compNfcNum",s.getValidinflag());//NFC完成卡数量
                                obj.put("nfcCount", s.getValidinstate());//NFC卡总数量
                                obj.put("note", s.getNote()!=null?s.getNote():"");//备注
                                jsonArrayO.add(obj);
                            }
                        }
                    );
            jsonObject.put("NewFlag",jsonArrayN);
            jsonObject.put("OldFlag",jsonArrayO);
            reJson.put("Winfo",jsonObject);
        }catch (Exception e){
            reJson.put("code",0);
            reJson.put("msg","获取失败");
            throw e;
        }
        return reJson;
    }
    /**
     * app获取巡检任务，已完成/超时任务
     * @param userId 用户Id
     * @param userName 用户名
     * @param rows 行
     * @param page 页
     * @param flag 标识
     * @author xp
     * */
    @RequestMapping("SendComplateWork")
    public JSONObject getComplInspectWork(@RequestParam(name="userId") String userId,
                                 @RequestParam(name="userName") String userName,
                                @RequestParam(name="rows") Integer rows,
                                 @RequestParam(name="page") Integer page,
                                 @RequestParam(name="flag") Integer flag){
        JSONObject	 reJson = new JSONObject();
        Map<String, Object> map = new HashMap<>();
        map.put("rows", rows);
        map.put("page", page);
        map.put("userId", userId);
        map.put("userName", userName);
        map.put("flag", flag);
        try {
            JSONArray jsonArray = new JSONArray();
            PageInfo<InspectWork> pageInfo = PageHelper.startPage(page,rows).doSelectPageInfo(()
                    ->inspectWorkService.getCompInspectWorkByMap(map).forEach(s->{
                /*组装app所需要的JSON格式*/
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("TaskId",s.getId());
                jsonObject.put("TaskName",s.getName());
                jsonObject.put("TaskType",1);
                jsonObject.put("Grade",s.getGrade());
                jsonObject.put("RequiredEndTime",s.getRequiredendtime());
                jsonObject.put("ProcessInStanceId",s.getPiid());
                jsonObject.put("BussinessKey",s.getBusinesskey());
                jsonObject.put("taskDefKey",s.getTaskdefkey());
                jsonObject.put("UserName",s.getInitiateuser()!=null?s.getInitiateuser():"");
                jsonObject.put("nfcCode",s.getNfccode()!=null?s.getNfccode():2);
                jsonObject.put("compNfcNum",s.getValidinflag());//NFC完成卡数量
                jsonObject.put("nfcCount",s.getValidinstate());//NFC卡总数量
                jsonObject.put("overTime",s.getOverTime());
                jsonObject.put("note",s.getNote()!=null?s.getNote():"");//备注
                jsonArray.add(jsonObject);
            }));
            reJson.put("workCount", pageInfo.getTotal());
            reJson.put("Xinfo", pageInfo.getList());
        } catch (Exception e) {
            reJson.put("code",0);
            reJson.put("msg","获取失败");
            throw e;
        }
        return reJson;
    }
    /**
    * app获取巡检/维护站点机房
    * @param  taskType 获取类型 0-获取站点信息
    * @param id 巡检任务主键
    * @param processInstanceId 巡检流程Id
    * @param userId 用户Id
    * @author xp
    * */
    @ResponseBody
    @RequestMapping("/SendRoomState")
    public JSONObject getSiteAndRoomByWorkType(@RequestParam(value="taskType",defaultValue = "0") Integer taskType,
                                           @RequestParam(name="id",defaultValue = "0") Integer id,
                                           @RequestParam(name="processInstanceId",defaultValue = "0") String processInstanceId,
                                           @RequestParam(name="siteId",defaultValue = "0") String siteId,
                                           @RequestParam(name="userId",defaultValue = "0") String userId){

        JSONObject reJson = new JSONObject();
        List<RoomState> roomStateVoList;
        try{
            if(taskType==0){//获取巡检站点信息
                List<SiteTable>  list = inspectWorkService.getSiteInfoById(id,taskType);
                JSONArray jsonArray = new JSONArray();
                list.forEach(s->{
                    JSONObject obj = new JSONObject();
                    obj.put("ID",s.getId());
                    obj.put("SIte_NAME",s.getSiteName());
                    jsonArray.add(obj);
                });
                //获取机房NFC卡总数与完成数
                String nfcCount = inspectWorkService.getNfcCountById(255);
                reJson.put("siteInfo",jsonArray);
                reJson.put("nfcNums",nfcCount);
            }else if(taskType==3){//获取维护站点信息，弃用
                System.out.println("这是一个弃用body");
            }else{
                if(taskType==1){//获取站点下机房信息
                    InspectWork inspectWork = inspectWorkService.getInspectWork(id);
                    if(inspectWork.getIstempinsp()==2){//判断是否为临时巡检任务,isTempInsp字段，1-日常，2临时
                        roomStateVoList =  inspectWorkService.getRoomInfoById(processInstanceId,userId,0,siteId);
                        reJson.put("info", JSONArray.toJSON(roomStateVoList));
                    }else if(inspectWork.getIstempinsp()==1){
                        roomStateVoList =  inspectWorkService.getRoomInfoById(processInstanceId,userId,1,siteId);
                        reJson.put("info", JSONArray.toJSON(roomStateVoList));
                    }
                    reJson.put("workFlag", inspectWork.getIstempinsp());
                    reJson.put("nfcCode", inspectWork.getNfccode());
                    reJson.put("deviceType", 0);
                }
                else if(taskType == 2){//获取维护机房信息，弃用
                    System.out.println("这是一个弃用body");
                }
            }
        }catch (Exception e){
            reJson.put("msg","获取失败");
            throw e;
        }
        return reJson;
    }

    /**
     * app获取任务机房下图片信息
     * @param processInstanceId 流程Id
     * @param roomId 机房Id
     */
    @RequestMapping("/sendAppPicNames")
    public JSONObject sendAppPicNames(@RequestParam(name="processInstanceId",required = false) String processInstanceId,
                                      @RequestParam(name="roomId",required = false) String roomId){
        JSONObject	 reJson = new JSONObject();
        JSONObject jsonObject = new JSONObject();
        /*项目路径*/
        String path = servletContext.getRealPath("/");
        if (!StringUtils.isEmpty(processInstanceId)&!StringUtils.isEmpty(roomId)){
           /* 巡检机房图片路径*/
            String dirPath = path + "TaskPic\\" + processInstanceId + "\\" + roomId;
            File file = new File(dirPath);
            /*获取图片数组*/
            File[] files = file.listFiles();
            JSONArray jsonArray = new JSONArray();
            if (files!=null){
                Arrays.asList(files).forEach(f-> jsonArray.add(f.getName()));
                jsonObject.put("picNames",jsonArray);
            }else{
                jsonObject.put("picNames", "");
            }
        }else{
            jsonObject.put("picNames", "");
        }
        reJson.put("info", jsonObject.toString());
        return reJson;
    }
    /**
     * app提交机房状态信息
     * @param id 流程Id
     * @param roomId 机房Id
     * @param state 机房状态
     * @param taskType 类型 1-巡检，2-维护
     */
    @RequestMapping("/ReFreshRoomState")
    public JSONObject reFreshRoomState( @RequestParam(name="id",required = false) Integer id,
                                        @RequestParam(name="roomId",required = false) Integer roomId,
                                        @RequestParam(name="state",required = false) Integer state,
                                        @RequestParam(name="taskType",required = false) Integer taskType){
        JSONObject	reJson = new JSONObject();
        try {
            InspectRoomState inspectRoomState=new InspectRoomState();
            inspectRoomState.setWorkId(id);
            inspectRoomState.setRoomId(roomId);
            inspectRoomState.setWorkType(taskType);
            /*获取指定机房状态信息*/
            InspectRoomState roomState = inspectWorkService.getInspectRoomState(inspectRoomState);
            roomState.setState(state);
            /*更新指定机房状态*/
            inspectWorkService.updateRoomState(roomState);
            reJson.put("code", 1);
        } catch (Exception e) {
            reJson.put("code", 0);
        }
        return reJson;
    }
    /**
     * app提交巡检机房未完成原因
     * @param flag 原因 1-巡检人员提交巡检任务已超时的原因，2-巡检人员提交巡检结束之后发现的问题，3-巡检人员提交巡检机房不能按时完成的原因
     * @param processInstanceId 流程Id
     * @param userId 用户Id
     * @param roomId 机房Id
     * @param reason 未完成原因
     */
    @RequestMapping("/submitAppReasonData")
    public JSONObject submitAppReasonData(@RequestParam(name="flag",defaultValue = "0") Integer flag,
                                      @RequestParam(name="reason",defaultValue = "0") String reason,
                                    @RequestParam(name="roomId",defaultValue = "0") Integer roomId,
                                    @RequestParam(name="userId",defaultValue = "0") String userId,
                                    @RequestParam(name="processInstanceId",defaultValue = "0") String processInstanceId){
        JSONObject reJson = new JSONObject();
        int code=1;
        try {
            InspectWork inspectWork = new InspectWork();
            inspectWork.setRoomid(roomId);
            inspectWork.setUserid(userId);
            inspectWork.setPiid(processInstanceId);
            inspectWork.setUncompletereason(reason);
            inspectWorkService.updateInspectStateById(inspectWork,flag);
            reJson.put("code", code);
            reJson.put("msg","提交成功");
        } catch (Exception e) {
            reJson.put("code", 0);
            reJson.put("msg","提交失败");
            throw e;
        }
        return reJson;
    }
    /**
     * app获取巡检任务问题汇总
     * @param processInstanceId 巡检流程Id
     */
    @RequestMapping("/getInspectDataContent")
    public JSONObject getInspectDataContent(@RequestParam(name="processInstanceId",defaultValue = "0") String processInstanceId){
        JSONObject reJson = new JSONObject();
        JSONArray jsonArray=new JSONArray();
        List<KvRoomException> list;
        try {
            if(!processInstanceId.trim().equals("")){
                KvRoomException kvRoomException = new KvRoomException();
                kvRoomException.setProcInstId(processInstanceId);
                list=inspectWorkService.getKvRoomExceptionById(kvRoomException);
                /*组装APP所需JSON格式*/
                list.forEach(s->{
                    JSONObject json=new JSONObject();
                    json.put("roomId", s.getRoomId());
                    json.put("roomName", s.getRoomName());
                    json.put("subTime", s.getSubmitTime());
                    json.put("dataContext", s.getDataContext());
                    jsonArray.add(json);
                });
                reJson.put("info", jsonArray);
                reJson.put("code", 1);
            }
        } catch (Exception e) {
            reJson.put("code", 0);
            throw e;
        }
        return reJson;
    }
    /**
     * app开始任务
     * @param taskId 任务Id
     * @param userId 用户Id
     * @param taskType 任务类型 1-巡检，2-维护、弃用
     * @author xp
     * */
    @RequestMapping("/StartWorkFlag")
    public JSONObject StartWorkFlag(@RequestParam(name="taskType",defaultValue = "0") Integer taskType,
                              @RequestParam(name="userId",defaultValue = "0") Integer userId,
                               @RequestParam(name="taskId",defaultValue = "0") String taskId){
        JSONObject reJson = new JSONObject();
        try {
            if(taskType == 1){//开始巡检任务
                InspectWork inspectWork = inspectWorkService.getInspectWork(Integer.parseInt(taskId));
                if(!StringUtils.isEmpty(inspectWork)){
                    inspectWork.setFlag(1);
                    inspectWork.setActualstarttime(new Date());
                    /*更新巡检任务状态,1-正在处理中*/
                    inspectWorkService.updateInspectWork(inspectWork);
                    InspectUser inspectUser = new InspectUser();
                    inspectUser.setProcessId(inspectWork.getPiid());
                    inspectUser.setUserId(userId);
                    inspectUser.setState(1);
                    /*更新个人巡检任务状态，1-正在处理中*/
                    inspectWorkService.updateInspectUser(inspectUser);
                    reJson.put("code", 1);
                }else{
                    reJson.put("code", 0);
                    reJson.put("msg", "流程ID为空");
                }
            }else if(taskType == 2) {//开始维护任务，弃用
                System.out.println("这是一个弃用body");
            }
        } catch (Exception e) {
            e.printStackTrace();
            reJson.put("code", 0);
            reJson.put("msg", "开始任务失败");
        }
        return reJson;
    }
    /**
     * app提交巡检任务
     * @param taskId 任务Id
     * @param taskType 1-巡检任务，2-维护任务 弃用
     * @author xp
     * */
    @RequestMapping("/SubmitInspectByPhone")
    public JSONObject SubmitInspectByApp(@RequestParam(name="taskType",defaultValue = "0") Integer taskType,
                                   @RequestParam(name="userId",defaultValue = "0") Integer userId,
                                   @RequestParam(name="taskId",defaultValue = "0") String taskId,
                                   @RequestParam(name="processInstanceId",defaultValue = "0") String processInstanceId){
        JSONObject reJson = new JSONObject();
        InspectWork inspectWork = null;
        try{
            boolean flag = false;
            if(taskType == 1){
                inspectWork = inspectWorkService.getInspectWork(Integer.parseInt(taskId));
                if(!StringUtils.isEmpty(inspectWork)){
                    flag = true;
                }
            }else if(taskType == 2){
                System.out.println("这是一个弃用body");
            }
            if(flag){
                try {
                    if(taskType == 1){//提交巡检任务
                        int userCount = inspectWork.getUsercount()-1;
                        inspectWork.setUsercount(userCount);
                        if(userCount == 0){
                            inspectWork.setFlag(2);
                            inspectWork.setValidinflag(2);
                            inspectWork.setEndtime(new Date());
                        }
                        inspectWorkService.updateInspectWork(inspectWork);
                        InspectUser inspectUser = new InspectUser();
                        inspectUser.setProcessId(processInstanceId);
                        inspectUser.setUserId(userId);
                        inspectUser.setState(2);
                       /* 完成个人任务状态  完成状态-2*/
                        inspectWorkService.updateInspectUser(inspectUser);
                    }else if(taskType == 2){//提交维护任务，弃用
                        System.out.println("这是一个弃用body");
                    }
                    reJson.put("code", 1);
                } catch (Exception e) {
                    reJson.put("code", 0);
                    e.printStackTrace();
                }
            }else{
                reJson.put("code", 0);
            }
        }catch (Exception e){
            reJson.put("msg", "提交失败");
            throw e;
        }
     return reJson;
    }

    /**
     * app获取NFC卡信息
     * @param processInstanceId 流程Id
     * @param roomId 机房Id
     * @author xp
     */
    @RequestMapping("/SendNfcDataById")
    public JSONObject SendNfcDataById(@RequestParam(name="processInstanceId",defaultValue = "0") String processInstanceId,
                                      @RequestParam(name="roomId",defaultValue = "0") String roomId){
        JSONObject reJson = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        if(!StringUtils.isEmpty(processInstanceId)&!StringUtils.isEmpty(roomId)){
            NfcDataTable nfcDataTable = new NfcDataTable();
            nfcDataTable.setProcessId(processInstanceId);
            nfcDataTable.setRoomId(Integer.parseInt(roomId));
            List<NfcDataTable> list =inspectWorkService.getNfcDataInfo(nfcDataTable);
            /*组装APP所需JSON格式*/
            list.forEach(s->{
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("ID",s.getId());
                jsonObject.put("State",s.getState());
                jsonObject.put("Creare_User",s.getCreareUser());
                jsonObject.put("Create_Time",s.getCreateTime());
                jsonObject.put("Nfc_Code",s.getNfcCode());
                jsonObject.put("Process_Id",s.getProcessId());
                jsonObject.put("Room_Id",s.getRoomId());
                jsonObject.put("Room_Name",s.getRoomName());
                jsonObject.put("devicePlace",s.getDevicePlace());
                jsonObject.put("sourcePlace",s.getSourcePlace());
                jsonArray.add(jsonObject);
            });
            reJson.put("info", jsonArray);
        }
        return reJson;
    }

    /**
     * app更新NFC卡状态
     * @param processInstanceId 流程Id
     * @param roomId 机房Id
     * @param nfcCode NFC卡号
     * @param userName 提交人
     * @author xp
     */
    @RequestMapping("UpDataByAppId")
    public JSONObject upDateNFCInfo(@RequestParam(name="processInstanceId",defaultValue = "0") String processInstanceId,
                                     @RequestParam(name="roomId",defaultValue = "0") String roomId,
                                     @RequestParam(name="nfcCode",defaultValue = "0") String nfcCode,
                                    @RequestParam(name="userName",defaultValue = "0") String userName){
        JSONObject reJson = new JSONObject();
        try {
            if(!StringUtils.isEmpty(processInstanceId)&!StringUtils.isEmpty(roomId)&!StringUtils.isEmpty(nfcCode)){
                NfcDataTable nfcDataTable = new NfcDataTable();
                nfcDataTable.setProcessId(processInstanceId);
                nfcDataTable.setRoomId(Integer.parseInt(roomId));
                nfcDataTable.setNfcCode(nfcCode);
               /* 判断卡号是否存在*/
                NfcDataTable nfcData = inspectWorkService.getNfcModelByNfc(nfcDataTable);
                if(nfcData!=null){
                    if(nfcData.getState()==0){
                        nfcData.setState(1);
                        nfcData.setCreareUser(userName);
                        inspectWorkService.updateNfcStateByNfc(nfcData);
                        reJson.put("code", 1);
                    }else{
                        reJson.put("code", 1);
                    }
                }
            }else{
                reJson.put("code", 2);
                reJson.put("msg", "传入Id为空");
            }
        } catch (Exception e) {
            reJson.put("code", 0);
            reJson.put("msg", "app提交失败");
        }
        return reJson;
    }
    /**
     * app获取巡检评估情况
     * @param userId 登录用户Id
     * @param processInstanceId 流程Id
     * @param flag !=null 获取评估后信息，null 评估列表
     * @author xp
     */
    @RequestMapping("APPgetValidInspect")
    public JSONObject getValidInspectByApp(@RequestParam(name="userid",defaultValue = "0") String userId,
                                     @RequestParam(name="flag", required = false) Integer flag,
                                     @RequestParam(name="processInstanceId",defaultValue = "0") String processInstanceId){
        Map<String,Object> map = new HashMap<>();
        map.put("processInstanceId",processInstanceId);
        map.put("flag",flag);
        map.put("userId",userId);
        UserTable userTable = inspectWorkAppService.getUserInfoById(Integer.parseInt(userId));
        map.put("deptId",userTable.getDepartmentid());
        map.put("roleId",userTable.getRoleid());
        JSONObject reJson = new JSONObject();
        if(flag!=null){
            if(flag==1&&!StringUtils.isEmpty(processInstanceId)){//获取评估后的详情
                List<KvEvaluate> list = inspectWorkService.getEvaluateById(processInstanceId);
                reJson.put("inspectInfo", JSONArray.toJSON(list));
                String path = servletContext.getRealPath("/");
                JSONArray jsonArray = new JSONArray();
                JSONObject jsonObject = new JSONObject();
                JSONArray pictureJs = new JSONArray();
               /* 获取该任务下所有机房id以及其图片名称*/
                list.forEach(s->{
                    String dirPath=path + "EvaluatePic\\" + processInstanceId + "\\" + s.getRoomid();
                    File file = new File(dirPath);
                    File[] files =  file.listFiles();
                    if (files!=null){
                        Arrays.asList(files).forEach(f-> jsonArray.add(f.getName()));
                        jsonObject.put("picNames",jsonArray);
                    }else{
                        jsonObject.put("picNames", "");
                    }
                    pictureJs.add(jsonObject);
                });
                reJson.put("picNames", pictureJs);
            }else{
                List<InspectWork> list = inspectWorkAppService.getWaitAssessmentByMap(map);
                reJson.put("inspectInfo", JSONArray.toJSON(list));
            }

        }else{//获取待评估列表
            List<InspectWork> list = inspectWorkAppService.getWaitAssessmentByMap(map);
            reJson.put("inspectInfo", JSONArray.toJSON(list));
        }
       return reJson;
    }
    /**
     *app获取已否决过的巡检任务
     * @param loginId 登录人员Id
     * @param userId 人员筛选Id
     * @author xp
     */
    @RequestMapping("/sendAppOverValidInspect")
    public JSONObject getVetoInspectWorkByApp(@RequestParam(name="userId",required = false) String userId,
                                        @RequestParam(name="loginId",required = false) String loginId){
        JSONObject reJson = new JSONObject();
        try {
            UserTable userTable = inspectWorkAppService.getUserInfoById(Integer.parseInt(userId));
            HashMap<String, Object>  map = new HashMap<>();
            map.put("deptId",userTable.getDepartmentid());
            map.put("roleId",userTable.getRoleid());
            map.put("userId", userId);
            map.put("loginId", loginId);
            List<KvEvaluate> list = inspectWorkAppService.getKvEvaluateByMap(map);
            /*组装APP所需JSON格式*/
            JSONArray jsonArray = new JSONArray();
            list.forEach(s->{
                JSONObject json = new JSONObject();
                json.put("ProcessId",s.getProcessid());
                json.put("UserId",s.getUserid());
                json.put("UserName",s.getUserName());
                json.put("taskUserName",s.getTaskName());
                json.put("taskId",s.getTaskId());
                jsonArray.add(json);
            });
            reJson.put("userInfo", jsonArray);
            reJson.put("code", 1);
        } catch (Exception e) {
            reJson.put("code", 0);
            reJson.put("msg", "获取失败");
            throw e;
        }
       return reJson;
    }

    /**
     * app评估功功能，根据登录人员筛选列表
     * @param userId 用户Id
     * @author xp
     */
    @RequestMapping("getUserInfo")
    public JSONObject getUserInfo(@RequestParam(name="userId",required = false) String userId){
        JSONObject reJson=new JSONObject();
        try {
            if (!StringUtils.isEmpty(userId)){
                UserTable userTable = inspectWorkAppService.getUserInfoById(Integer.parseInt(userId));
                List<UserTable> list = inspectWorkAppService.getUserInfoByUser(userTable);
                /*组装APP所需JSON格式*/
                JSONArray jsonArray = new JSONArray();
                list.forEach(s->{
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("Type",s.getMemberid());
                    jsonObject.put("Name",s.getUsername());
                    jsonArray.add(jsonObject);
                });
                reJson.put("userInfo", jsonArray);
            }
        } catch (Exception e) {
            reJson.put("msg","获取失败");
            throw e;
        }
       return reJson;
    }
}
