package com.example.sc_test.service.impl;

import com.example.sc_test.dao.TestMapper;
import com.example.sc_test.pojo.TestObject;
import com.example.sc_test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper mapper;

    @Override
    public TestObject selectTestService(){
        return mapper.testSelect();
    }

    @Override
    public List<TestObject> TestMultiParamQuery() {
        List<String> s = new ArrayList<>();
        s.add("1");
        s.add("2");
        return mapper.testMultiParamQuery("any", "1", "2");
    }
}
