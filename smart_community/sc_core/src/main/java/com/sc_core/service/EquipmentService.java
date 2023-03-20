package com.sc_core.service;


import com.sc_core.common.response.ResultMap;
import com.sc_core.common.requestdata.EquipmentRequestData;
import com.sc_core.common.model.ResponseResult;

public interface EquipmentService {


    ResponseResult findAllEquipment(EquipmentRequestData request);


    ResultMap findEquipmentSnCode(String snCode);


    ResultMap findEquipmentCount();


    ResultMap checkEquipmentOnlineState(String snCode);
}
