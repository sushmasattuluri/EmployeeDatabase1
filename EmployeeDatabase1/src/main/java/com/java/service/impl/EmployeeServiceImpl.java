package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.EmployeeDao;
import com.java.model.Employee;
import com.java.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public void add(Employee employee) {
		employeeDao.add(employee);
	}

	@Transactional
	public void edit(Employee employee) {
		employeeDao.edit(employee);

	}

	@Transactional
	public void delete(int employeeID) {
		employeeDao.delete(employeeID);

	}

	@Transactional
	public Employee getEmployee(int employeeID) {
		return employeeDao.getEmployee(employeeID);
	}

	@Transactional
	public List getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

}
