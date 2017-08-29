package com.java.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.model.Employee;
import com.java.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		Employee employee= new Employee();
		map.put("employee", employee);
		map.put("employeeList", employeeService.getAllEmployee());
		return "employee";
		
	}
	
	@RequestMapping(value="/employeeactions", method= RequestMethod.POST)
	public String doActions(@ModelAttribute Employee employee,BindingResult result, @RequestParam String action, Map<String, Object> map) {
		
		Employee employeeresult = new Employee();
		
	int list=0;
	if(action.equals("Add") == true){
		list=1;
	}
	if(action.equals("Edit") == true){
		list=2;
	}
	if(action.equals("Delete") == true){
		list=3;
	}
	if(action.equals("Search") == true){
		list=4;
	}
		switch(list) {
		
		case 1:
			employeeService.add(employee);
			employeeresult = employee;
			break;
			
		case 2:
			employeeService.edit(employee);
			employeeresult = employee;
			break;
			
		case 3:
			employeeService.delete(employee.getEmployeeID());
			employeeresult = new Employee();
			break;
			
		case 4:
			Employee searchedEmployee = employeeService.getEmployee(employee.getEmployeeID());
			
			break;
			
		
		}
		
		map.put("employee",employeeresult);
		map.put("employeeList", employeeService.getAllEmployee());
		
		return "employee";
	}



}
