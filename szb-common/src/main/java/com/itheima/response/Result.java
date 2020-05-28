package com.itheima.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 统一响应结果类
 * Created by lenovo on 2020/5/23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {
    private Boolean flag;
    private String statusCode;
    private String msg;
    private Object data;

    public static Result ok(String msg){
        return new Result(true,StatusCode.SUCCESS,msg,null);
    }

    public static Result ok(String msg,Object data){
        return new Result(true,StatusCode.SUCCESS,msg,data);
    }

    public static Result ok(String msg,String statusCode,Object data){
        return new Result(true,statusCode,msg,data);
    }

    public static Result error(String msg){
        return new Result(false,StatusCode.ERROR,msg,null);
    }

    public static Result error(String msg,Object data){
        return new Result(false,StatusCode.ERROR,msg,data);
    }

    public static Result error(String msg,String statusCode,Object data){
        return new Result(false,statusCode,msg,data);
    }

}
