package com.jatin.AppService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/")
	public String hello() {
		return "hello this is azure app services";
	}
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "hello this is java azure app services";
	}
}
