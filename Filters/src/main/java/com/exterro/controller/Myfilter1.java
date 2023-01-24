package com.exterro.controller;

import java.io.IOException;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
@Component
//@Order(2)
public class Myfilter1 implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("MyFilter 2!!!!");
		
		//chain.doFilter(request, response);
		// TODO Auto-generated method stub
		
	}

	
	@Bean
    public FilterRegistrationBean<Myfilter1> filters()
    {
        FilterRegistrationBean<Myfilter1> bean = new FilterRegistrationBean<>();
 
        bean.setFilter(new Myfilter1());
        bean.addUrlPatterns("/company");  // or, use `setUrlPatterns()`
 
        return bean;
    }
	
}
