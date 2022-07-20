package com.arun.spring_boot_jdbc.Service;
import com.arun.spring_boot_jdbc.Exception.EmployeeNotFoundException;
import com.arun.spring_boot_jdbc.model.Employee;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcServices implements services {
     @Autowired
	private JdbcTemplate  jdbc;
     @Autowired
     private EmployeeRowMapper rowmapper;
     int result;

 	/**
 	 * Add user into database
 	 * @param employee
 	 * @return result
 	 */
	public int insertemployee(Employee employee)
	{
		String sql="INSERT into Employee values(?,?,?,?,?,?,?) ";
		 result=jdbc.update(sql, employee.getEmp_Id(),employee.getName(),employee.getDesignation(),employee.getSalary(),employee.getDob(),employee.getManger_name(),employee.getManager_id());
	return result;
	}
	/**
	 * Implementation of Delete user by id service
	 * Delete user from database by id
	 * @param id
	 * @return result
	 */
	public int deletebyId(int id)throws EmployeeNotFoundException
	{
		String sql="DELETE FROM Employee where Emp_Id=? ";
		 result=jdbc.update(sql, id);
		 if (result!=0)
				return result;
				throw new EmployeeNotFoundException("Employeenot found");
	}
	/**
	 * Implementation of Update user by id service
	 * Update user into database
	 *@param employee
	 * @return result
	 */
	public int update(Employee employee)
	{
		String sql="UPDATE Employee set salary=?,designation=? where Emp_Id=? ";
		 result=jdbc.update(sql, employee.getSalary(),employee.getDesignation(),employee.getEmp_Id());
	return result;
	}
	/**
	 * Implementation of Get user by id service
	 * Get user from the database by id
	 * @param id
	 * @return employee
	 */
	public Employee getbyId(int id) throws EmployeeNotFoundException
	{
		String sql="select * from Employee where Emp_Id=? ";
		
		Employee employee=jdbc.queryForObject(sql,rowmapper ,id);
		if (employee!=null)
		return employee;
		throw new EmployeeNotFoundException("Employeenot found");
	}
	/**
	 * Implementation of Get all users service
	 * Get all users from database
	 * @return list of users
	 */
	public List<Employee> viewdata()
	{
		String sql="select * from employee";
		List<Employee> emp=jdbc.query(sql,rowmapper);
		
		return emp;
	}
}
