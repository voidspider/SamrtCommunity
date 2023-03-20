package com.example.sc_test.dao;

import com.example.sc_test.pojo.TestObject;

import java.util.List;

//@Mapper
//@Component
public interface TestMapper {
     public TestObject testSelect();
     public List<TestObject> testMultiParamQuery(String ss, String... s);
}
