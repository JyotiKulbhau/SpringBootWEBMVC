package com.example.demo.aop;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public Employee createEmployee(String empId,String empFirstName, String empLastName) {
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setFirstName(empFirstName);
		emp.setLastName(empLastName);
		return emp;
		
	}
	public void deleteEmployee(String empId)   
	{  
	}  
}
