package com.sc_core.dao;

import com.sc_core.entity.Caregiver;
import com.sc_core.entity.Elderly;
import com.sc_core.entity.FamilyMembers;

import java.util.List;

public interface AllSqlTestMapper {

    /**
     * @param msg A msg from controller
     * @since  0.0.1
     */
    String test_Mapper(String msg);

    //elderly
    List<Elderly> queryEveryElderlyInfo();
    //familyMembers
    List<FamilyMembers> queryEveryFamilyMembersInfo();
    //caregiver
    List<Caregiver> queryEveryCaregiverInfo();
}
