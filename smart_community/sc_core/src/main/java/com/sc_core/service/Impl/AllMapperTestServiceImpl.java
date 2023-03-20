package com.sc_core.service.Impl;

import com.sc_core.dao.AllSqlTestMapper;
import com.sc_core.entity.Caregiver;
import com.sc_core.entity.Elderly;
import com.sc_core.entity.FamilyMembers;
import com.sc_core.service.AllMapperTestService;
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
public class AllMapperTestServiceImpl implements AllMapperTestService {

    @Autowired
    AllSqlTestMapper mapper;

    @Override
    public String test_Mapper(String msg) {
        return mapper.test_Mapper(msg);
    }

    @Override
    public List<Elderly> test_queryEveryElderlyInfo() {
        return mapper.queryEveryElderlyInfo();
    }

    @Override
    public List<FamilyMembers> test_queryEveryFamilyMembersInfo() {
        return mapper.queryEveryFamilyMembersInfo();
    }

    @Override
    public List<Caregiver> test_queryEveryCaregiverInfo() {
        return mapper.queryEveryCaregiverInfo();
    }

}
