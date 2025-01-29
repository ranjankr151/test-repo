package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/getDetails")
	public String getDetails() {
		return "welcome to demo spring boot simple Application";
	}
}
