package com.ljx.mapper;

import com.ljx.common.MyMapper;
import com.ljx.entity.SystemUsers;
import com.ljx.model.User;
import org.apache.ibatis.annotations.Param;

public interface SystemUsersMapper extends MyMapper<SystemUsers> {

    User selectUserAndRolesByName(@Param("username") String username);

}