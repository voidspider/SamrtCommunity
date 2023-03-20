package com.sc_core.common.requestdata;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

/**
 * @author 张渊
 */

@ToString
public class CommunityWorkerRequestData {

    @ApiModelProperty(value = "页码,从1开始", required = true)
    private Integer page;

    @ApiModelProperty(value = "每页数量", required = true)
    private Integer size;

    private Integer communityWorkerId;


    private String name;

    private String username;

    private String workerCommunity;

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

    public Integer getCommunityWorkerId() {
        return communityWorkerId;
    }

    public void setCommunityWorkerId(Integer communityWorkerId) {
        this.communityWorkerId = communityWorkerId;
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

    public String getWorkerCommunity() {
        return workerCommunity;
    }

    public void setWorkerCommunity(String workerCommunity) {
        this.workerCommunity = workerCommunity;
    }
}
