package com.arun.spring_boot_jdbc.Service;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.arun.spring_boot_jdbc.model.*;
@Component
public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmp_Id(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setDesignation(rs.getString(3));
		emp.setSalary(rs.getInt(4));
		emp.setDob(rs.getDate(5));
		emp.setManger_name(rs.getString(6));
		emp.setManager_id(rs.getInt(7));
		return emp;
	}

}