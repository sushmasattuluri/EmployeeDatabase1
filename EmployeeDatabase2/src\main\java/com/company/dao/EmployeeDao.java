package com.company.dao;

import java.util.List;

import com.company.model.Employee;

public interface EmployeeDao {
	public void add(Employee employee);
	public void edit(Employee employee);
	public void delete(int employeeID);
	public Employee getEmployee(int employeeID);
	public List getAllStudent();

}
