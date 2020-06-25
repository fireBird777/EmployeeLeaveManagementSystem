package com.employee_leave_mgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employee")
@Controller
public class LeaveController {

	@GetMapping("/applyPage")
	public String applyLeave(Model theModel)
	{
		return "apply-leave-page";
	}
}
