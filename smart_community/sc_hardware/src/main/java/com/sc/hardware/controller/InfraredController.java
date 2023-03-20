package com.sc.hardware.controller;

import com.sc.hardware.entity.DataChanges;
import com.sc.hardware.entity.EventReport;
import com.sc.hardware.entity.Online;
import com.sc_core.common.model.QueryResult;
import com.sc.hardware.service.InfraredService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "红外硬件设备信息")
@RequestMapping("/hardware/infrared")
public class InfraredController {

    @Autowired
    InfraredService infraredService;

    @Transactional
    @PostMapping("/data")
    public void dataChanges(@RequestBody DataChanges data){
        infraredService.dataChanges(data);
    }

    @Transactional
    @PostMapping("/event")
    public void eventReport(@RequestBody EventReport event){
        infraredService.eventReport(event);
    }

    @Transactional
    @PostMapping("/online")
    public void Online(@RequestBody Online online){
        infraredService.online(online);
    }

}
