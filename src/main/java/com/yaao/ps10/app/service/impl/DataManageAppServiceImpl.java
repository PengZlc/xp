package com.yaao.ps10.app.service.impl;

import com.yaao.ps10.app.service.DataManageAppService;
import com.yaao.ps10.web.mapper.InspectRoomStateMapper;
import com.yaao.ps10.web.mapper.KvEvaluateMapper;
import com.yaao.ps10.web.mapper.KvModelTableMapper;
import com.yaao.ps10.web.mapper.KvRoomExceptionMapper;
import com.yaao.ps10.web.model.InspectRoomState;
import com.yaao.ps10.web.model.KvEvaluate;
import com.yaao.ps10.web.model.KvModelTable;
import com.yaao.ps10.web.model.KvRoomException;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataManageAppServiceImpl implements DataManageAppService {
    @Resource
    InspectRoomStateMapper inspectRoomStateMapper;
    @Resource
    KvModelTableMapper kvModelTableMapper;
    @Resource
    KvRoomExceptionMapper kvRoomExceptionMapper;
    @Resource
    KvEvaluateMapper kvEvaluateMapper;

    @Override
    public InspectRoomState getInspectFormJSON(InspectRoomState inspectRoomState) {
        return inspectRoomStateMapper.getInspectRoomState(inspectRoomState);
    }

    @Override
    public String getInspectUnFormJSON(Integer roomId,Integer userId) {
        /*1.根据userId获取巡检模板表单
        2.若无返回表单，再根据roomId获取巡检模板表单
        3.若有返回表单且只有一种表单则不需要再根据roomId去获取表单，返回值大于1，那在根据roomId和userId联合获取表单*/
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId",userId);
        map.put("roomId",roomId);
        String formJson="";
        /*根据userId获取巡检模板表单*/
        List<KvModelTable> list = kvModelTableMapper.getKvModelTableByMap(map,0);
        if(list.size()>0){
            if(list.size()>1){
                list = kvModelTableMapper.getKvModelTableByMap(map,2);
                if (list.size()>0){
                    formJson = list.get(0).getModelcontent();
                }
            }else{
                formJson = list.get(0).getModelcontent();
            }
        }else{
            list = kvModelTableMapper.getKvModelTableByMap(map,1);
            if(list.size()>0){
                formJson = list.get(0).getModelcontent();
            }
        }
        return formJson;
    }

    @Override
    public void submitNoCreditNFCAccount(InspectRoomState inspectRoomState) {
        inspectRoomStateMapper.updateInspectRoomState(inspectRoomState);
    }

    @Override
    public InspectRoomState getNoCreditNFCAccount(InspectRoomState inspectRoomState) {
        return inspectRoomStateMapper.getInspectRoomState(inspectRoomState);
    }

    @Override
    public void updateRoomStateTable(InspectRoomState inspectRoomState) {
        inspectRoomStateMapper.updateInspectRoomState(inspectRoomState);
    }

    @Override
    public void saveKvRoomException(KvRoomException kvRoomException) {
        kvRoomExceptionMapper.insert(kvRoomException);
    }

    @Override
    public int submitVetoRoomByModel(KvEvaluate kvEvaluate, Integer flag) {
        int count = 0;
        if(flag!=null&&flag==1){
            count = kvEvaluateMapper.insert(kvEvaluate);
        }else{
            long num = kvEvaluateMapper.countBySelective(kvEvaluate);
            if (num>0){
                count = kvEvaluateMapper.updateByPrimaryKey(kvEvaluate);
            }else{
                kvEvaluate.setNouserid(null);
                count = kvEvaluateMapper.insert(kvEvaluate);
            }
        }
        return count;
    }
}
