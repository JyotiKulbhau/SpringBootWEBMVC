package com.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.service.ProductNotFoundException;
import com.jwt.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUser() {
		String user = "Geet";
		System.out.println("Getting Users");
		return userService.getUsers();
	}

	@PutMapping("/products/{id}")
	public ResponseEntity<Object> updateProduct() {
		throw new ProductNotFoundException();
	}

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

}
