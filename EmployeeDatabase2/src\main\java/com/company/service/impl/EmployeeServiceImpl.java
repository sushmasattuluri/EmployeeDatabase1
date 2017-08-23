package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.EmployeeDao;
import com.company.model.Employee;
import com.company.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public void add(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void edit(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void delete(int employeeID) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public Employee getEmployee(int employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
