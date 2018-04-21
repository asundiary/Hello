package com.yang.lab.conf;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(value=Exception.class)
    public String allExceptionHandler(HttpServletRequest request ,Exception exception){
        exception.printStackTrace();
        System.out.println("");
        return " ";
    }
}
