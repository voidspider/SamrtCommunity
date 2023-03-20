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
public class FamilyMembers {
    String familyMembersId;
    String name;
    String sex;
    String age;
    String telephone;
    String elderlyId;
}
