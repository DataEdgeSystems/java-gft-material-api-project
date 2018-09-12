package com.accenture.lkm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MaterialController {
	
	@RequestMapping(value="/")
	public String home(){
		return "Welcome to the Material Service API!";
	}
	
}
