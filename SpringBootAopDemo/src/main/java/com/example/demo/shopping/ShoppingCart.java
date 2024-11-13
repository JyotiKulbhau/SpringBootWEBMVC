package com.example.demo.shopping;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	public void checkout() {
		//logging
		
		System.out.println("Checkout method for ShoppingCart is called");
	}
	
	public void showTime() {
		System.out.println("ShowTime method of ShoppingCart is called");
	}
}
