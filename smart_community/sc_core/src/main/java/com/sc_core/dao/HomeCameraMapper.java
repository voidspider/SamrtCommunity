package com.sc_core.dao;




import com.sc_core.common.requestdata.EquipmentRequestData;
import com.sc_core.entity.HomeCameraEquipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeCameraMapper {


    List<HomeCameraEquipment> findHomeCanmeraEquipment();


    HomeCameraEquipment findHomeCanmeraEquipmentBySnCode(String snCode);

    int findHomeOnline();

    List<HomeCameraEquipment> findAllHomeCanmeraEquipment(EquipmentRequestData request);
}
