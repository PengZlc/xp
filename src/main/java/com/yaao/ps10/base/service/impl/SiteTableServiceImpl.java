package com.yaao.ps10.base.service.impl;

import com.yaao.ps10.base.mapper.SiteTableMapper;
import com.yaao.ps10.base.model.SiteTable;
import com.yaao.ps10.base.service.SiteTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SiteTableServiceImpl implements SiteTableService {
    @Resource
    SiteTableMapper siteTableMapper;

    @Override
    public List<SiteTable> getSiteInfoById(int id) {
        return siteTableMapper.getSiteInfoById(id);
    }
}
