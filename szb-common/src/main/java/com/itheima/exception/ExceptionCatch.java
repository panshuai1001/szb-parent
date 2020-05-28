package com.itheima.exception;

import com.itheima.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 * Created by lenovo on 2020/5/23.
 */
@ControllerAdvice
@Slf4j
public class ExceptionCatch {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result catchException(Exception ex){
      log.error("出异常了: "+ex.getMessage());
      return Result.error("您的网络有问题，请稍后重试");
    }
}
