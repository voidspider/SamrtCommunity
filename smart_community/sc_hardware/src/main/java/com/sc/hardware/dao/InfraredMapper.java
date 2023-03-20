package com.sc.hardware.dao;


import com.sc.hardware.entity.DataChanges;
import com.sc.hardware.entity.EventReport;
import com.sc.hardware.entity.Online;
import com.sc.hardware.entity.device.Device;


public interface InfraredMapper {

    void dataMetaInfo(DataChanges data);
    void dataPayload(Device payload);
    void eventContent(Device eventContent);
    void eventMetaInfo(EventReport event);
    void online(Online online);
}
