package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${helloworld}")
	private String helloworld;
	
	
	@RequestMapping(value="/hello")
	public String hello(){
		
		System.out.println(helloworld);
		
		System.out.println("devtools 使用");
		
		return helloworld;
	}
	
	@RequestMapping(value="/testhello")
	public String testello(){
		
		System.out.println(helloworld);
		
		System.out.println("devtools 使用");
		
		return "hello world";
	}
}
