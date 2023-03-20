package com.sc_core.entity;

public class WarningInfoCount {

    /**
     * 紧急预警数量
     */
    private int emergencyCount;
    /**
     * 一般预警数量
     */
    private int commonCount;
    /**
     * 紧急预警--预警中的数量
     */
    private int emergencyAlarmingCount;
    /**
     * 紧急预警--救助中数量
     */
    private int emergencyHelpingCount;
    /**
     * 紧急预警--已完成数量
     */
    private int emergencySolvedCount;
    /**
     * 紧急预警--预警中的数量
     */
    private int commonAlarmingCount;
    /**
     * 紧急预警--救助中数量
     */
    private int commonHelpingCount;
    /**
     * 紧急预警--已完成数量
     */
    private int commonSolvedCount;




    public int getEmergencyCount() {
        return emergencyCount;
    }

    public void setEmergencyCount(int emergencyCount) {
        this.emergencyCount = emergencyCount;
    }

    public int getCommonCount() {
        return commonCount;
    }

    public void setCommonCount(int commonCount) {
        this.commonCount = commonCount;
    }

    public int getEmergencyAlarmingCount() {
        return emergencyAlarmingCount;
    }

    public void setEmergencyAlarmingCount(int emergencyAlarmingCount) {
        this.emergencyAlarmingCount = emergencyAlarmingCount;
    }

    public int getEmergencyHelpingCount() {
        return emergencyHelpingCount;
    }

    public void setEmergencyHelpingCount(int emergencyHelpingCount) {
        this.emergencyHelpingCount = emergencyHelpingCount;
    }

    public int getEmergencySolvedCount() {
        return emergencySolvedCount;
    }

    public void setEmergencySolvedCount(int emergencySolvedCount) {
        this.emergencySolvedCount = emergencySolvedCount;
    }

    public int getCommonAlarmingCount() {
        return commonAlarmingCount;
    }

    public void setCommonAlarmingCount(int commonAlarmingCount) {
        this.commonAlarmingCount = commonAlarmingCount;
    }

    public int getCommonHelpingCount() {
        return commonHelpingCount;
    }

    public void setCommonHelpingCount(int commonHelpingCount) {
        this.commonHelpingCount = commonHelpingCount;
    }

    public int getCommonSolvedCount() {
        return commonSolvedCount;
    }

    public void setCommonSolvedCount(int commonSolvedCount) {
        this.commonSolvedCount = commonSolvedCount;
    }
}
