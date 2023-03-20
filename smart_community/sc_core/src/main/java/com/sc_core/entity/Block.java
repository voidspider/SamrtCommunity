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
public class Block {
    String blockId;
    String blockNo;
    String community;
    String blockLongitude;
    String blockLatitude;
}
