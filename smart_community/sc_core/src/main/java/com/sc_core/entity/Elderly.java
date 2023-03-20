package com.sc_core.entity;


import com.mysql.cj.jdbc.Blob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;


import java.awt.image.BufferedImage;



@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Elderly {
    String elderlyId;
    String name;
    String sex;
    Integer age;
    String idCard;
    String community;
    String address;
    String telephone;
    String livingType;  //住房情况
    String familyType;  //家庭情况
    String blockNo;     //楼栋号
//    byte[] elderlyPhoto;//老人照片字节数组形式
//    BufferedImage elderlyPhotoImage;//老人照片image形式
    //String subsidy;

}
