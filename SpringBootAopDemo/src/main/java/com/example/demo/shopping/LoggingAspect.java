package com.example.demo.shopping;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	/*
	 * @Before("execution(void com.example.demo.shopping.ShoppingCart.checkout())")
	 * public void beforeLogger() { System.out.println("Before Loggers"); }
	 */

	@Before("execution(* com.example.demo.shopping.ShoppingCart.checkout())")
	public void beforeLogger(JoinPoint jp) {
		System.out.println("Before Loggers");
		System.out.println("JoinPoint Signature ::: "+jp.getSignature());
	}

	@After("execution(void com.example.demo.shopping.ShoppingCart.checkout())")
	public void afterLogger() {
		System.out.println("After Loggers");
	}

	/*
	 * @Around("execution(void com.example.demo.shopping.ShoppingCart.checkout())")
	 * public void AroundLoggers() {
	 * System.out.println("Loggers Around the method"); }
	 */

}
