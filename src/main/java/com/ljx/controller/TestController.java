package com.ljx.controller;

import com.ljx.entity.SystemUsers;
import com.ljx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tasty on 2017/3/22 0022.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/listAll")
    public List<SystemUsers> listAllNodeMeta() {
        return testService.listAll();
    }

    @RequestMapping("/hello")
    public Object getInfo2() {
        return "hello world";
    }

}
