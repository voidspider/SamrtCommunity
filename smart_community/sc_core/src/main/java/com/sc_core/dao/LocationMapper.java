package com.sc_core.dao;

import com.sc_core.entity.Block;

import java.util.List;
import java.util.Map;

public interface LocationMapper {
    List<Block> getEveryBlock();
    List<Block> getBlockByCommunity(String Community);
    List<Map<String,Object>> getBraceletLocationByElderlyId(String elderlyId);
    List<Map<String, Object>> getCaregiverLocationByElderlyId(String elderlyId);
}
