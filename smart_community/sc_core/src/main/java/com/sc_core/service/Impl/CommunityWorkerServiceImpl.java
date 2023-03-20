package com.sc_core.service.Impl;

import com.github.pagehelper.PageHelper;
import com.sc_core.common.model.QueryResult;
import com.sc_core.common.requestdata.CommunityWorkerRequestData;
import com.sc_core.common.response.ResultMap;
import com.sc_core.dao.CommunityWorkerMapper;
import com.sc_core.entity.CommunityWorker;
import com.sc_core.service.CommunityWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityWorkerServiceImpl implements CommunityWorkerService {

    @Autowired
    private CommunityWorkerMapper communityWorkerMapper;

    @Override
    public QueryResult findCommunityByKeyWords(CommunityWorkerRequestData request) {
        PageHelper.startPage(request.getPage(),request.getSize());

        return QueryResult.restPage(communityWorkerMapper.findCommunityByKeyWords(request));
    }
}
