package com.sc_core.controller;

import com.sc_core.common.response.ResultMap;
import com.sc_core.service.LocationService;
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
public class LocationController {

    @Autowired
    LocationService locationService;

    @ResponseBody
    @GetMapping("/location/every-block")
    public ResultMap getEveryBlock(){
        return ResultMap.ok().data(locationService.getEveryBlock());
    }

    @ResponseBody
    @GetMapping("/location/block/by-community")
    public ResultMap getBlockByCommuniy(String community){
        return ResultMap.ok().data(locationService.getBlockByCommunity(community));
    }

//    @ResponseBody
//    @PostMapping("/location/bracelet/by-elderly-id")
//    public ResultMap getBraceletLocationByElderlyId(@RequestBody Map<String,String> map){
//        return ResultMap.ok().data(locationService.getBraceletLocationByElderlyId(map.get("elderlyId")));
//    }
//
//    @ResponseBody
//    @PostMapping("/location/caregiver/by-elderly-id")
//    public ResultMap getCaregiverLocationByElderlyId(@RequestBody Map<String,String> map){
//        return ResultMap.ok().data(locationService.getCaregiverLocationByElderlyId(map.get("elderlyId")));
//    }

    @ResponseBody
    @GetMapping("/location/bracelet/by-elderly-id")
    public ResultMap getBraceletLocationByElderlyId(String elderlyId){
        return ResultMap.ok().data(locationService.getBraceletLocationByElderlyId(elderlyId));
    }

    @ResponseBody
    @GetMapping("/location/caregiver/by-elderly-id")
    public ResultMap getCaregiverLocationByElderlyId(String elderlyId){
        return ResultMap.ok().data(locationService.getCaregiverLocationByElderlyId(elderlyId));
    }

}
