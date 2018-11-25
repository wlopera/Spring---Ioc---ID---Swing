package com.swing.spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({ "com.swing.spring" })
@PropertySource("classpath:value.properties")
public class SpringConfiguration {
	
//	@Bean
//	public ServiceRemote serviceRemoteBean() {
//		System.out.println("serviceRemoteBean ..!");
//		return new ServiceRemote();
//	}

}