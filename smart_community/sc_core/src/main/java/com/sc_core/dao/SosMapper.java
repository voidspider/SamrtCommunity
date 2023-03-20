package com.sc_core.dao;


import com.sc_core.common.requestdata.EquipmentRequestData;
import com.sc_core.entity.SosEquipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SosMapper {


    List<SosEquipment> findSosEquipment();


    SosEquipment findSosEquipmentBySnCode(String snCode);

    int findSosOnline();


    List<SosEquipment> findAllSosEquipment(EquipmentRequestData request);
}
