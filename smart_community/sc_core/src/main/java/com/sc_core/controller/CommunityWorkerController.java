package com.sc_core.controller;


import com.sc_core.common.requestdata.CommunityWorkerRequestData;
import com.sc_core.common.response.ResultMap;
import com.sc_core.service.CommunityWorkerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李长霖
 */

@RestController
@Api(tags="社工信息管理")
@RequestMapping("/communityWorkerManage")
public class CommunityWorkerController {

    @Autowired
    private CommunityWorkerService communityWorkerService;

    /**
     * 设备管理---根据关键字查询社工信息
     */
    @GetMapping("/findCommunityByKeyWords")
    @ApiOperation("根据关键字查询社工信息")
    public ResultMap findCommunityByKeyWords(CommunityWorkerRequestData request){
        return ResultMap.build().ok().data(communityWorkerService.findCommunityByKeyWords(request));

    }
}
