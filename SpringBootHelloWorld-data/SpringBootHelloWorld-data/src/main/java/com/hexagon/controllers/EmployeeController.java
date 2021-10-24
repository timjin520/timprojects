package com.hexagon.controllers;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hexagon.data.EmployeeRepository;
import com.hexagon.model.Employee;
import com.hexagon.model.RegisterCmd;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeData;

	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.POST)
	public String newEmployee(Employee employee) {
		
		
		// run Junit test
		/*
		 * Result result = JUnitCore.runClasses(EmployeeController.class);
		 * testDateformat(employee.getDate()); for (Failure failure :
		 * result.getFailures()) { System.out.println("failure is: " +
		 * failure.toString()); }
		 * 
		 * System.out.println("All numbers are working: " + result.wasSuccessful());
		 */
		
		
		//save the values from the form into the EmployeeRepository
		employeeData.save(employee);
		return ("redirect:/listEmployees.html");
	}

	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.GET)
	public ModelAndView addNewEmployee() {

		Employee emp = new Employee();
		return new ModelAndView("newEmployee", "form", emp);

	}

	@RequestMapping(value = "/listEmployees.html", method = RequestMethod.GET)
	public ModelAndView employees(ModelMap modelMap) {
		
		//add multiple modelAndView objects. one for displaying the results of Employees, and other for deleting a record in form.
		  ModelAndView modelAndView = new ModelAndView(); 
		  RegisterCmd registerCmd = new RegisterCmd();
		  List<Employee> allEmployees = employeeData.findAll();
		  registerCmd.setAllEmployees(allEmployees); 
		  Employee emp = new Employee();
		  registerCmd.setEmployee(emp);
		  
		  modelMap.addAttribute("registerCmd", registerCmd);
		  modelAndView.addAllObjects(modelMap);
		  modelAndView.setViewName("allEmployees");
		
		return modelAndView;

	}
	
	
	@RequestMapping(value = "/listEmployees.html", method = RequestMethod.POST)
	public String submitform(RegisterCmd reg){
		Employee emp = new Employee();
		emp = reg.getEmployee();
		
		// delete a record by using an ID from Emlpoyee.java
		employeeData.deleteById(emp.getId());
		
		
		return ("redirect:/listEmployees.html");
	}
}
