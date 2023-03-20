package com.example.sc_test.controller;

import com.example.sc_test.pojo.TestObject;
import com.example.sc_test.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TestController {

    @Autowired
    TestServiceImpl service;

    //测试PathPathVariable
    @RequestMapping("/{test}a{as}")
    public TestObject pathTest(@PathVariable("test") String m){
        System.out.println(m);
        return service.selectTestService();
    }

    //测试RESTful
    @RequestMapping(value = "/rest",method = RequestMethod.GET)
    public String restTest1(){
        System.out.println("rm get");
        return "get";
    }
    @RequestMapping(value = "/rest",method = RequestMethod.POST)
    public String restTest2(){
        System.out.println("rm post");
        return "post";
    }

    //测试foreach标签：可变长参，数组，列表
    @RequestMapping("/test1")
    public List<TestObject> foreachTest(){
        System.out.println("testForeach");
        return service.TestMultiParamQuery();
    }

}