package com.xzst.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
	@RequestMapping("/geterror")
	public String getError(int i){
		int j = 1/i;
		return "success"+j;
	}
}
