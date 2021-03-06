package com.tianzeng.react.moudel;

import org.springframework.stereotype.Component;

/**
 * Created by tianzeng on 2017-03-16.
 */
public class Result {
    private String message;
    private boolean success;
    private Object obj;
    private Integer code;
    public Result(boolean success,String message) {
        this.message = message;
        this.success = success;
    }

    public Result(boolean success,String message,  Object obj) {
        this.message = message;
        this.success = success;
        this.obj = obj;
    }

    public Result() {
    }

    public Result(int i, boolean success,String message,  Object obj) {
        this.code = i;
        this.message = message;
        this.success = success;
        this.obj = obj;

    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
