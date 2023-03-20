package com.sc_core.service.Impl;

import com.sc_core.dao.FamilyMembersMapper;
import com.sc_core.entity.FamilyMembers;
import com.sc_core.service.FamilyMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyMembersServiceImpl implements FamilyMembersService {

    @Autowired
    FamilyMembersMapper familyMembersMapper;

    @Override
    public List<FamilyMembers> selectFamilyMembersByElderlyId(String elderlyId) {
        return familyMembersMapper.selectFamilyMembersByElderlyId(elderlyId);
    }
}
