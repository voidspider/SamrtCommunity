package com.sc_core.common.model;



import java.io.Serializable;

/**
 * @author 李长霖
 *  * date  : 2022/10/25
 */

public class CommonResponseResult<T> extends ResponseResult implements Serializable {

    T data;

    public CommonResponseResult() {
    }

    public CommonResponseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResponseResult(String success, int code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data    获取的数据
     * @param message 提示信息
     */
    public static <T> CommonResponseResult<T> success(String message, T data) {
        return new CommonResponseResult<T>(CommonCode.SUCCESS.code(), message, data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommonResponseResult<T> success(T data) {
        return success(CommonCode.SUCCESS.message, data);
    }

    /**
     * 失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> CommonResponseResult<T> failed(String message) {
        return new CommonResponseResult<T>(CommonCode.FAIL.code, message, null);
    }

    public static <T> CommonResponseResult<T> failed(String success, String message) {
        return new CommonResponseResult<T>(success, CommonCode.FAIL.code, message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResponseResult<T> failed() {
        return failed(CommonCode.FAIL.message);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
