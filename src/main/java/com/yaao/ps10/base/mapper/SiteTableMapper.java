package com.yaao.ps10.base.mapper;

import com.yaao.ps10.base.model.SiteTable;
import com.yaao.ps10.base.model.SiteTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteTableMapper {
    long countByExample(SiteTableExample example);

    int deleteByExample(SiteTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SiteTable record);

    int insertSelective(SiteTable record);

    List<SiteTable> selectByExample(SiteTableExample example);

    SiteTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SiteTable record, @Param("example") SiteTableExample example);

    int updateByExample(@Param("record") SiteTable record, @Param("example") SiteTableExample example);

    int updateByPrimaryKeySelective(SiteTable record);

    int updateByPrimaryKey(SiteTable record);

    List<SiteTable> getSiteInfoById(Integer id);
}