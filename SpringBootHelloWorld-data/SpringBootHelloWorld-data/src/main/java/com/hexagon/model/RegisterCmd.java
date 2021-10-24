package com.hexagon.model;

import java.util.List;

public class RegisterCmd {
	
	private Employee employee;
	
	public List<Employee> allEmployees;

	public List<Employee> getAllEmployees() {
		return allEmployees;
	}

	public void setAllEmployees(List<Employee> allEmployees) {
		this.allEmployees = allEmployees;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
