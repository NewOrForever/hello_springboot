package com.example.demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// 先加载config下的配置文件
	@Value("${helloSpringBoot}")
	private String helloSpringBoot;
	
	@Value("${hello.secret}")
	private String secret;
	
	@Value("${hello.number}")
	private String number;
	
	@RequestMapping("/helloWorld")
	public String helloWorld(){
		System.out.println(helloSpringBoot);
		return "hello world spring boot";
	}
	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println(helloSpringBoot);
		return helloSpringBoot;
	}
	
	@RequestMapping("/map")
	public Map<String, Object> map(){
		HashMap<String,Object> map = new HashMap<>();
		map.put("secret", secret);	
		map.put("number", number);
		map.put("date", new Date());
		return map;
	}
}
