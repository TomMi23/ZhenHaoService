package com.zhenhao.service.enums;

public enum  ErrorCodeAndMsg {

    Student_number_does_not_exist("0001","学号不存在"),
    Insufficient_student_number("0002","学号长度不足"),
    Student_number_is_empty("0003","学号为空"),
    Network_error("9999","网络错误，待会重试"),
    swiper_position_error("0004","position为null"),
    ;

    private String ReturnCode;
    private String ReturnMsg;

    ErrorCodeAndMsg(String code, String msg) {
        this.ReturnCode = code;
        this.ReturnMsg = msg;
    }

    public String getReturnCode() {
        return ReturnCode;
    }
    public void setReturnCode(String code) {
        this.ReturnCode = code;
    }
    public String getReturnMsg() {
        return ReturnMsg;
    }
    public void setReturnMsg(String msg) {
        this.ReturnMsg = msg;
    }
}

