package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeServiceAspect {
	@Before(value = "execution(* com.example.demo.aop.EmployeeService.java.*(..)) and args(empId, fname, lname)")  
	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String lname) {  
	System.out.println("Before method:" + joinPoint.getSignature());  
	System.out.println("Creating Employee with first name - " + fname + ", second name - " + lname + " and id - " + empId);  
	}  
}
