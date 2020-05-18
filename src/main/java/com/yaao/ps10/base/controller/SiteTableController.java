package com.yaao.ps10.base.controller;

import com.yaao.ps10.base.model.SiteTable;
import com.yaao.ps10.base.service.SiteTableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/siteInfo")
public class SiteTableController {
   @Resource
    SiteTableService siteTableService;

    @RequestMapping("/getSiteInfoById")
    public String getSiteInfoById(){
        List<SiteTable> list = siteTableService.getSiteInfoById(255);
        return list.toString();
    }
}
