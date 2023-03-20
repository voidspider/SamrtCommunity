package com.sc_core.dao;


import com.sc_core.common.requestdata.CommunityWorkerRequestData;
import com.sc_core.entity.CommunityWorker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityWorkerMapper {

    List<CommunityWorker> findCommunityByKeyWords(CommunityWorkerRequestData request);
}
