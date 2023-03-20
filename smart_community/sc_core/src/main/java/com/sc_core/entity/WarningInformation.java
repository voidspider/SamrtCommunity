package com.sc_core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class WarningInformation {
    /**
     * 预警信息id
     */
    private int wariningInfoId;

    /**
     * 老人id
     */
    private int elderlyId;

    /**
     * 发起人姓名
     */
    private String initiatorName;

    /**
     * 预警状态
     */
    private String warningType;

    /**
     * 预警时间
     */
    private String warningTime;

    /**
     * 预警地址
     */
    private String warningAddress;

    /**
     * 预警设备
     */
    private String warningEquipment;

    /**
     * 救助状态/响应状态
     */
    private String helpState;

    /**
     * 附加信息
     */
    private String additionInfo;

    /**
     * 预警信息数量
     */
    private int count;

    /**
     * 紧急联系人信息
     */
     private String  emergencyContactInfo;


    /**
     * 响应时间
     */
    private String responseTime;

    /**
     * 接收预警响应人的id
     */
     private int receiveWarningId;
    /**
     * 预警解决时间
     */
    private String solveTime;
    /**
     * 预警解决描述
     */
    private String warningSolveDescribe;
    /**
     * 老人和预警接收人的距离
     */
    private String elderlyResponserDistance;
}
