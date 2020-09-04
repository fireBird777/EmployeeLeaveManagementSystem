package com.employee_leave_mgmt.service;

import java.util.List;

import com.employee_leave_mgmt.entity.Leave;
import com.employee_leave_mgmt.entity.LeaveType;

public interface LeaveService {

		public void saveLeave( Leave theLeave);
		public Leave getLatestLeaveInfo(int employeeId);
}
