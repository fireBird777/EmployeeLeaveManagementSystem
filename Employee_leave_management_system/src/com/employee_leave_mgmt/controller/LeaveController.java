package com.employee_leave_mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee_leave_mgmt.entity.Leave;
import com.employee_leave_mgmt.operations.RemainingLeaveDaysOperations;
import com.employee_leave_mgmt.operations.RemainingLeaveDaysOperationsImpl;
import com.employee_leave_mgmt.service.EmployeeService;
import com.employee_leave_mgmt.service.LeaveService;
import com.employee_leave_mgmt.service.LeaveTypeService;
import com.employee_leave_mgmt.service.RemainingLeaveDaysService;
import com.sun.xml.bind.v2.TODO;

@RequestMapping("/employee")
@Controller
public class LeaveController {

	@Autowired
	private LeaveService leaveService;
	

	@Autowired
	private LeaveTypeService leaveTypeService;
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/applyPage")
	public String applyLeave(Model theModel)
	{
		
		theModel.addAttribute("leaveTypes",leaveTypeService.getLeaveTypes());
		
		Leave leave = new Leave();
		theModel.addAttribute("Leave",leave);
		
		theModel.addAttribute("employeeId",employeeService.getEmployeeId());
		
		return "apply-leave-page";
	}
	
	
	@PostMapping("/saveLeaveInfo")
	public String saveLeaveInfo(@ModelAttribute("leave")Leave theLeave)
	{
		
		leaveService.saveLeave(theLeave);
		return "successful";
		
		
	}
	
	
	
	@GetMapping("/leaveInfo")
	public String getCurrentLeaveRecord(Model theModel) {
		
		int employeeId = employeeService.getEmployeeId();
		Leave leaveInfo = leaveService.getLatestLeaveInfo(employeeId);
		theModel.addAttribute("leaveInfo",leaveInfo);
		return "leave-info-page";
		//TODO add leave type info : remaining eave days and applied leave type name
	}
	
	
	
	
	@GetMapping("/updatePage")
	public String updateCurrentLeave(Model theModel)
	{
		int employeeId = employeeService.getEmployeeId();
		Leave leaveInfo = leaveService.getLatestLeaveInfo(employeeId);
		theModel.addAttribute("Leave",leaveInfo);
		return"apply-leave-page";
		//TODO diplay the applied leave Type name as first option in leaveType list and display
		//the application timestamp of applied leave
	}
	
	
	
	public String deleteLeaveRecord() {
		//TODO delete leave from db and return result
		return"";
	}
	
}
