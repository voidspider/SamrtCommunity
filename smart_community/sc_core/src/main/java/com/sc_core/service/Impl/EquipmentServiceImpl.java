package com.sc_core.service.Impl;


import com.sc_core.common.requestdata.EquipmentRequestData;
import com.sc_core.common.response.ResultMap;
import com.sc_core.common.model.*;
import com.sc_core.dao.BraceletMapper;
import com.sc_core.dao.HomeCameraMapper;
import com.sc_core.dao.SosMapper;
import com.sc_core.dao.WarningInformationMapper;
import com.sc_core.entity.*;
import com.sc_core.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EquipmentServiceImpl implements EquipmentService {


    @Autowired
    private BraceletMapper braceletMapper;
    @Autowired
    private SosMapper sosMapper;
    @Autowired
    private HomeCameraMapper homeCameraMapper;
    @Autowired
    private WarningInformationMapper warningInformationMapper;

    private LocalDateTime localDateTime;

    /**
     * 设备管理 查询所有设备
     */
    @Override
    public ResponseResult findAllEquipment(EquipmentRequestData request) {
        // PageHelper.startPage(request.getPage(),request.getSize());//只对第一个Mapper查询到的数据进行分页
        List<BraceletEquipment> braceletEquipments = braceletMapper.findAllBraceletEquipment(request);
        for (BraceletEquipment braceletEquipment : braceletEquipments) {
            braceletEquipment.setUserName(braceletMapper.findElderlyName(braceletEquipment.getElderlyId()));
            braceletEquipment.setCommunity(braceletMapper.findElderlyCommunity(braceletEquipment.getElderlyId()));
            braceletEquipment.setTelephone(braceletMapper.findElderlyTelephone(braceletEquipment.getElderlyId()));
        }
        List<SosEquipment> sosEquipments = sosMapper.findAllSosEquipment(request);
        for (SosEquipment sosEquipment : sosEquipments) {
            sosEquipment.setUserName(braceletMapper.findElderlyName(sosEquipment.getElderlyId()));
            sosEquipment.setCommunity(braceletMapper.findElderlyCommunity(sosEquipment.getElderlyId()));
            sosEquipment.setTelephone(braceletMapper.findElderlyTelephone(sosEquipment.getElderlyId()));
        }
        List<HomeCameraEquipment> homeCameraEquipments = homeCameraMapper.findAllHomeCanmeraEquipment(request);
        for (HomeCameraEquipment homeCameraEquipment : homeCameraEquipments) {
            homeCameraEquipment.setUserName(braceletMapper.findElderlyName(homeCameraEquipment.getElderlyId()));
            homeCameraEquipment.setCommunity(braceletMapper.findElderlyCommunity(homeCameraEquipment.getElderlyId()));
            homeCameraEquipment.setTelephone(braceletMapper.findElderlyTelephone(homeCameraEquipment.getElderlyId()));
        }

        List allEquipments = new ArrayList<>();
        allEquipments.addAll(braceletEquipments);
        allEquipments.addAll(sosEquipments);
        allEquipments.addAll(homeCameraEquipments);

        if (allEquipments.size() == 0) {
            return CommonResponseResult.failed("无符合条件的设备，请重新输入！");
        } else {
            List subAllEquipment = (List) allEquipments.stream().skip((request.getPage() - 1) * request.getSize())
                    .limit(request.getSize()).collect(Collectors.toList());
            return new QueryResponseResult
                    (CommonCode.SUCCESS, QueryResult.restPage(request.getPage(), request.getSize(), allEquipments, subAllEquipment));
        }

    }

    /**
     * 查看设备详情
     *
     * @param snCode
     * @return
     */
    public ResultMap findEquipmentSnCode(String snCode) {


        BraceletEquipment braceletEquipment =  braceletMapper.findBraceletEquipmentBySnCode(snCode);

        if(braceletEquipment==null){
             SosEquipment sosEquipment = sosMapper.findSosEquipmentBySnCode(snCode);
             if(sosEquipment==null) {
                 HomeCameraEquipment homeCameraEquipment = homeCameraMapper.findHomeCanmeraEquipmentBySnCode(snCode);

                 homeCameraEquipment.setUserName(braceletMapper.findElderlyName(homeCameraEquipment.getElderlyId()));
                 homeCameraEquipment.setTelephone(braceletMapper.findElderlyTelephone(homeCameraEquipment.getElderlyId()));
                 homeCameraEquipment.setCommunity(braceletMapper.findElderlyCommunity(homeCameraEquipment.getElderlyId()));
                 WarningInformation warningInformation = warningInformationMapper.findWarningInfoByElderlyId(homeCameraEquipment.getElderlyId());
                 if(warningInformation !=null) {
                     List emergencyContactInfoList = warningInformationMapper.findFamilyInfo(warningInformation.getElderlyId());
                     String emergencyContactInfo = emergencyContactInfoList.toString();
                     warningInformation.setEmergencyContactInfo(emergencyContactInfo);
                 }

                 return ResultMap.build().code(200).msg("成功").data(homeCameraEquipment.toString() + warningInformation.toString());
             } else {
                sosEquipment.setUserName(braceletMapper.findElderlyName(sosEquipment.getElderlyId()));
                sosEquipment.setTelephone(braceletMapper.findElderlyTelephone(sosEquipment.getElderlyId()));
                sosEquipment.setCommunity(braceletMapper.findElderlyCommunity(sosEquipment.getElderlyId()));
                WarningInformation warningInformation = warningInformationMapper.findWarningInfoByElderlyId(sosEquipment.getElderlyId());
                if (warningInformation != null) {
                    List emergencyContactInfoList = warningInformationMapper.findFamilyInfo(warningInformation.getElderlyId());
                    String emergencyContactInfo = emergencyContactInfoList.toString();
                    warningInformation.setEmergencyContactInfo(emergencyContactInfo);
                }
                return ResultMap.build().code(200).msg("成功").data(sosEquipment.toString() + warningInformation.toString());
            }
        }
        braceletEquipment.setUserName(braceletMapper.findElderlyName(braceletEquipment.getElderlyId()));
        braceletEquipment.setTelephone(braceletMapper.findElderlyTelephone(braceletEquipment.getElderlyId()));
        braceletEquipment.setCommunity(braceletMapper.findElderlyCommunity(braceletEquipment.getElderlyId()));
        WarningInformation warningInformation = warningInformationMapper.findWarningInfoByElderlyId(braceletEquipment.getElderlyId());
        if (warningInformation != null) {
            List emergencyContactInfoList = warningInformationMapper.findFamilyInfo(warningInformation.getElderlyId());
            String emergencyContactInfo = emergencyContactInfoList.toString();
            warningInformation.setEmergencyContactInfo(emergencyContactInfo);
        }

        return ResultMap.build().code(200).msg("成功").data(braceletEquipment.toString() + warningInformation.toString());

    }

    @Override
    public ResultMap findEquipmentCount() {
        EquipmentCount equipmentCount = new EquipmentCount();
        equipmentCount.setBraceletCount(braceletMapper.findBraceletEquipment().size());
        equipmentCount.setBraceletOnlineCount(braceletMapper.findBraceletOnline());
        equipmentCount.setSosCount(sosMapper.findSosEquipment().size());
        equipmentCount.setSosOnlineCount(sosMapper.findSosOnline());
        equipmentCount.setHomeCameraCount(homeCameraMapper.findHomeCanmeraEquipment().size());
        equipmentCount.setHomeCameraOnlineCount(homeCameraMapper.findHomeOnline());
        equipmentCount.setBraceletOnlineRate((float) equipmentCount.getBraceletOnlineCount() / equipmentCount.getBraceletCount() * 100 + "%");
        equipmentCount.setSosOnlineRate((float) equipmentCount.getSosOnlineCount() / equipmentCount.getSosCount() * 100 + "%");
        equipmentCount.setHomeCameraOnlineRate((float) equipmentCount.getHomeCameraOnlineCount() / equipmentCount.getHomeCameraCount() * 100 + "%");

        equipmentCount.setAllEquipmentCount(equipmentCount.getBraceletCount() + equipmentCount.getSosCount() + equipmentCount.getHomeCameraCount());
        equipmentCount.setAllOnlineCount(equipmentCount.getBraceletOnlineCount() + equipmentCount.getSosOnlineCount() + equipmentCount.getHomeCameraOnlineCount());
        return ResultMap.build().msg("成功").code(200).data(equipmentCount);
    }

    @Override
    public ResultMap checkEquipmentOnlineState(String snCode) {


        localDateTime = LocalDateTime.now();
        BraceletEquipment braceletEquipment = braceletMapper.findBraceletEquipmentBySnCode(snCode);
        if (braceletEquipment == null) {
            SosEquipment sosEquipment = sosMapper.findSosEquipmentBySnCode(snCode);
            if (sosEquipment == null) {
                HomeCameraEquipment homeCameraEquipment = homeCameraMapper.findHomeCanmeraEquipmentBySnCode(snCode);
                if (homeCameraEquipment == null) {
                    return ResultMap.build().msg("未找到该设备，请重新输入sn码！");
                } else if(homeCameraEquipment.getOnlineState()=="0"|| homeCameraEquipment.getOfflineTime()!=null){
                    LocalDateTime homeOfflineTime = homeCameraEquipment.getOfflineTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                    Duration homeDuration = Duration.between(homeOfflineTime, localDateTime);
                    if(homeDuration.toDays()>=2){
                        //离线时间大于两天发送警报

                        return ResultMap.build().msg("请注意，设备已离线两天！");

                    }else{
                        return ResultMap.build().msg("该设备已离线但是未超过两天！");
                    }
                }
            }else if(sosEquipment.getOnlineState()=="0"|| sosEquipment.getOfflineTime()!=null){
                LocalDateTime sosOfflineTime = sosEquipment.getOfflineTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                Duration sosDuration = Duration.between(sosOfflineTime, localDateTime);
                if(sosDuration.toDays()>=2){
                    return ResultMap.build().msg("请注意，设备已离线两天！");
                }else{
                    return ResultMap.build().msg("该设备已离线但是未超过两天！");
                }
            }
        }else if(braceletEquipment.getOnlineState()=="0"|| braceletEquipment.getOfflineTime()!=null){
            LocalDateTime braceletOfflineTime = braceletEquipment.getOfflineTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            Duration braceletDuration = Duration.between(braceletOfflineTime, localDateTime);
            if(braceletDuration.toDays()>=2){
                return ResultMap.build().msg("请注意，设备已离线两天！");
            }else{
                return ResultMap.build().msg("该设备已离线但是未超过两天！");
            }
        }
        return ResultMap.build().msg("该设备仍然在线");
    }


}
