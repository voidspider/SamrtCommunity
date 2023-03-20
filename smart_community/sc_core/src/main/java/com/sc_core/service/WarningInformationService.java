package com.sc_core.service;

import com.sc_core.common.model.ResponseResult;
import com.sc_core.common.requestdata.WarningInfoRequestData;
import com.sc_core.common.response.ResultMap;
import com.sc_core.entity.WarningInformation;

import java.util.List;

public interface WarningInformationService {

    ResponseResult findWarningInfo(WarningInfoRequestData requset);

    ResultMap findWarningInfoById(int warningInfoId);

    ResultMap findWarningInfoCount();

}
