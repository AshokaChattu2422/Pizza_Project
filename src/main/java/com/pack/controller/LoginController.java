package com.pack.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 

import com.pack.model.Login;

@Controller
public class LoginController {
	
	@Autowired
	//private UserService userService;
 
	
	@RequestMapping("toAdd")
	public String add(Model m)
	{
		
		m.addAttribute("userBean", new Login());
		return "login";
	}
	
	
	@RequestMapping(value="/doAdd", method = RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute("userBean")Login userBean,BindingResult result,Model m)
	{
		 if (result.hasErrors())
			 {
	
			  return "login";
			 }
	 else
	 {
		m.addAttribute("user", userBean);
  		//userService.addUser(userBean); 
  		System.out.println("u  "+userBean);
  		  
	  return "welcome";
	 }
	}
		
	}