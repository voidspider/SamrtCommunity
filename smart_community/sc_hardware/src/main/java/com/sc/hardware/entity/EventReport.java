package com.sc.hardware.entity;

import com.sc.hardware.entity.device.Device;
import lombok.Data;

@Data
public class EventReport {
   private String  timestamp;
   private String  tenantId;
   private String  serviceId;
   private String  protocol;
   private String  productId;
   private String  messageType;
   private String  eventType;
   private String  deviceSn;
   private String  deviceId;
   private String  IMSI;
   private String  IMEI;
   private Device eventContent;


}
