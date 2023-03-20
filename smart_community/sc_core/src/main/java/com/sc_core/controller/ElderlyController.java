package com.sc_core.controller;

import com.sc_core.common.requestdata.ElderlyKeyWordsRequestData;
import com.sc_core.common.requestdata.ElderlyRequestData;
import com.sc_core.common.model.ResponseResult;
import com.sc_core.common.response.ResultMap;
import com.sc_core.service.CaregiverService;
import com.sc_core.service.ElderlyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/*
 * 开发建议：
 * controller尽量遵循Restful，比如地址栏使用名词，单词之间用中划线链接并且不要出现大写字母
 * 复杂业务逻辑请放入service中，防止controller过于繁杂
 * 温馨提示：
 * 如果您对此文件进行修改 请不要删除原有作者及注释信息，请补充您的信息和修改原因
 * 修改示范：
 * @author 原作者名
 * @modified 修改者名 at 2099-02-05 因修复xxbug进行xx修改
 * @modified 修改者名 at 2099-09-13 因新增xx功能添加xx代码
 */

/**
 * @author 李长霖
 * @modified 李长霖 at 2022-10-26 修改返回值为ResultMap
 */

@Api(tags="老人信息管理")

@Controller
public class ElderlyController {

    @Autowired
    ElderlyService elderlyService;
    @Autowired
    CaregiverService caregicerService;



    @ResponseBody
    @GetMapping("/elderlyInfo/by-elderly-id/detailed")
    @ApiOperation("根据老人id查询老人详细信息")
    public ResultMap queryElderlyDetailedInfo(String elderlyId){
        return ResultMap.ok().data(elderlyService.queryElderlyDetailedInfo(elderlyId));
    }

    @ResponseBody
    @GetMapping("/elderlyInfo/by-elderly-id")
    @ApiOperation("根据老人id查询老人基本信息")
    public ResultMap queryElderlyInfo(String elderlyId){
        return ResultMap.ok().data(elderlyService.queryElderlyInfo(elderlyId));
    }

    @ResponseBody
    @GetMapping("/elderlyCount/living-type")
    public ResultMap countElderlyByLivingType() {
        return ResultMap.ok().data(elderlyService.countElderlyByLivingType());
    }

    @ResponseBody
    @GetMapping("/elderlyCount/sex")
    public ResultMap countElderlyBySex() {
        return ResultMap.ok().data(elderlyService.countElderlyBySex());
    }

    @ResponseBody
    @GetMapping("/elderlyCount/family-type")
    public ResultMap countElderlyByFamilyType() {
        //List<Map<String, Object>>
        return ResultMap.ok().data(elderlyService.countElderlyByFamilyType());
    }

    @ResponseBody
    @GetMapping("/elderlyCount/age")
    public ResultMap countElderlyByAge() {
        //List<Map<String, Object>>
        return ResultMap.ok().data(elderlyService.countElderlyByAge());
    }


    /**
     * 老人信息管理---根据省市五级地址信息查询老人
     */
    @ResponseBody
    @GetMapping("/findElderlyByAddress")
    @ApiOperation("根据省市五级地址信息查询老人")
    public ResponseResult findElderlyByAddress(ElderlyRequestData request) throws IOException {
        return elderlyService.findElderlyByAddress(request);
    }


    /**
     * 老人信息管理---根据社区等关键字查询老人
     */
    @ResponseBody
    @GetMapping("/findElderly")
    @ApiOperation("根据社区等关键字查询老人")
    public ResultMap findElderly(ElderlyKeyWordsRequestData request) {
        return ResultMap.build().ok().data(elderlyService.findElderly(request));
    }


//    /**
//     * 老人信息管理---查看老人照片
//     */
//    @ResponseBody
//    @GetMapping("/findElderlyPhoto")
//    @ApiOperation("查看老人照片")
//    public ResultMap findElderlyPhoto(String elderlyId) throws Exception {
//        return ResultMap.build().ok().data(elderlyService.findElderlyPhoto(elderlyId));
//    }


}
