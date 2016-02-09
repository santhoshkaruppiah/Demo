package com.ping.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingService {
	
	@RequestMapping("/hitme")
	public Map<String, Object> hiWithName(@RequestParam String name) {
		Map<String, Object> result = new HashMap<>();
		result.put("id", UUID.randomUUID().toString());
		result.put("content", "Hello, "+name.toUpperCase()+" !");
		return result;
	}
	
}
