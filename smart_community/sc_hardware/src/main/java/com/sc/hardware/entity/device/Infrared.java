package com.sc.hardware.entity.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Infrared {
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
    private String error_code;
    private String tamp_state;
    private String arming_state;
    private String terminal_type;
    private String heartbeat_time;
    private String battery_voltage;
    private String hardware_version;
    private String software_version;
    private String manufacturer_name;
    private String device_state;
    private String battery_state;
    private String infrared_detection_state;
    private String work_mode;
    private String activity_period;
    private String activity;
    private String urgentReport;
    private String activityPlan;
    private String alarmCounter;

/*
battery_value
sinr
ecl
rsrp
pci
cell_id
IMEI
IMSI
ICCID
error_code
tamp_state
arming_state
terminal_type
heartbeat_time
battery_voltage
hardware_version
software_version
manufacturer_name
device_state
battery_state
infrared_detection_state
work_mode
activity_period
activity
urgentReport
activityPlan
alarmCounter
*/
}
