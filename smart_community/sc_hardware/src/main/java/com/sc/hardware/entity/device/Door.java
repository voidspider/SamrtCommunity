package com.sc.hardware.entity.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Door {
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
alarm_type
open_state
arming_state
terminal_type
heartbeat_time
battery_voltage
hardware_version
software_version
manufacturer_name

arming_state
battery_voltage
battery_value
open_state
alarm_type
arming_state

*/



}
