package com.yaao.ps10.base.mapper;

import com.yaao.ps10.base.model.UserTable;
import com.yaao.ps10.base.model.UserTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTableMapper {
    long countByExample(UserTableExample example);

    int deleteByExample(UserTableExample example);

    int deleteByPrimaryKey(Integer memberid);

    int insert(UserTable record);

    int insertSelective(UserTable record);

    List<UserTable> selectByExample(UserTableExample example);

    UserTable selectByPrimaryKey(Integer memberid);

    int updateByExampleSelective(@Param("record") UserTable record, @Param("example") UserTableExample example);

    int updateByExample(@Param("record") UserTable record, @Param("example") UserTableExample example);

    int updateByPrimaryKeySelective(UserTable record);

    int updateByPrimaryKey(UserTable record);

    String selectLeaderByUserId(Integer id);

    List<UserTable> getUserInfoByUser(UserTable userTable);

    UserTable selectByParams(@Param("userName") String userName,@Param("pwd") String pwd);

    UserTable selectByUser(UserTable userTable);
}