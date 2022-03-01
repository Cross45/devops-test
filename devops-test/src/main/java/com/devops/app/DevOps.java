package com.devops.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOps {
	
	@GetMapping("/Hello")
	public String sayHello() {
		System.out.println("---------Hello");
		return "Hello welcome to spring boot world!!!!";
		}
}
