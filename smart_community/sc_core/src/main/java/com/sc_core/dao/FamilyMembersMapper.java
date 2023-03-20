package com.sc_core.dao;

import com.sc_core.entity.FamilyMembers;

import java.util.List;

public interface FamilyMembersMapper {
    List<FamilyMembers> selectFamilyMembersByElderlyId(String elderlyId);
}
