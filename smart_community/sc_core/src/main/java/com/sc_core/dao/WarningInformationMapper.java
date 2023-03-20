package com.sc_core.dao;

import com.sc_core.common.requestdata.WarningInfoRequestData;
import com.sc_core.entity.FamilyMembers;
import com.sc_core.entity.WarningInformation;

import java.util.List;
import java.util.Set;

public interface WarningInformationMapper {


    List<WarningInformation> queryInfoByElderlyId(String elderlyId);


    List<WarningInformation> findWarningInfo(WarningInfoRequestData requset);


    int findFamilyID(int elderlyId);

    String findFamilyTelephone(int elderlyId);

    int findInfoCount();

    WarningInformation findWarningInfoById(int warningInfoId);

    List<WarningInformation> findWarningInfoByElderlyIds(Set<Integer> elderlyIds);

    WarningInformation findWarningInfoByElderlyId(int elderlyId);

    int findEmergencyCount();

    int findCommonCount();

    int findEmergencyAlarmingCount();

    int findEmergencyHelpingCount();

    int findEmergencySolvedCount();

    int findCommonAlarmingCount();

    int findCommonHelpingCount();

    int findCommonSolvedCount();


    List<FamilyMembers> findFamilyInfo(int elderlyId);
}
