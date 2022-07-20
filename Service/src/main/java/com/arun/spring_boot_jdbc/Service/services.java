package com.arun.spring_boot_jdbc.Service;

import java.util.List;

import com.arun.spring_boot_jdbc.Exception.EmployeeNotFoundException;
import com.arun.spring_boot_jdbc.model.Employee;

public interface services {
 int insertemployee(Employee employee);
 int deletebyId(int id) throws EmployeeNotFoundException;
 int  update(Employee employee);
 Employee getbyId(int id) throws EmployeeNotFoundException;
 List<Employee> viewdata();
}
