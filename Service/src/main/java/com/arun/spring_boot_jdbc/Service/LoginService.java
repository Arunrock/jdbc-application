package com.arun.spring_boot_jdbc.Service;

import org.springframework.stereotype.Component;


@Component
public class LoginService {
public boolean validUser(String userid,String password)

{
	if(userid.equalsIgnoreCase("arun")&&password.equalsIgnoreCase("dummy"))
	return true;
	return false;
	
	}
}

