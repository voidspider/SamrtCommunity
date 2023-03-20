package com.sc_core.service;

import com.sc_core.entity.Community;

import java.util.List;

public interface CommunityService {
    List<Community> selectEveryCommunity();
}
