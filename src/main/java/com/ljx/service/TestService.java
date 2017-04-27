package com.ljx.service;

import com.github.pagehelper.PageHelper;
import com.ljx.entity.SystemUsers;
import com.ljx.mapper.SystemUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tasty on 2017/3/24 0024.
 */
@Service
public class TestService {

    @Autowired
    SystemUsersMapper systemUsersMapper;

    public List<SystemUsers> listAll() {
        return systemUsersMapper.selectAll();
    }

}
