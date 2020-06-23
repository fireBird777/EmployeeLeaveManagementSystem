package com.employee_leave_mgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee_leave_mgmt.entity.Employee;

@Controller
@RequestMapping("/employee")
public class LoginController {

	@GetMapping("/loginPage")
	public String showLoginPage(Model theModel)
	{
		Employee theEmployee = new Employee();
		theModel.addAttribute("employee",theEmployee);
		return "login-page";
	}
	
}
