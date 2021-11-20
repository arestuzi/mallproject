package com.qingcheng.entity;

import java.io.Serializable;

public class Result implements Serializable {
    private Integer code; // return code 0: success 1: error
    private String message;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result() {
        this.code = 0;
        this.message = "执行成功";
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
