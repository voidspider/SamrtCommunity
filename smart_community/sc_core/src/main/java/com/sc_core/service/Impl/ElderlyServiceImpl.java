package com.sc_core.service.Impl;

import com.github.pagehelper.PageHelper;
import com.sc_core.common.model.*;
import com.sc_core.common.requestdata.ElderlyKeyWordsRequestData;
import com.sc_core.common.requestdata.ElderlyRequestData;
import com.sc_core.dao.CaregiverMapper;
import com.sc_core.dao.ElderlyMapper;
import com.sc_core.dao.WarningInformationMapper;
import com.sc_core.entity.Elderly;
import com.sc_core.service.ElderlyService;
import com.sc_core.utils.Base64ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 温馨提示：如果您对此文件进行修改 请不要删除原有作者及注释信息，请补充您的信息和修改原因
 * 修改示范：
 *
 * @author 原作者名
 * @modified 修改者名 at 2099-02-05 因修复xxbug进行xx修改
 * @modified 修改者名 at 2099-09-13 因新增xx功能添加xx代码
 */

/**
 * @author 李长霖
 */
@Service
public class ElderlyServiceImpl implements ElderlyService {

    @Autowired
    ElderlyMapper elderlyMapper;
    @Autowired
    CaregiverMapper caregiverMapper;
    @Autowired
    WarningInformationMapper warningInformationMapper;

    @Override
    public String queryElderlyDetailedInfo(String elderlyId) {
        return elderlyMapper.queryElderlyById(elderlyId).toString()
                + caregiverMapper.queryCaregiverByElderlyId(elderlyId).toString()
                + warningInformationMapper.queryInfoByElderlyId(elderlyId).toString();
    }

    @Override
    public List<Map<String, Object>> countElderlyByLivingType() {
        return elderlyMapper.countElderlyByLivingType();
    }

    @Override
    public List<Map<String, Object>> countElderlyBySex() {
        return elderlyMapper.countElderlyBySex();
    }

    @Override
    public List<Map<String, Object>> countElderlyByFamilyType() {
        return elderlyMapper.countElderlyByFamilyType();
    }

    @Override
    public List<Map<String, Object>> countElderlyByAge() {
        return elderlyMapper.countElderlyByAge();
    }

    @Override
    public ResponseResult findElderlyByAddress (ElderlyRequestData request) throws IOException {
        PageHelper.startPage(request.getPage(), request.getSize());
        List<Elderly> elderlies = elderlyMapper.findElderlyByAddress(request);
//        for(Elderly elderly : elderlies){
//            InputStream inputStream = new ByteArrayInputStream(elderly.getElderlyPhoto());
//            BufferedImage image = ImageIO.read(inputStream);
//            elderly.setElderlyPhotoImage(image);
//        }
        return new QueryResponseResult(CommonCode.SUCCESS, QueryResult.restPage(elderlies));

    }

    @Override
    public QueryResult<Elderly> findElderly(ElderlyKeyWordsRequestData request) {
        PageHelper.startPage(request.getPage(),request.getSize());
        List<Elderly> elderlies = elderlyMapper.findElderly(request);
        return QueryResult.restPage(elderlies);
    }

    @Override
    public Object findElderlyPhoto(String elderlyId) throws Exception {

      byte[] bytes = (byte[]) elderlyMapper.findElderlyPhoto(elderlyId);

//        BufferedImage image = ImageIO.read(new ByteArrayInputStream(bytes));
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ImageIO.write(image, format, baos);
//        byte[] imageData = baos.toByteArray();
//        response.setContentType("image/" + format);
//        response.setContentLength(imageData.length);
//        response.getOutputStream().write(imageData);
//        return image;
        String photo64 = Base64ImageUtil.byteArr2String(bytes);

        return photo64;

    }

    @Override
    public Elderly queryElderlyInfo(String elderlyId) {
        return elderlyMapper.findElderlyByid(elderlyId);
    }
}

