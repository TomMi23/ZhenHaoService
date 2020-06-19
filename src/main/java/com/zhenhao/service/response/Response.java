package com.zhenhao.service.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 请求返回类
 * Created by Tiger on 2018/10/9.
 */
@Getter
@Setter
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -4505655308965878999L;

    //请求成功返回码为：TS0000
    private static final String successCode = "TS0000";
    //返回数据
    private T ReturnData;
    //返回码
    private String ReturnCode;
    //返回描述
    private String ReturnMsg;

    public Response(){
        this.ReturnCode = successCode;
        this.ReturnMsg = "SUCCESS";
    }

    public Response(String code,String msg){
        this();
        this.ReturnCode = code;
        this.ReturnMsg = msg;
    }
    public Response(String code,String msg,T data){
        this();
        this.ReturnCode = code;
        this.ReturnMsg = msg;
        this.ReturnData = data;
    }
    public Response(T data){
        this();
        this.ReturnData = data;
    }
}

