package com.example.demo.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class AOPAdviceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AOPAdviceExampleApplication.class, args);  
	}
}
