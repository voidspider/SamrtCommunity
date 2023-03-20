package com.sc_core.common.requestdata;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 张渊
 */

@ApiModel(value = "分页查询基本参数")
public class WarningInfoRequestData {

    @ApiModelProperty(value = "页码,从1开始", required = true)
    private Integer page;

    @ApiModelProperty(value = "每页数量", required = true)
    private Integer size;

    private String helpState;
    private String warningAddress;
    private String warningEquipment;
    private String elderlyName;
    private int elderlyId;
    private String warningType;

    public int getElderlyId() {
        return elderlyId;
    }

    public void setElderlyId(int elderlyId) {
        this.elderlyId = elderlyId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getHelpState() {
        return helpState;
    }

    public void setHelpState(String helpState) {
        this.helpState = helpState;
    }

    public String getWarningAddress() {
        return warningAddress;
    }

    public void setWarningAddress(String warningAddress) {
        this.warningAddress = warningAddress;
    }

    public String getWarningEquipment() {
        return warningEquipment;
    }

    public void setWarningEquipment(String warningEquipment) {
        this.warningEquipment = warningEquipment;
    }

    public String getElderlyName() {
        return elderlyName;
    }

    public void setElderlyName(String elderlyName) {
        this.elderlyName = elderlyName;
    }

    public String getWarningType() {
        return warningType;
    }

    public void setWarningType(String warningType) {
        this.warningType = warningType;
    }
}
