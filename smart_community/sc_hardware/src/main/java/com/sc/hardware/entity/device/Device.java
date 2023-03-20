package com.sc.hardware.entity.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Device {
    //device包含了所有嵌套json属性，在于作为通用的嵌套内层来接收数据，使用时显现具体类型（隐性，不存在继承关系）
    private String battery_value;
    private String sinr;
    private String ecl;
    private String rsrp;
    private String pci;
    private String cell_id;
    @JsonProperty("IMEI")
    private String IMEI;
    @JsonProperty("IMSI")
    private String IMSI;
    @JsonProperty("ICCID")
    private String ICCID;
    private String alarm_type;
    private String open_state;
    private String arming_state;
    private String terminal_type;
    private String heartbeat_time;
    private String battery_voltage;
    private String hardware_version;
    private String software_version;
    private String manufacturer_name;
    private String error_code;
    private String tamp_state;
    private String device_state;
    private String battery_state;
    private String infrared_detection_state;
    private String work_mode;
    private String activity_period;
    private String activity;
    private String urgentReport;
    private String activityPlan;
    private String alarmCounter;
}
