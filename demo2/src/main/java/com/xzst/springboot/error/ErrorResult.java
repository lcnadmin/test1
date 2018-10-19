package com.xzst.springboot.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice(basePackages="com.xzst.springboot.controller")
public class ErrorResult {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> errorResult(){
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		hashMap.put("errorCode", "500");
		hashMap.put("errorMsg", "系统异常");
		return hashMap;
	}
}
