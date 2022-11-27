package com.team.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.team.entity.Customer;
import com.team.service.CustomerService;

@Controller
@SessionAttributes({"user"})
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public ModelAndView getRegisterPage() {
		return new ModelAndView("Register","command",new Customer());
	}
	
	@RequestMapping("/registerCustomer")
	public ModelAndView registerCheck(@ModelAttribute("command") Customer customer) {
		ModelAndView modelAndView=new ModelAndView("Register","command",new Customer());
		boolean success = customerService.registerCustomer(customer);
		
		if(success) {
			modelAndView.addObject("message", "Registration successful!");
		}
		else {
			modelAndView.addObject("message", "Registration not successful. The email address '" +customer.getEmail_address()+ "' is already registered.");
		}
		return modelAndView;
	}
}
