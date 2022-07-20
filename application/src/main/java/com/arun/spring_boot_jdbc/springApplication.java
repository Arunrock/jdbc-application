package com.arun.spring_boot_jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication()
public class springApplication {
	public static void main(String[] args) throws Exception   
	{  
	SpringApplication.run(springApplication.class, args);
	}  
}
