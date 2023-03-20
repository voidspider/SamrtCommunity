package com.sc.hardware.controller;

import com.sc.hardware.entity.DataChanges;
import com.sc.hardware.entity.EventReport;
import com.sc.hardware.entity.Online;
import com.sc.hardware.service.DoorMagnetService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "门磁硬件设备信息")
@RequestMapping("/hardware/door")
public class DoorMagnetController {

    @Autowired
    DoorMagnetService doorMagnetService;

    @Transactional
    @PostMapping("/data")
    public void dataChanges(@RequestBody DataChanges data){
        doorMagnetService.dataChanges(data);
    }

    @Transactional
    @PostMapping("/event")
    public void eventReport(@RequestBody EventReport event){
        doorMagnetService.eventReport(event);
    }

    @Transactional
    @PostMapping("/online")
    public void Online(@RequestBody Online online){
        doorMagnetService.online(online);
    }

}
