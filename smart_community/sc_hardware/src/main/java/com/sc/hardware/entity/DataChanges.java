package com.sc.hardware.entity;

import com.sc.hardware.entity.device.Device;
import lombok.Data;


@Data
public class DataChanges {
    private String upPacketSN;
    private String upDataSN;
    private String topic;
    private String timestamp;
    private String tenantId;
    private String serviceId;
    private String protocol;
    private String productId;
    private Device payload;
    private String messageType;
    private String deviceType;
    private String deviceId;
    private String assocAssetId;
    private String IMSI;
    private String IMEI;
}
