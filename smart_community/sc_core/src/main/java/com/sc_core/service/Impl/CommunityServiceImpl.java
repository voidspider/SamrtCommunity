package com.sc_core.service.Impl;

import com.sc_core.dao.CommunityMapper;
import com.sc_core.entity.Community;
import com.sc_core.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    CommunityMapper communityMapper;

    @Override
    public List<Community> selectEveryCommunity() {
        return communityMapper.selectEveryCommunity();
    }
}
