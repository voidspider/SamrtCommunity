package com.sc_core.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import java.util.Date;
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)




public class SosEquipment {

    /**
     * sos警报器id
     */
    private int sosAlarmId;
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

}
