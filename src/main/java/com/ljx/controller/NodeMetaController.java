package com.ljx.controller;

import com.ljx.entity.Nodemeta;
import com.ljx.service.NodeMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tasty on 2017/3/22 0022.
 */
@RestController
@RequestMapping("/nodeMeta")
public class NodeMetaController {

    @Autowired
    NodeMetaService nodeMetaService;

    @RequestMapping("/listAll")
    public List<Nodemeta> listAllNodeMeta() {
        return nodeMetaService.listNodeMeta();
    }

    @RequestMapping("/info22")
    public Object getInfo2() {
        return "hello world";
    }

}
