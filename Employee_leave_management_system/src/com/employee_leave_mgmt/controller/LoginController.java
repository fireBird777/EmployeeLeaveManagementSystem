package com.employee_leave_mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee_leave_mgmt.entity.Employee;
import com.employee_leave_mgmt.service.LoginService;

@Controller
@RequestMapping("/employee")
public class LoginController {

	@Autowired
	private LoginService loginService;
	@GetMapping("/loginPage")
	public String showLoginPage(Model theModel)
	{
		Employee theEmployee = new Employee();
				theModel.addAttribute(theEmployee);
		return "login-page";
	}
	
	@GetMapping("/processLoginForm")
	
	public String processLoginForm(@ModelAttribute("employee")Employee theEmployee,Model theModel)
	{
		boolean result = loginService.isUser(theEmployee);
		String message = "your result :"+result;
		theModel.addAttribute("message",message);
		return "action-page";
	}
	
}
