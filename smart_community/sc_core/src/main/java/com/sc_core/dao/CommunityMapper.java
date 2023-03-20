package com.sc_core.dao;

import com.sc_core.entity.Community;

import java.util.List;

public interface CommunityMapper {
    List<Community> selectEveryCommunity();
}
