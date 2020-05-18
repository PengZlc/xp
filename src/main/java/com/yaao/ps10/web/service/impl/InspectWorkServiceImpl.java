package com.yaao.ps10.web.service.impl;

import com.yaao.ps10.base.mapper.NfcRecordMapper;
import com.yaao.ps10.base.mapper.RoomTableMapper;
import com.yaao.ps10.base.mapper.SiteTableMapper;
import com.yaao.ps10.base.model.RoomTable;
import com.yaao.ps10.base.model.SiteTable;
import com.yaao.ps10.web.mapper.*;
import com.yaao.ps10.web.model.*;
import com.yaao.ps10.web.service.InspectWorkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class InspectWorkServiceImpl implements InspectWorkService {
    @Resource
    InspectWorkMapper inspectWorkMapper;
    @Resource
    SiteTableMapper siteTableMapper;
    @Resource
    NfcRecordMapper nfcRecordMapper;
    @Resource
    RoomStateMapper roomStateMapper;
    @Resource
    InspectRoomStateMapper inspectRoomStateMapper;
    @Resource
    InspectUserMapper inspectUserMapper;
    @Resource
    KvRoomExceptionMapper kvRoomExceptionMapper;
    @Resource
    RoomTableMapper roomTableMapper;
    @Resource
    NfcDataTableMapper nfcDataTableMapper;
    @Resource
    KvEvaluateMapper kvEvaluateMapper;

    @Override
    public InspectWork getInspectWork(int id) {
        return inspectWorkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delInspectWorkById(int id) {
        return inspectWorkMapper.deleteByPrimaryKey(id);
    }


    @Override
    public List<InspectWork> getInspectWorkByMap(Map<String,Object> map) {
        return inspectWorkMapper.getInspectWorkByMap(map);
    }


    @Override
    public String getNfcCountById(Integer id) {
        return nfcRecordMapper.getNfcCountById(id);
    }

    @Override
    public List<SiteTable> getSiteInfoById(int id, int type) {
        if(type==0){
            return siteTableMapper.getSiteInfoById(id);
        }
        return null;
    }

    @Override
    public List<RoomState> getRoomInfoById(String processInstanceId, String userId, int i, String siteId) {
        return roomStateMapper.getRoomInfoById(processInstanceId,userId,i,siteId);
    }

    @Override
    public InspectRoomState getInspectRoomState(InspectRoomState inspectRoomState) {
        return inspectRoomStateMapper.getInspectRoomState(inspectRoomState);
    }

    @Override
    public void updateRoomState(InspectRoomState roomState) {
        inspectRoomStateMapper.updateByPrimaryKey(roomState);
    }

    @Override
    public void updateInspectStateById(InspectWork inspectWork, Integer flag) {
        if(flag==1){
            /*更新人员状态*/
            InspectUser inspectUser = new InspectUser();
            inspectUser.setState(2);
            inspectUser.setProcessId(inspectWork.getPiid());
            inspectUser.setUserId(Integer.parseInt(inspectWork.getUserid()));
            inspectUserMapper.updateInspectUser(inspectUser);
            /*更新巡检任务未完成原因*/
            inspectWorkMapper.updateInspectWork(inspectWork);
        }else if(flag==2){
            KvRoomException kvRoomException = new KvRoomException();
            kvRoomException.setProcInstId(inspectWork.getPiid());
            kvRoomException.setRoomId(inspectWork.getRoomid());
            kvRoomException.setSubmitTime(new Date());
            kvRoomException.setDataContext(inspectWork.getUncompletereason());
            /*查询机房异常表中是否存在当前数据，存在累加，否则新增*/
            long count = kvRoomExceptionMapper.countByExample(kvRoomException);
            if(count>0){
                kvRoomExceptionMapper.updateByPrimaryKeySelective(kvRoomException);
            }else{
                /*获取机房信息*/
                RoomTable roomTable = roomTableMapper.selectByPrimaryKey(inspectWork.getRoomid());
                kvRoomException.setRoomName(roomTable.getRoomName());
                kvRoomExceptionMapper.insert(kvRoomException);
            }
        }else{
            InspectRoomState inspectRoomState = new InspectRoomState();
            inspectRoomState.setRoomId(inspectWork.getRoomid());
            inspectRoomState.setPiid(inspectWork.getPiid());
            inspectRoomState.setReasondata(inspectWork.getUncompletereason());
            inspectRoomStateMapper.updateInspectRoomState(inspectRoomState);
        }
    }

    @Override
    public List<KvRoomException> getKvRoomExceptionById( KvRoomException kvRoomException) {
        return kvRoomExceptionMapper.selectByExample(kvRoomException);
    }

    @Override
    public void updateInspectWork(InspectWork inspectWork) {
        inspectWorkMapper.updateByPrimaryKey(inspectWork);
    }

    @Override
    public void updateInspectUser( InspectUser inspectUser) {
       inspectUserMapper.updateInspectUser(inspectUser);
    }

    @Override
    public List<NfcDataTable> getNfcDataInfo(NfcDataTable nfcDataTable) {
        return nfcDataTableMapper.getNFCDataInfo(nfcDataTable);
    }

    @Override
    public NfcDataTable getNfcModelByNfc(NfcDataTable nfcDataTable) {
        return nfcDataTableMapper.getNfcModelByNfc(nfcDataTable);
    }

    @Override
    public void updateNfcStateByNfc(NfcDataTable nfcDataTable) {
        nfcDataTableMapper.updateByPrimaryKeySelective(nfcDataTable);
    }

    @Override
    public List<KvEvaluate> getEvaluateById(String processInstanceId) {
        return kvEvaluateMapper.getKvEvaluateById(processInstanceId);
    }

    @Override
    public List<InspectWork> getInspectListByMap(Map<String, Object> map) {
        return inspectWorkMapper.getInspectListByMap(map);
    }

    @Override
    public void startInspectWork() {
        System.out.println("开始巡检任务了");
    }

    @Override
    public List<InspectWork> getAllInspectWorkList() {
        return inspectWorkMapper.getAllInspectWorkList();
    }

    @Override
    public List<InspectWork> getCompInspectWorkByMap(Map<String, Object> map) {
        return inspectWorkMapper.getCompInspectWorkByMap(map);
    }
}
