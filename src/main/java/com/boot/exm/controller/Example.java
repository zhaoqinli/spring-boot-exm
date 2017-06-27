package com.boot.exm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	@RequestMapping("/")
	public String home() {
		return "Hello World!!";
	}
	
}
