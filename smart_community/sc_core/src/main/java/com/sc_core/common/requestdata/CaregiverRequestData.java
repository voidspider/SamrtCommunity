package com.sc_core.common.requestdata;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

/**
 * @author 张渊
 */

@ToString
public class CaregiverRequestData {

    @ApiModelProperty(value = "页码,从1开始", required = true)
    private Integer page;

    @ApiModelProperty(value = "每页数量", required = true)
    private Integer size;

    private Integer caregiverId;

    private Integer elderlyId;

    private String name;

    private String username;

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

    public Integer getCaregiverId() {
        return caregiverId;
    }

    public void setCaregiverId(Integer caregiverId) {
        this.caregiverId = caregiverId;
    }

    public Integer getElderlyId() {
        return elderlyId;
    }

    public void setElderlyId(Integer elderlyId) {
        this.elderlyId = elderlyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
