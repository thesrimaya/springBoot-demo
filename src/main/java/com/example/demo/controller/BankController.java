package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/Axis")
public class BankController {
	@GetMapping("/welcome")
	public String welcome() {
	    return "welcome To Axis Bank";
	}
	@GetMapping("/help")
	public String help() {
		return "please contact 9808089";
	
	}

}
