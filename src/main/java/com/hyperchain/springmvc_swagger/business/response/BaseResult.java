package com.hyperchain.springmvc_swagger.business.response;

import com.hyperchain.springmvc_swagger.business.constant.Code;

public final class BaseResult<T> {
    private int code;
    private String message;
    private T data = (T) new Object();

    public BaseResult() {
        this.data = (T) new Object();
    }

    public BaseResult(String message) {
        this();
        this.code = 200;
        this.message = message;
    }

    public BaseResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 与Code码交互
    public BaseResult(Code code){
        this();
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    /**
     * 返回结果代码code和消息message,不需要返回值
     * @param code
     */
    public final void returnWithoutValue(Code code){
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    /**
     * 返回结果代码code和消息message,并返回值
     * @param code
     * @param object
     */
    public final void returnWithValue(Code code,T object){
        returnWithoutValue(code);
        this.data = object;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
