package com.sc_core.dao;




import com.sc_core.common.requestdata.EquipmentRequestData;
import com.sc_core.entity.BraceletEquipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BraceletMapper {



    List<BraceletEquipment> findBraceletEquipment();

    String findElderlyName(int elderlyId);

    String findElderlyCommunity(int elderlyId);

    String findElderlyTelephone(int elderlyId);


    BraceletEquipment findBraceletEquipmentBySnCode(String snCode);

    int findBraceletOnline();


    List<BraceletEquipment> findAllBraceletEquipment(EquipmentRequestData request);
}
