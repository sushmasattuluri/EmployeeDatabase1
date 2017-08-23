package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.validator.*;
import org.hibernate.validator.util.annotationfactory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dao.EmployeeDao;
import com.company.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory session;
	@Override
	public void add(Employee employee) {
		session.getCurrentSession().save(employee);

	}

	@Override
	public void edit(Employee employee) {
session.getCurrentSession().update(employee);
	}

	@Override
	public void delete(int employeeID) {
		session.getCurrentSession().delete(getEmployee(employeeID));


	}

	@Override
	public Employee getEmployee(int employeeID) {
return (Employee)session.getCurrentSession().get(Employee.class, employeeID);	
		
		
	}

	@Override
	public List getAllEmployee() {
		return session.getCurrentsession().createQuery("from Employee").list();
	}

}
