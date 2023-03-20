package com.sc_core.common.model;


public interface ResultCode {
    //操作是否成功,true为成功，false操作失败
    String success();
    //操作代码
    int code();
    //提示信息
    String message();

}
