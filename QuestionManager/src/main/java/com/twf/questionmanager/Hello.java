package com.twf.questionmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

	@RequestMapping("/login") 
	public String hello(){ 
		return "login";
	}
}
