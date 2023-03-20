package com.sc_core.common.model;



public enum CommonCode implements ResultCode{

    NULL("成功",00000,"查询结果为空！请重新输入查询条件！"),
    SUCCESS("成功",200,"操作成功！"),
    FAIL("失败",11111,"操作失败！"),
    UN_MATCHFAIL("失败",400," 请求和服务器不匹配/参数类型不匹配/非法参数！！"),
    LoginOutOfDate("失败",504,"登陆超时！"),
    NOT_FOUND("失败",404,"未找到可匹配的路径！"),
    SERVER_FAIL("失败",500,"服务器异常！"),
    REGISTER_FAIL("失败",11112,"账号已注册！");

    //    CAR_NUMBER_ERROR(false,10004,"实际车辆不存在！");
//    private static ImmutableMap<Integer, CommonCode> codes ;
    //操作是否成功
    String success;
    //操作代码
    int code;
    //提示信息
    String message;
    private CommonCode(String success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public String success() {
        return success;
    }
    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public String toString() {
        return "CommonCode{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
