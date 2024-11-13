package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCRUDApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringCRUDApplication.class, args);
		
		StreamApiDemo sad=context.getBean(StreamApiDemo.class);
		sad.testSchedule();
	}

}
