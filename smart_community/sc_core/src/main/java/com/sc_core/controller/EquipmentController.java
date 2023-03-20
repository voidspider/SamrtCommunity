package com.sc_core.controller;




import com.sc_core.common.requestdata.EquipmentRequestData;
import com.sc_core.common.model.ResponseResult;
import com.sc_core.common.response.ResultMap;
import com.sc_core.service.EquipmentService;
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
@Api(tags="设备信息管理")
@RequestMapping("/equipmentManage")
public class EquipmentController {


    @Autowired
    private EquipmentService equipmentService;

    /**
     * 设备管理---查询并显示设备信息
     */
    @GetMapping("/findEquipment")
    public ResponseResult findEquipment(EquipmentRequestData request){
        return equipmentService.findAllEquipment(request);

    }
    /**
     * 设备管理---根据设备SN码显示设备信息
     * @param snCode
     */
    @GetMapping("/findEquipmentBySnCode")
    @ApiOperation("根据设备SN码查询显示设备详细信息")
    public ResultMap findEquipmentSnCode(String snCode){
        return equipmentService.findEquipmentSnCode(snCode);

    }


    /**
     * 设备管理---查询设备数量和在线数量
     */
    @GetMapping("/findEquipmentCount")
    @ApiOperation("查询设备数量和在线数量")
    public ResultMap findEquipmentCount(){
        return equipmentService.findEquipmentCount();
    }

    /**
     * 设备管理---判断设备是否在线，不在线判断设备离线时间
     */
    @GetMapping("/checkEquipmentOnlineState")
    @ApiOperation("查看设备在线状态")
    public ResultMap checkEquipmentOnlineState(String snCode){
        return equipmentService.checkEquipmentOnlineState(snCode);
    }



}
