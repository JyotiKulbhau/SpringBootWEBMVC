package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.model.User;
import com.demo.service.UserService;

@Controller
@RequestMapping("/viewc")
public class ControllerView {
	@Lazy
	@Autowired
	UserService userservice;

    private static final Logger logger = LoggerFactory.getLogger(ControllerView.class);

    @RequestMapping("/")
    public String view() {
        logger.info("Entering ControllerView - Home Page");        
        return "home";
    }
    
    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user,RedirectAttributes redirectAttributes) {
        logger.info("addUser - User: " + user.getUserName());
        userservice.addUserbyView(user);
        redirectAttributes.addFlashAttribute("message", "User added successfully!");
       return "redirect:/viewc/";
    }
}

