package com.demo1;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component	
public class TestCron {

	@Scheduled(cron= "*/10 * * * * *")
	public void testSchedular() {
		System.out.println("test cron : "+new Date());
	}
}
	