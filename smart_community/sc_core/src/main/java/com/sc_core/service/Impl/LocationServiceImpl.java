package com.sc_core.service.Impl;

import com.sc_core.dao.LocationMapper;
import com.sc_core.entity.Block;
import com.sc_core.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationMapper locationMapper;

    @Override
    public List<Block> getEveryBlock() {
        return locationMapper.getEveryBlock();
    }

    @Override
    public List<Block> getBlockByCommunity(String community) {
        return locationMapper.getBlockByCommunity(community);
    }

    @Override
    public List<Map<String, Object>> getBraceletLocationByElderlyId(String elderlyId) {
        return locationMapper.getBraceletLocationByElderlyId(elderlyId);
    }

    @Override
    public List<Map<String, Object>> getCaregiverLocationByElderlyId(String elderlyId) {
        return locationMapper.getCaregiverLocationByElderlyId(elderlyId);
    }
}
