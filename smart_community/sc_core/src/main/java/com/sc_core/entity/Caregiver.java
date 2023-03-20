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
public class Caregiver {

    String caregiverId;
    String name;
    String sex;
    int age;
    String telephone;
    String elderlyId;
    String username;
    String caregiverLongitude;
    String caregiverLatitude;


}
