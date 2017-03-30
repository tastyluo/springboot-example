package com.ljx.service;

import com.github.pagehelper.PageHelper;
import com.ljx.mapper.NodemetaMapper;
import com.ljx.entity.Nodemeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tasty on 2017/3/24 0024.
 */
@Service
public class NodeMetaService {

    @Autowired
    NodemetaMapper nodemetaMapper;

    public List<Nodemeta> listNodeMeta() {
        PageHelper.offsetPage(1, 10);
        return nodemetaMapper.selectAll();
    }

}
