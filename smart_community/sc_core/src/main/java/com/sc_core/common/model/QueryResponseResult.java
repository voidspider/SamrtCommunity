package com.sc_core.common.model;


import java.io.Serializable;

public class QueryResponseResult<T> extends ResponseResult implements Serializable {

    QueryResult<T> data;

    public QueryResponseResult() {
    }

    public QueryResponseResult(ResultCode resultCode) {
        super(resultCode);
    }

    public QueryResponseResult(ResultCode resultCode, QueryResult<T> data) {
        super(resultCode);
        this.data = data;
    }

    public <T, U, V> QueryResponseResult(CommonCode success, QueryResult<T> restPage, QueryResult<U> restPage1) {
    }

    public QueryResult<T> getData() {
        return data;
    }

    public void setData(QueryResult<T> data) {
        this.data = data;
    }

}
