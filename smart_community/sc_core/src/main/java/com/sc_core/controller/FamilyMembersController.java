package com.sc_core.controller;

import com.sc_core.common.response.ResultMap;
import com.sc_core.service.FamilyMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author 李长霖
 */

@Controller
public class FamilyMembersController {

    @Autowired
    FamilyMembersService familyMembersService;

    @ResponseBody
    @GetMapping("/familyMembersInfo/by-elderly-id")
    public ResultMap getFamilyMembersByElderlyId(String elderlyId){
        return ResultMap.ok().data(familyMembersService.selectFamilyMembersByElderlyId(elderlyId));
    }

}
