package com.exterro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.annotation.WebFilter;

//@WebFilter("/company")
@RestController
public class CompanyController {
	
	@RequestMapping("/company")
	public void Hello() {
		System.out.println("Welcome !!!!!!!!!!!!!!");
		
	}

}
