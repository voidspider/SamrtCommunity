package com.sc_core.dao;

import com.sc_core.common.requestdata.CaregiverRequestData;
import com.sc_core.entity.Caregiver;

import java.util.List;

public interface CaregiverMapper {
    List<Caregiver> queryCaregiverByElderlyId(String elderlyId);

   List<Caregiver>  findCaregiverByKeyWords(CaregiverRequestData request);
}
