package com.sc_core.service;

import com.sc_core.entity.FamilyMembers;

import java.util.List;

public interface FamilyMembersService {
    List<FamilyMembers> selectFamilyMembersByElderlyId(String elderlyId);
}
