package com.employee_leave_mgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee_leave_mgmt.entity.Leave;
import com.employee_leave_mgmt.entity.LeaveType;
import com.employee_leave_mgmt.service.LeaveService;

@RequestMapping("/employee")
@Controller
public class LeaveController {

	@Autowired
	private LeaveService leaveService;
	@GetMapping("/applyPage")
	public String applyLeave(Model theModel)
	{
		//List<String> LeaveTypeNames = leaveService.getLeaveTypeName();
		//theModel.addAttribute("LeaveTypeNames",LeaveTypeNames);
		
		
		List<LeaveType> leaveTypes = leaveService.getLeaveTypes();
		theModel.addAttribute("leaveTypes",leaveTypes);
		
		Leave leave = new Leave();
		theModel.addAttribute("Leave",leave);
		return "apply-leave-page";
	}
	
	@PostMapping("/saveLeaveInfo")
	public void saveLeaveInfo(@ModelAttribute("leave")Leave theLeave)
	{
		
		leaveService.saveLeave(theLeave);
	}
}
