package com.sc_core.service;

import com.sc_core.common.model.QueryResult;
import com.sc_core.common.requestdata.CaregiverRequestData;
import com.sc_core.entity.Caregiver;

import java.util.List;

public interface CaregiverService {
    List<Caregiver> queryCaregiverByElderlyId(String elderlyId);

    QueryResult findCaregiverByKeyWords(CaregiverRequestData request);
}
