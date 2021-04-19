package com.introspect2.testproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@RequestMapping("/sayHello")
	public String helloWorld() {
		
		return "hello world";
		
	}

}
