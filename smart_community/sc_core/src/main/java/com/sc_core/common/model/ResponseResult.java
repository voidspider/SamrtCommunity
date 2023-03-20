package com.sc_core.common.model;


/**
 * @Author: mrt.
 * @Description:
 * @Date:Created in 2022/12/24 18:33.
 * @Modified By:
 */
public class ResponseResult implements Response {

    //操作是否成功
    String success = SUCCESS;

    //操作代码
    int code = SUCCESS_CODE;

    //提示信息
    String message;


    public ResponseResult() {
    }

    public ResponseResult(ResultCode resultCode) {
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();

    }

    public ResponseResult(String success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static ResponseResult SUCCESS() {
        return new ResponseResult(CommonCode.SUCCESS);
    }

    public static ResponseResult SUCCESS(String message) {
        return new ResponseResult(CommonCode.SUCCESS.success, CommonCode.SUCCESS.code(), message);
    }

    public static ResponseResult FAIL() {
        return new ResponseResult(CommonCode.FAIL);
    }

    public static ResponseResult FAIL(String message) {
        return new ResponseResult(CommonCode.FAIL.success, CommonCode.FAIL.code, message);
    }
    public static ResponseResult LoginOutOfDate(String message) {
        return new ResponseResult(CommonCode.LoginOutOfDate.success, CommonCode.LoginOutOfDate.code, message);
    }
    public static ResponseResult LoginOutOfDate() {
        return new ResponseResult(CommonCode.LoginOutOfDate);
    }
    public String isSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
