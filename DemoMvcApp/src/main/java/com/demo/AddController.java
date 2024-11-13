package com.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

	/*
	 * @RequestMapping("/") public String add(HttpServletRequest
	 * request,HttpServletResponse response) { System.out.println("ADDITION"); int
	 * one=Integer.parseInt(request.getParameter("t1")); int
	 * two=Integer.parseInt(request.getParameter("t2"));
	 * 
	 * int add=one+two;
	 * 
	 * return "result.jsp"; }
	 */
	
	@RequestMapping("/")  
    public String display()  
    {  
		System.out.println("HELLO ");
        return "index";  
    }     
}
