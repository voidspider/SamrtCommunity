package com.sc_core.service;

import com.sc_core.entity.Block;

import java.util.List;
import java.util.Map;

public interface LocationService {
    List<Block> getEveryBlock();
    List<Block> getBlockByCommunity(String community);
    List<Map<String, Object>> getBraceletLocationByElderlyId(String elderlyId);
    List<Map<String, Object>> getCaregiverLocationByElderlyId(String elderlyId);
}
