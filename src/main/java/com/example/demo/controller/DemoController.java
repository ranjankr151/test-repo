package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/getDetails")
	public String getDetails() {
		return "welcome to spring boot simple Application";
	}
	
	@RequestMapping("/getTest")
	public getTest() {
		return "welcome to simple Application";
	}
}
