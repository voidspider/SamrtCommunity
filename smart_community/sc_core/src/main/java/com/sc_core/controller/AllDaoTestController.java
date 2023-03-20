package com.sc_core.controller;

  /*
<a href="http://localhost:8080">TEST IT NOW !</a><p>
   */
import com.sc_core.entity.Caregiver;
import com.sc_core.entity.Elderly;
import com.sc_core.entity.FamilyMembers;
import com.sc_core.service.AllMapperTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * This is a test class
 * Do test for all the mappers and sqls
 * Check if everything is avaiable
 * @since 0.0.1
 */

/*
  温馨提示：
  如果您对此文件进行修改 请不要删除原有作者及注释信息，请补充您的信息和修改原因
  修改示范：
  @author 原作者名
 * @modified 修改者名 at 2099-02-05 因修复xxbug进行xx修改
 * @modified 修改者名 at 2099-09-13 因新增xx功能添加xx代码
 */

/**
 * @author 李长霖
 */
@RestController
public class AllDaoTestController {

    @Autowired
    AllMapperTestService service;

    /**
     * Just a test for swagger, nothing else here
     * localhost:8080/swagger-ui.html
     */
    @GetMapping("/sql-test/swagger-test")
    public String test_swagger(String msg){
        return msg;
    }

    /**
     * <a href="http://localhost:8080/sql-test/mapper">TEST IT NOW !</a><p>
     * Sent a String msg from Controller to mapper.xml<p>
     * DB connection not included
     */

    @GetMapping("/sql-test/mapper")
    public String test_Mapper(){
        String msg = "mapper test access!";
        return service.test_Mapper(msg);
    }

    /**
     * <a href="http://localhost:8080/sql-test/mapper/post">TEST IT NOW !</a><p>
     * Same as the up one, but using POST<p>
     * DB connection not included
     */
    @PostMapping("/sql-test/mapper/post")
    public String test_Mapper_post(){
        String msg = "POST & mapper test both access!";
        return service.test_Mapper(msg);
    }


    /**
     * <a href="http://localhost:8080/sql-test/path-variable/succeedMSG!">TEST IT NOW !</a><p>
     * Sent a String msg from URL to mapper.xml<p>
     * DB connection not included
     * @param msg Varaible from URL
     */
    @GetMapping("/sql-test/path-variable/{msg}")
    public String test_PathVariable(@PathVariable("msg") String msg){
        return "URL variable test access! " + "<br>path-variable: " + service.test_Mapper(msg);
    }

    ////////////////

    /**
     * <a href="http://localhost:8080/sql-test/every-elderly">TEST IT NOW !</a><p>
     * Query every elderly's info
     */
    @GetMapping("/sql-test/every-elderly")
    public List<Elderly> test_queryEveryElderly(){
        return service.test_queryEveryElderlyInfo();
    }

    /**
     * <a href="http://localhost:8080/sql-test/every-familyMembers">TEST IT NOW !</a><p>
     * Query every familyMembers' info
     */
    @GetMapping("/sql-test/every-familyMembers")
    public List<FamilyMembers> test_queryEveryFamilyMembers(){
        return service.test_queryEveryFamilyMembersInfo();
    }

    /**
     * <a href="http://localhost:8080/sql-test/every-caregiver">TEST IT NOW !</a><p>
     * Query every caregiver's info
     */
    @GetMapping("/sql-test/every-caregiver")
    public List<Caregiver> test_queryEveryCaregiver(){
        return service.test_queryEveryCaregiverInfo();
    }


}
