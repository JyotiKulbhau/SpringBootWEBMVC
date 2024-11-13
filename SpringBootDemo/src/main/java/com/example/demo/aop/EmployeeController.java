package com.example.demo.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class EmployeeController {

	@Autowired  
	private EmployeeService employeeService;  
	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)  
	public Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)   
	{  
	return employeeService.createEmployee(empId, firstName, lastName);  
	}  
}
