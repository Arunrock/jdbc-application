package com.arun.spring_boot_jdbc.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arun.spring_boot_jdbc.Service.LoginService;

@Controller
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	LoginService service;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	 
	public String loginMessage(ModelMap model) {
		
		return "Login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	 
	public String welcomeMessage(@RequestParam String name,@RequestParam String password,ModelMap model) {
		if(service.validUser(name, password))
		{
		model.put("message", "validcredentials");
		model.put("name", name);
		model.put("password", password);
		return "welcome";
		}
		else
		{
			model.put("errormessage", "Invalidcredentials");
			return "Login";
		}
	}
}