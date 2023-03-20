package com.sc_core.entity;


import java.util.Date;

public class HomeCameraEquipment {
    /**
     * 家用摄像头id
     */
    private int homeCameraId;
    /**
     *设备图像
     */

    /**
     * 老人id
     */
    private int elderlyId;
    /**
     * 设备名称
     */
    private String equipmentName;
    /**
     * 设备类型
     */
    private String equipmentType;
    /**
     * SN码
     */
    private String snCode;
    /**
     * 设备使用者姓名
     */
    private String userName;
    /**
     * 老人电话
     */
    private String telephone;
    /**
     * 老人所在社区
     */
    private String community;
    /**
     * 设备在线状态
     */
    private String onlineState;
    /**
     * 紧急联系人id
     */
    private int emergencyContactId;
    /**
     * 监控信息
     */
    private String monitorInfo;

    /**
     * 经度
     */
    private double longitude;

    /**
     * 纬度
     */
    private double latitude;

    /**
     * 离线时间
     */
    private Date offlineTime;
    /**
     * 离线时长
     */
    private String offlineDuration;

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public String getOfflineDuration() {
        return offlineDuration;
    }

    public void setOfflineDuration(String offlineDuration) {
        this.offlineDuration = offlineDuration;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getHomeCameraId() {
        return homeCameraId;
    }

    public void setHomeCameraId(int homeCameraId) {
        this.homeCameraId = homeCameraId;
    }

    public int getElderlyId() {
        return elderlyId;
    }

    public void setElderlyId(int elderlyId) {
        this.elderlyId = elderlyId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getSnCode() {
        return snCode;
    }

    public void setSnCode(String snCode) {
        this.snCode = snCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getOnlineState() {
        return onlineState;
    }

    public void setOnlineState(String onlineState) {
        this.onlineState = onlineState;
    }

    public int getEmergencyContactId() {
        return emergencyContactId;
    }

    public void setEmergencyContactId(int emergencyContactId) {
        this.emergencyContactId = emergencyContactId;
    }

    public String getMonitorInfo() {
        return monitorInfo;
    }

    public void setMonitorInfo(String monitorInfo) {
        this.monitorInfo = monitorInfo;
    }

    @Override
    public String toString() {
        return "HomeCameraEquipment{" +
                "homeCameraId=" + homeCameraId +
                ", elderlyId=" + elderlyId +
                ", equipmentName='" + equipmentName + '\'' +
                ", equipmentType='" + equipmentType + '\'' +
                ", snCode='" + snCode + '\'' +
                ", userName='" + userName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", community='" + community + '\'' +
                ", onlineState='" + onlineState + '\'' +
                ", emergencyContactId=" + emergencyContactId +
                ", monitorInfo='" + monitorInfo + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", offlineTime='" + offlineTime + '\'' +
                ", offlineDuration='" + offlineDuration + '\'' +
                '}';
    }
}
