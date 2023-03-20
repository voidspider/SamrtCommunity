package com.sc_core.service.Impl;

import com.github.pagehelper.PageHelper;
import com.sc_core.common.model.*;
import com.sc_core.common.requestdata.WarningInfoRequestData;
import com.sc_core.common.response.ResultMap;
import com.sc_core.dao.BraceletMapper;
import com.sc_core.dao.WarningInformationMapper;
import com.sc_core.entity.FamilyMembers;
import com.sc_core.entity.WarningInfoCount;
import com.sc_core.entity.WarningInformation;
import com.sc_core.service.WarningInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 温馨提示：如果您对此文件进行修改 请不要删除原有作者及注释信息，请补充您的信息和修改原因
 * 修改示范：
 * @author 原作者名
 * @modified 修改者名 at 2099-02-05 因修复xxbug进行xx修改
 * @modified 修改者名 at 2099-09-13 因新增xx功能添加xx代码
 */

/**
 * @author 李长霖
 */
@Service
public class WarningInformationServiceImpl implements WarningInformationService {

    @Autowired
    WarningInformationMapper mapper;
    @Autowired
    private WarningInformationMapper warningInformationMapper;
    @Autowired
    private BraceletMapper braceletMapper;

    /**
     *重复文件合并，将原来的WarningInfoServiceImpl 文件合并到这个文件
     */
    @Override
    public ResponseResult findWarningInfo(WarningInfoRequestData request) {
        PageHelper.startPage(request.getPage(),request.getSize());
        List<WarningInformation> warningInformations = warningInformationMapper.findWarningInfo(request);

//        //将所有预警信息的老人id组成一个列表
//        Set<Integer> ElderlyIds = warningInfos.stream()
//                .map(WarningInfo::getElderlyId)
//                .collect(Collectors.toSet());
//        //在老人-家人关系表中查出所有老人对应的家人id
//        List FamilyIds = warningInfoMapper.findFamilyIDs(ElderlyIds);
        for(WarningInformation warningInformation : warningInformations){
            warningInformation.setInitiatorName(braceletMapper.findElderlyName(warningInformation.getElderlyId()));
//            int familyId = warningInfoMapper.findFamilyID(warningInfo.getElderlyId());
            //一个老人关联了多个家人 （紧急联系人）
            List<FamilyMembers> emergencyContactInfoList = warningInformationMapper.findFamilyInfo(warningInformation.getElderlyId());
            String emergencyContactInfo = emergencyContactInfoList.toString();
            warningInformation.setEmergencyContactInfo(emergencyContactInfo);
            warningInformation.setCount(warningInformationMapper.findInfoCount());
        }

        return new QueryResponseResult(CommonCode.SUCCESS, QueryResult.restPage(warningInformations));
    }

    @Override
    public ResultMap findWarningInfoById(int warningInfoId) {
        WarningInformation warningInformation = warningInformationMapper.findWarningInfoById(warningInfoId);
        if(warningInformation==null){
            return  ResultMap.build().code(200).msg("该预警信息不存在！请重新输入！").data(null);
        }
        List emergencyContactInfoList = warningInformationMapper.findFamilyInfo(warningInformation.getElderlyId());
        String emergencyContactInfo = emergencyContactInfoList.toString();
        warningInformation.setEmergencyContactInfo(emergencyContactInfo);
        warningInformation.setCount(warningInformationMapper.findInfoCount());
        return ResultMap.build().code(200).msg("成功").data(warningInformation);
    }

    @Override
    public ResultMap findWarningInfoCount() {

        WarningInfoCount warningInfoCount = new WarningInfoCount();
        warningInfoCount.setEmergencyCount(warningInformationMapper.findEmergencyCount());
        warningInfoCount.setCommonCount(warningInformationMapper.findCommonCount());
        warningInfoCount.setEmergencyAlarmingCount(warningInformationMapper.findEmergencyAlarmingCount());
        warningInfoCount.setEmergencyHelpingCount(warningInformationMapper.findEmergencyHelpingCount());
        warningInfoCount.setEmergencySolvedCount(warningInformationMapper.findEmergencySolvedCount());
        warningInfoCount.setCommonAlarmingCount(warningInformationMapper.findCommonAlarmingCount());
        warningInfoCount.setCommonHelpingCount(warningInformationMapper.findCommonHelpingCount());
        warningInfoCount.setCommonSolvedCount(warningInformationMapper.findCommonSolvedCount());
//        if(warningInfoCount==null){
//            return ResultMap.error(ErrorCodeEnum.RESULT_NULL);
//        }
        return ResultMap.build().code(200).msg("成功").data(warningInfoCount);
    }

}
