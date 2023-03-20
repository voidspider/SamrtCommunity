package com.sc_core.service;

import com.sc_core.entity.Caregiver;
import com.sc_core.entity.Elderly;
import com.sc_core.entity.FamilyMembers;

import java.util.List;

public interface AllMapperTestService {
    String test_Mapper(String msg);
    List<Elderly> test_queryEveryElderlyInfo();
    List<FamilyMembers> test_queryEveryFamilyMembersInfo();
    List<Caregiver> test_queryEveryCaregiverInfo();
}
