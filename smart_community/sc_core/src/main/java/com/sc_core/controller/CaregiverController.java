package com.sc_core.controller;


import com.sc_core.common.requestdata.CaregiverRequestData;
import com.sc_core.common.response.ResultMap;
import com.sc_core.service.CaregiverService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李长霖
 */

@RestController
@Api(tags="护工信息管理")
@RequestMapping("/caregiverManage")
public class CaregiverController {

    @Autowired
    private CaregiverService caregiverService;

    /**
     * 护工信息管理---查找护工
     */
    @ResponseBody
    @GetMapping("/findCaregiverByKeyWords")
    @ApiOperation("根据条件查找护工")
    public ResultMap findCaregiverByKeyWords(CaregiverRequestData request) {
        return ResultMap.build().ok().data(caregiverService.findCaregiverByKeyWords(request));
    }


}
