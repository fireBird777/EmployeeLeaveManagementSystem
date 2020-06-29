package com.employee_leave_mgmt.service;

import java.util.List;

import com.employee_leave_mgmt.entity.Leave;

public interface LeaveService {

	public List<String> getLeaveTypeName();
	public void saveLeave( Leave theLeave);
}
