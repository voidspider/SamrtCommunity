package com.sc_core.common.requestdata;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author 张渊
 */

public class ElderlyKeyWordsRequestData {

    @ApiModelProperty(value = "页码,从1开始", required = true)
    private Integer page;

    @ApiModelProperty(value = "每页数量", required = true)
    private Integer size;

    private String  elderlyCommunity;

    private String community;

    private String name;

    private int ageLow;

    private int ageHigh;

    private String livingType;

    private String sex;

    private String familyType;

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

    public String getElderlyCommunity() {
        return elderlyCommunity;
    }

    public void setElderlyCommunity(String elderlyCommunity) {
        this.elderlyCommunity = elderlyCommunity;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeLow() {
        return ageLow;
    }

    public void setAgeLow(int ageLow) {
        this.ageLow = ageLow;
    }

    public int getAgeHigh() {
        return ageHigh;
    }

    public void setAgeHigh(int ageHigh) {
        this.ageHigh = ageHigh;
    }

    public String getLivingType() {
        return livingType;
    }

    public void setLivingType(String livingType) {
        this.livingType = livingType;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFamilyType() {
        return familyType;
    }

    public void setFamilyType(String familyType) {
        this.familyType = familyType;
    }

    @Override
    public String toString() {
        return "ElderlyKeywordsRequestData{" +
                "page=" + page +
                ", size=" + size +
                ", elderlyCommunity='" + elderlyCommunity + '\'' +
                ", community='" + community + '\'' +
                ", name='" + name + '\'' +
                ", ageLow=" + ageLow +
                ", ageHigh=" + ageHigh +
                ", livingType='" + livingType + '\'' +
                ", sex='" + sex + '\'' +
                ", familyType='" + familyType + '\'' +
                '}';
    }
}
