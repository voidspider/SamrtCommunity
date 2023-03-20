package com.example.sc_test.service;

import com.example.sc_test.pojo.TestObject;

import java.util.List;

public interface TestService{
    public TestObject selectTestService();
    public List<TestObject> TestMultiParamQuery();
}
