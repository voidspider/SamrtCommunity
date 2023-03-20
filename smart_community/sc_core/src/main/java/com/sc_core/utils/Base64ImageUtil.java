package com.sc_core.utils;
import java.io.IOException;
import org.apache.commons.codec.binary.Base64;
public class Base64ImageUtil {

	public static String byteArr2String(byte[] byteArr) throws Exception {
		String stringBase64 = null;		
		try {
			 Base64 encoder = new Base64();
			 stringBase64 =(byteArr != null ? encoder.encodeToString(byteArr) : "");
		} catch (Exception e) {
			throw new Exception("byteArr2String转换异常:"+e);
		}
		return stringBase64;
    }
}