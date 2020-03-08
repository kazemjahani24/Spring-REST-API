package com.luv2code.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 < the two classes are explained in spring security make sure t go and study them>
public abstract class AbstractAnnotationConfigDispatcherServletInitializer
extends AbstractDispatcherServletInitializer
WebApplicationInitializer to register a DispatcherServlet and use Java-based Spring configuration.
Implementations are required to implement:
getRootConfigClasses() -- for "root" application context (non-web infrastructure) configuration.
getServletConfigClasses() -- for DispatcherServlet application context (Spring MVC infrastructure) configuration.
  
 */
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { DemoAppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}






