package com.sc_core.service.Impl;

import com.github.pagehelper.PageHelper;
import com.sc_core.common.model.QueryResult;
import com.sc_core.common.requestdata.CaregiverRequestData;
import com.sc_core.dao.CaregiverMapper;
import com.sc_core.entity.Caregiver;
import com.sc_core.service.CaregiverService;
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
public class CaregiverServiceImpl implements CaregiverService {

    @Autowired
    CaregiverMapper caregivermapper;

    @Override
    public List<Caregiver> queryCaregiverByElderlyId(String elderlyId) {
        return caregivermapper.queryCaregiverByElderlyId(elderlyId);
    }

    @Override
    public QueryResult findCaregiverByKeyWords(CaregiverRequestData request) {
        PageHelper.startPage(request.getPage(),request.getSize());
        return QueryResult.restPage(caregivermapper.findCaregiverByKeyWords(request));
    }

}
