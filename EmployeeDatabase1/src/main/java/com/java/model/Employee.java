package com.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int EmployeeID;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private int year_joined;
	
	public Employee(int employeeID, String firstname, String lastname, int year_joined) {
		super();
		this.EmployeeID = employeeID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.year_joined = year_joined;
		
	}
	
	public Employee() {
		
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getYear_joined() {
		return year_joined;
	}
	public void setYear_joined(int year_joined) {
		this.year_joined = year_joined;
	}

	
}
