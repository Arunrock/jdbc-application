package com.arun.spring_boot_jdbc.model;

import java.sql.Date;

public class Employee {
	private int Emp_Id;
	private String Name;
	private String Designation;
	public Employee(int emp_Id, String name, String designation, int salary, Date dob, String manger_name,
			int manager_id) {
		super();
		Emp_Id = emp_Id;
		Name = name;
		Designation = designation;
		this.salary = salary;
		this.dob = dob;
		Manger_name = manger_name;
		this.manager_id = manager_id;
	}



	private int salary;
	private Date dob;
	private String Manger_name;
	private int manager_id;

	public Employee()
	{
		
	}
	public int getEmp_Id() {
		return Emp_Id;
	}

	public void setEmp_Id(int Emp_Id) {
		this.Emp_Id = Emp_Id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getManger_name() {
		return Manger_name;
	}

	public void setManger_name(String manger_name) {
		Manger_name = manger_name;
	}



	@Override
	public String toString() {
		return "EmployeeDetails [Emp_Id=" + Emp_Id + ", salary=" + salary + ", manager_id=" + manager_id + ", dob="
				+ dob + ", Name=" + Name + ", Designation=" + Designation + ", Manger_name=" + Manger_name + "]";
	}

}
