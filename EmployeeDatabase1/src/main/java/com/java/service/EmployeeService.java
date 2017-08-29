package com.java.service;

import java.util.List;

import com.java.model.Employee;

public interface EmployeeService {
	public void add(Employee employee);
	public void edit(Employee employee);
	public void delete(int employeeID);
	public Employee getEmployee(int employeeID);
	public List getAllEmployee();


}
