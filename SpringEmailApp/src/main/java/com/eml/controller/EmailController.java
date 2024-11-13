package com.eml.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eml.service.EmailService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@GetMapping("/sendEmail")
	public String sendEmail() throws AddressException, MessagingException, IOException {
		emailService.sendMail();
		return "Email sent Succssfully...";

	}
	
	
}
