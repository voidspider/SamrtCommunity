package com.sc_core.common.requestdata;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author 张渊
 */

public class ElderlyRequestData {


    @ApiModelProperty(value = "页码,从1开始", required = true)
    private Integer page;

    @ApiModelProperty(value = "每页数量", required = true)
    private Integer size;
    /**
     * 省份
     */
    private String  elderlyProvince;
    /**
     * 市
     */
    private String  elderlyCity;
    /**
     * 区
     */
    private String  elderlyArea;
    /**
     * 街道
     */
    private String  elderlyStreet;
    /**
     * 小区
     */
    private  String elderlyCommunity;


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

    public String getElderlyProvince() {
        return elderlyProvince;
    }

    public void setElderlyProvince(String elderlyProvince) {
        this.elderlyProvince = elderlyProvince;
    }

    public String getElderlyCity() {
        return elderlyCity;
    }

    public void setElderlyCity(String elderlyCity) {
        this.elderlyCity = elderlyCity;
    }

    public String getElderlyArea() {
        return elderlyArea;
    }

    public void setElderlyArea(String elderlyArea) {
        this.elderlyArea = elderlyArea;
    }

    public String getElderlyStreet() {
        return elderlyStreet;
    }

    public void setElderlyStreet(String elderlyStreet) {
        this.elderlyStreet = elderlyStreet;
    }

    public String getElderlyCommunity() {
        return elderlyCommunity;
    }

    public void setElderlyCommunity(String elderlyCommunity) {
        this.elderlyCommunity = elderlyCommunity;
    }

    @Override
    public String toString() {
        return "ElderlyRequestData{" +
                "page=" + page +
                ", size=" + size +
                ", elderlyProvince='" + elderlyProvince + '\'' +
                ", elderlyCity='" + elderlyCity + '\'' +
                ", elderlyArea='" + elderlyArea + '\'' +
                ", elderlyStreet='" + elderlyStreet + '\'' +
                ", elderlyCommunity='" + elderlyCommunity + '\'' +
                '}';
    }
}
