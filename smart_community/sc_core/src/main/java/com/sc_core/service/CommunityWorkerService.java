package com.sc_core.service;

import com.sc_core.common.model.QueryResult;
import com.sc_core.common.requestdata.CommunityWorkerRequestData;


public interface CommunityWorkerService {
    QueryResult findCommunityByKeyWords(CommunityWorkerRequestData request);
}
