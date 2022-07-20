package com.arun.spring_boot_jdbc.ServiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.sql.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.arun.spring_boot_jdbc.Exception.EmployeeNotFoundException;
import com.arun.spring_boot_jdbc.Service.JdbcServices;
import com.arun.spring_boot_jdbc.model.Employee;



@RunWith(SpringRunner.class)
@SpringBootTest
class ServiceTestClass {

	
	

	@MockBean
		private JdbcServices service;
	@Autowired
	Employee employee;
		
		Date date;
		
		@Test
		public void getUsersTest() {
			when(service.viewdata()).thenReturn(Stream.of(new Employee(51,"Amili","developer",30000,date,"ramesh",25), 
					new Employee(51,"Amili","developer",30000,date,"ramesh",25)).collect(Collectors.toList()));
			assertEquals(2, service.viewdata().size());
		}
		
		@Test
		public void getByIdTest() throws EmployeeNotFoundException {
			int id = 51;
			employee = new Employee(51,"Amili","developer",30000,date,"ramesh",25);
			when(service.getbyId(id)).thenReturn(employee);
			assertEquals(employee, service.getbyId(id));
		}
		
		@Test
		public void addUserTest() {
			employee= new Employee(51,"Amili","developer",30000,date,"ramesh",25);
			when(service.insertemployee(employee)).thenReturn(1);
			assertEquals(1, service.insertemployee(employee));
		}
		
		@Test
		public void deleteByIdTest() throws EmployeeNotFoundException {
			int id = 51;
			service.deletebyId(id);
			verify(service, times(1)).deletebyId(id);
		}
		
		@Test
		public void updateTest() {
			int id = 51;
			employee = new Employee(51,"Amili","developer",30000,date,"ramesh",25);
			when(service.update(employee)).thenReturn(1);
			assertEquals(1, service.update( employee));
		}
		
	}



