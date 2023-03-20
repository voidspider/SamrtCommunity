package com.sc_core.service;

import com.sc_core.common.requestdata.ElderlyKeyWordsRequestData;
import com.sc_core.common.requestdata.ElderlyRequestData;
import com.sc_core.common.model.QueryResult;
import com.sc_core.common.model.ResponseResult;
import com.sc_core.entity.Elderly;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public interface ElderlyService {


    String queryElderlyDetailedInfo(String elderlyId);

    List<Map<String, Object>> countElderlyByLivingType();

    List<Map<String, Object>> countElderlyBySex();

    List<Map<String, Object>> countElderlyByFamilyType();

    List<Map<String, Object>> countElderlyByAge();

    ResponseResult findElderlyByAddress(ElderlyRequestData request) throws IOException;

    QueryResult<Elderly> findElderly(ElderlyKeyWordsRequestData request);

    Object findElderlyPhoto(String elderlyId) throws Exception;

    Elderly queryElderlyInfo(String elderlyId);
}
