package com.example.demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/map")
	public Map<String, Object> map(){
		HashMap<String,Object> map = new HashMap<>();
		map.put("date", new Date());
		return map;
	}
}
