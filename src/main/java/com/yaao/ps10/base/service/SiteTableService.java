package com.yaao.ps10.base.service;

import com.yaao.ps10.base.model.SiteTable;

import java.util.List;

public interface SiteTableService {
    /*
     * 获取站点信息
     * */
   List<SiteTable> getSiteInfoById(int id);
}
