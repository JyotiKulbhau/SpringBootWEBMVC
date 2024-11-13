package com.jwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jwt.service.ProductNotFoundException;

@ControllerAdvice
public class ProductExceptionController {

	@ExceptionHandler(value= ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException ex){
		return new ResponseEntity<> ("Product Not Found",HttpStatus.NOT_FOUND) ;
		
	}
}
