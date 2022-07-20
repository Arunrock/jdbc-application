package com.arun.spring_boot_jdbc.Controller;

import java.sql.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arun.spring_boot_jdbc.Exception.EmployeeNotFoundException;
import com.arun.spring_boot_jdbc.Service.services;
import com.arun.spring_boot_jdbc.model.Employee;

@Controller
public class UserController {
	Logger logger = LoggerFactory.getLogger(UserController.class);
@Autowired
private services service;
int result;
Date date = null;
@GetMapping("/addemployee")
public String showinsertedemployee(ModelMap model)
{
	
	model.addAttribute("employee", new Employee(0,"","",0, date,"",0));
	return "employeedetail";
}
@PostMapping("/addemployee")
public String insert(Employee employee,ModelMap model)
{
	result=service.insertemployee(employee);
	if(result!=0)
	return "redirect:/employee-list";
	model.addAttribute("employee", new Employee(0,"","",0, date,"",0));
	return "employeedetail";
}
@DeleteMapping("/delete-employee")
public String deletebyId(ModelMap model,@RequestParam int id)
{
	try {
		result=service.deletebyId(id);
	} catch (EmployeeNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "redirect:/employee-list";
}
@GetMapping("/update-employee")
public String showUpdate(ModelMap model,@RequestParam int id) throws EmployeeNotFoundException
{
	Employee employee=service.getbyId(id);
	model.addAttribute("employee",employee);
	return "employeedetail";
}
@PutMapping("/update-employee")
public String Updatedemployee(ModelMap model,Employee employee)
{
	result=service.update(employee);
	return "redirect:/employee-list";
}
@GetMapping("/employee")
public String GetbyId(ModelMap model,@RequestParam int id) throws EmployeeNotFoundException
{
	Employee emp=service.getbyId(id);
	model.put("employee", emp);
	return "employeedetail";
}
@GetMapping("/employee-list")
//@ResponseBody
public String viewdata(ModelMap model)
{
	List<Employee> emp=service.viewdata();
	model.put("employees",emp);
	return "employee-list";
	//return emp;
}

}
