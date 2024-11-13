package com.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringDemo1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringDemo1Application.class, args);
		
		//TestCron cron=context.getBean(TestCron.class);
		//cron.testSchedular();
	}

}
