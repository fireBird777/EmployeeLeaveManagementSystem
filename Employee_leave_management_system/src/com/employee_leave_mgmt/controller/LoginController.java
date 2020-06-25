package com.employee_leave_mgmt.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee_leave_mgmt.entity.Employee;
import com.employee_leave_mgmt.entity.Role;
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
		if(!result)
		{
			String message = "login failed";
			theModel.addAttribute("message",message);
		}
		else
		{
			List<Role> roles = loginService.getEmployeeRoles();
			Iterator itr = roles.iterator();
			theModel.addAttribute("roles",roles);
			//change this:
			if(itr.hasNext())
			{
				for(Role role: roles)
				{
					if(role.getRoleName().equals("supervisor"))
						return "supervisor-page";
					else if(role.getRoleName().equals("hr"))
						return "hr-page";
						
				}
			}
			else
			{
					return "employee-page";
			}
			
		}
		
		return "action-page";
	}
	
}
