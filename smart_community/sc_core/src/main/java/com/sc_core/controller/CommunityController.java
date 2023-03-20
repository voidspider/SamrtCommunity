package com.sc_core.controller;

import com.sc_core.common.response.ResultMap;
import com.sc_core.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 李长霖
 */

@Controller
public class CommunityController {

    @Autowired
    CommunityService communityService;

    @ResponseBody
    @GetMapping("/community/every-community")
    public ResultMap getEveryCommunity(){
        return ResultMap.ok().data(communityService.selectEveryCommunity());
    }
}
