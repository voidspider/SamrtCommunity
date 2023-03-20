package com.sc_core.controller;



import com.sc_core.common.model.ResponseResult;
import com.sc_core.common.requestdata.WarningInfoRequestData;
import com.sc_core.common.response.ResultMap;
import com.sc_core.service.WarningInformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李长霖
 */

@RestController
@Api(tags="预警信息管理")
@RequestMapping("/WarningInformationManage")
public class WarningInformationControllor {


    @Autowired
    private WarningInformationService warningInformationService;


    /**
     *预警信息管理---获取预警信息数量和详细信息
     * @param requset
     * @return
     */
    @GetMapping("/findWarningInfo")
    @ApiOperation("预警信息管理--根据关键字查询预警信息")
    public ResponseResult findWarningInfo(WarningInfoRequestData requset){
        return warningInformationService.findWarningInfo(requset);
    }

    /**
     *预警信息管理---根据预警信息id获取信息详情
     * @param warningInfoId
     * @return
     */
    @GetMapping("/findWarningInfoById")
    @ApiOperation("预警信息管理--根据信息id查询当前预警信息")
    public ResultMap findWarningInfoById(int warningInfoId){
        return warningInformationService.findWarningInfoById(warningInfoId);
    }

    /**
     *预警信息管理---获取预警信息数量和详细信息
     *
     * @param requset
     * @return
     */
    @GetMapping("/findWarningResponseInfo")
    @ApiOperation("预警信息管理--查询预警响应信息")
    public ResponseResult findWarningResponseInfo(WarningInfoRequestData requset){
        return warningInformationService.findWarningInfo(requset);
    }


    /**
     *预警信息管理---查询不同预警类型的数量和不同类型预警中不同预警状态的数量
     * @return
     */
    @GetMapping("/findWarningInfoCount")
    @ApiOperation("预警信息管理--查询不同预警类型的数量和不同类型预警中不同预警状态的数量")
    public ResultMap findWarningInfoCount(){
        return warningInformationService.findWarningInfoCount();
    }


}
