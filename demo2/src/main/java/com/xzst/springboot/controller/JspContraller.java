package com.xzst.springboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspContraller {
	
	@RequestMapping("/jspIndex")
	public String jspIndex(){
		return "jspIndex";
	}
}
