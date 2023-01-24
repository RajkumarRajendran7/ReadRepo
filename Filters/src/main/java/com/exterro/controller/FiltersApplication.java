package com.exterro.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class FiltersApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiltersApplication.class, args);	
	}

}
