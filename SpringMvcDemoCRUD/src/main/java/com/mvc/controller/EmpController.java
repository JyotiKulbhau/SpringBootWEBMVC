package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.dao.EmpDao;
import com.mvc.model.Employee;

@Controller
public class EmpController {

	@Autowired
	EmpDao dao;
	
	@RequestMapping("/empform")
	public String showForm(Model m) {
		m.addAttribute("command", new Employee());
		return "empform";
	}
	
	
}
