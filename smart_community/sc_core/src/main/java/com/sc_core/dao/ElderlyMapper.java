package com.sc_core.dao;

import com.sc_core.common.requestdata.ElderlyKeyWordsRequestData;
import com.sc_core.common.requestdata.ElderlyRequestData;
import com.sc_core.entity.Elderly;

import java.util.List;
import java.util.Map;

public interface ElderlyMapper {


    Elderly queryElderlyById(String elderlyId);

    List<Map<String, Object>> countElderlyByLivingType();

    List<Map<String, Object>> countElderlyBySex();

    List<Map<String, Object>> countElderlyByFamilyType();

    List<Map<String, Object>> countElderlyByAge();

    List<Elderly> findElderlyByAddress(ElderlyRequestData request);

    List<Elderly> findElderly(ElderlyKeyWordsRequestData request);

    Object findElderlyPhoto(String elderlyId);

    Elderly findElderlyByid(String elderlyId);
}
