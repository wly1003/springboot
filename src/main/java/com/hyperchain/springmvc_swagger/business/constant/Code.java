package com.hyperchain.springmvc_swagger.business.constant;

public enum Code {
    // 通用部分
    UNDEFINED(-2,"未定义"),
    FAILED(-1,"失败"),
    SUCCESS(0,"成功"),
    SYSTEM_ERROR(9999, "系统异常，请稍后重试");

    private int code;
    private String message;

    Code(int code, String message) {
        this.code = code;
        this.message = message;
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

    public static String getMessageByCodeInt(int codeInt){
       for (Code e:Code.values()){
           if (e.getCode() == codeInt) {
               return e.message;
           }
       }
       throw new IllegalArgumentException("未定义的code码:"+codeInt);
    }

    public static Code getCodeByCodeInt(int codeInt){
        for (Code e:Code.values()) {
            if (e.getCode() == codeInt) {
                return e;
            }
        }
        throw new IllegalArgumentException("未定义的code码:"+codeInt);
    }
}
