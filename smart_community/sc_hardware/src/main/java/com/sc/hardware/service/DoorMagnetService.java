package com.sc.hardware.service;

import com.sc.hardware.entity.DataChanges;
import com.sc.hardware.entity.EventReport;
import com.sc.hardware.entity.Online;

public interface DoorMagnetService {
    void dataChanges(DataChanges data);
    void eventReport(EventReport event);
    void online(Online online);
}
