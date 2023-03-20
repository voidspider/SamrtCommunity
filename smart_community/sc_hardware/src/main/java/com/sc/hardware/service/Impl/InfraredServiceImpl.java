package com.sc.hardware.service.Impl;


import com.sc.hardware.entity.DataChanges;
import com.sc.hardware.entity.EventReport;
import com.sc.hardware.entity.Online;
import com.sc.hardware.dao.InfraredMapper;
import com.sc.hardware.service.InfraredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InfraredServiceImpl implements InfraredService {

    @Autowired
    InfraredMapper infraredMapper;

    @Override
    public void dataChanges(DataChanges data) {
        infraredMapper.dataPayload(data.getPayload());
        infraredMapper.dataMetaInfo(data);
    }

    @Override
    public void eventReport(EventReport event) {
        infraredMapper.eventContent(event.getEventContent());
        infraredMapper.eventMetaInfo(event);
    }

    @Override
    public void online(Online online) {
        infraredMapper.online(online);
    }
}
