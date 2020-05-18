package com.yaao.ps10.base.service;

import com.yaao.ps10.base.model.DutyAssignPlace;

import java.util.List;

public interface DutyAssignService {

    /**
     *获取所有巡检区域
     * */
    List<DutyAssignPlace> getDutyAssignPlace();
}
