package com.sc_core.common.response;

import java.io.Serializable;
import java.util.HashMap;

public class ResultMap extends HashMap<String, Object> implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** 状态码 */
    public static final String CODE = "code";

    /** 返回内容 */
    public static final String MSG = "msg";

    /** 数据对象 */
    public static final String DATA = "data";

    ResultMap(){

    }

    public ResultMap(int code, String msg, Object data)
    {
        super.put(CODE, code);
        super.put(MSG, msg);
        if (!isNull(data))
        {
            super.put(DATA, data);
        }
    }

    private static boolean isNull(Object data) {
        return data==null;
    }

    public static ResultMap build(){
        return new ResultMap();
    }
    public ResultMap code(int code){
        return this.put(CODE, code);
    }

    public ResultMap msg(String msg){
        return this.put(MSG, msg);
    }

    public ResultMap data(Object data){
        return this.put(DATA, data);
    }

    public static ResultMap ok(){
        return new ResultMap(HttpStatus.SUCCESS, "成功！", null);
    }

    public static ResultMap error(){
        return new ResultMap(HttpStatus.INTERNAL_SERVER_ERROR, "失败！", null);
    }


    /**
     * 方便链式调用
     */
    @Override
    public ResultMap put(String key, Object value)
    {
        super.put(key, value);
        return this;
    }
}