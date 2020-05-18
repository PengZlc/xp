package com.yaao.ps10.base.service.impl;

import com.yaao.ps10.base.mapper.DutyAssignPlaceMapper;
import com.yaao.ps10.base.model.DutyAssignPlace;
import com.yaao.ps10.base.service.DutyAssignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DutyAssignServiceImpl implements DutyAssignService {

    @Resource
    DutyAssignPlaceMapper dutyAssignPlaceMapper;
    @Override
    public List<DutyAssignPlace> getDutyAssignPlace() {
        return dutyAssignPlaceMapper.selectAll();
    }
}
