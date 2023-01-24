package com.exterro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.annotation.WebFilter;

//@WebFilter("home")
@RestController
//@Path("/home")
public class HomeController {
	
	
	@RequestMapping("/welcome")
	public void Hello() {
		System.out.println("Welcome!!!!!!!!!!!!!!Home!!!!");
		
	}

	
	
	@RequestMapping("/")
	public void Home() {
		System.out.println("Home Controller Welcome!!!!!!!!!!!!!!Home!!!!");
		
	}
}
