package com.arun.spring_boot_jdbc.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeNotFoundException extends Exception{
	
private static final long serialVersionUID = 1L;
	
Logger logger = LoggerFactory.getLogger(EmployeeNotFoundException.class);

/**
 * Implementation of custom exception UserNotFoundException
 * @param msg
 */
	
	public EmployeeNotFoundException(String msg) {
		super(msg);
		
		logger.error("UserNotFoundException occured..");
	}
}
