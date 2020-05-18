package com.yaao.ps10.web.controller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yaao.ps10.base.model.DutyAssignPlace;
import com.yaao.ps10.base.service.DutyAssignService;
import com.yaao.ps10.web.model.InspectWork;
import com.yaao.ps10.web.service.InspectWorkService;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/inspect")
public class InspectWorkController {


    @Resource
    InspectWorkService inspectWorkService;
    @Resource
    DutyAssignService dutyAssignService;

    /**
     * 获取巡检任务列表
     * @param page 页
     * @param limit 行
     * @param siteId 巡检区域Id
     * @param startTime 巡检开始时间
     * @param endTime 巡检结束时间
     * */
    @RequestMapping("/list")
    public String getInspectListByPage(@RequestParam(name="limit",required = false) Integer limit,
                                       @RequestParam(name="page",required = false) Integer page,
                                       @RequestParam(name="siteId",required = false) Integer siteId,
                                       @RequestParam(name="startTime",required = false) String startTime,
                                       @RequestParam(name="endTime",required = false) String endTime){
        JSONObject reJson = new JSONObject();
        /*组装查询条件*/
        Map<String, Object> map = new HashMap<>();
        map.put("siteId",siteId);
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        try{
            /*分页查询巡检记录*/
            PageInfo<InspectWork> pageInfo = PageHelper.startPage(page,limit).doSelectPageInfo(()
                    ->inspectWorkService.getInspectListByMap(map));
            reJson.put("code", 0);
            reJson.put("count",pageInfo.getTotal());
            reJson.put("data", pageInfo.getList());
        }catch (Exception e){
            reJson.put("code",1);
            reJson.put("msg","获取巡检列表失败");
            e.printStackTrace();
        }
        return reJson.toJSONString();
    }

    /**
     *获取巡检区域
     * */
    @RequestMapping("/area")
    public String getAreaInfo(){
        JSONObject reJson = new JSONObject();
        try{
            List<DutyAssignPlace> list = dutyAssignService.getDutyAssignPlace();
            reJson.put("info", JSONArray.toJSON(list));
            reJson.put("code", 0);
        }catch (Exception e){
            reJson.put("code",1);
            reJson.put("msg","获取巡检区域失败");
            e.printStackTrace();
        }
        return reJson.toJSONString();
    }


    public String startInspectWork(){
        JSONObject reJson = new JSONObject();
        try{
            List<DutyAssignPlace> list = dutyAssignService.getDutyAssignPlace();
            reJson.put("info", JSONArray.toJSON(list));
            reJson.put("code", 0);
        }catch (Exception e){
            reJson.put("code",1);
            reJson.put("msg","获取巡检区域失败");
            e.printStackTrace();
        }
        return reJson.toJSONString();
    }

}
