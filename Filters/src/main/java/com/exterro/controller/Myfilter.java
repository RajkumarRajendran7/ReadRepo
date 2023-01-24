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
//@Order(1)
public class Myfilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("My Filter 1!!!!");
		
		//chain.doFilter(request, null);
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getRemoteHost());
		
		chain.doFilter(request, response);
	}
	
	
	@Bean
    public FilterRegistrationBean<Myfilter> filter()
    {
        FilterRegistrationBean<Myfilter> bean = new FilterRegistrationBean<>();
 
        bean.setFilter(new Myfilter());
        bean.addUrlPatterns("/welcome");  // or, use `setUrlPatterns()`
 
        return bean;
    }

}
