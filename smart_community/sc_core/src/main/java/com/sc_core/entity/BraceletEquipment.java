package com.sc_core.entity;




import lombok.ToString;

import java.util.Date;

@ToString

public class BraceletEquipment {


    /**
     * 手环设备id
     */
    private int braceletId;
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
     * 佩戴状态
     */
    private String carryState;

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
     * 数据采集次数
     */
    private int collectTimes;

    /**
     * 出现异常指标次数
     */
    private int anomalyTimes;

    /**
     * 紧急联系人id
     */
    private int emergencyContactId;

    /**
     * 经度
     */
    private double braceletLongitude;

    /**
     * 纬度
     */
    private double braceletLatitude;

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

    public double getBraceletLongitude() {
        return braceletLongitude;
    }

    public void setBraceletLongitude(double braceletLongitude) {
        this.braceletLongitude = braceletLongitude;
    }

    public double getBraceletLatitude() {
        return braceletLatitude;
    }

    public void setBraceletLatitude(double braceletLatitude) {
        this.braceletLatitude = braceletLatitude;
    }

    public int getBraceletId() {
        return braceletId;
    }

    public void setBraceletId(int braceletId) {
        this.braceletId = braceletId;
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

    public String getCarryState() {
        return carryState;
    }

    public void setCarryState(String carryState) {
        this.carryState = carryState;
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

    public int getCollectTimes() {
        return collectTimes;
    }

    public void setCollectTimes(int collectTimes) {
        this.collectTimes = collectTimes;
    }

    public int getAnomalyTimes() {
        return anomalyTimes;
    }

    public void setAnomalyTimes(int anomalyTimes) {
        this.anomalyTimes = anomalyTimes;
    }

    public int getEmergencyContactId() {
        return emergencyContactId;
    }

    public void setEmergencyContactId(int emergencyContactId) {
        this.emergencyContactId = emergencyContactId;
    }


}
