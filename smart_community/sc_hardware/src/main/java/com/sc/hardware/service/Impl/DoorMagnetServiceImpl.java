package com.sc.hardware.service.Impl;

import com.sc.hardware.dao.DoorMagnetMapper;
import com.sc.hardware.entity.DataChanges;
import com.sc.hardware.entity.EventReport;
import com.sc.hardware.entity.Online;
import com.sc.hardware.service.DoorMagnetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoorMagnetServiceImpl implements DoorMagnetService {

    @Autowired
    DoorMagnetMapper doorMagnetMapper;

    @Override
    public void dataChanges(DataChanges data) {
        doorMagnetMapper.dataPayload(data.getPayload());
        doorMagnetMapper.dataMetaInfo(data);
    }

    @Override
    public void eventReport(EventReport event) {
        doorMagnetMapper.eventContent(event.getEventContent());
        doorMagnetMapper.eventMetaInfo(event);
    }

    @Override
    public void online(Online online) {
        doorMagnetMapper.online(online);
    }
}
