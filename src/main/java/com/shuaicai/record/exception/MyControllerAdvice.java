package com.shuaicai.record.exception;

import com.shuaicai.record.utils.ResponseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName MyControllerAdvice
 * @Description TODO
 * @Author shuai cai
 * @Date 2022/8/18 20:53
 * @PackagePath com.shuaicai.record.exception
 * @Version 1.0
 */
@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseResult handlerException(Exception e){
        String message = e.getMessage();
        ResponseResult result = new ResponseResult(300, message);
        return result;
    }
}
