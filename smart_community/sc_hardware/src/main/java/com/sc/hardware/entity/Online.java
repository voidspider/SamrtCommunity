package com.sc.hardware.entity;

import lombok.Data;

@Data
public class Online {
    private String deviceId;
    private String tenantId;
    private String productId;
    private String eventType;
    private String messageType;
    private String timestamp;

/*
deviceId
tenantId
productId
eventType
messageType
timestamp
*/
}
