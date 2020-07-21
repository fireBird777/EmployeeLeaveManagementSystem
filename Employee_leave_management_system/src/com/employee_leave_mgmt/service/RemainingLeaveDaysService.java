package com.employee_leave_mgmt.service;

import com.employee_leave_mgmt.entity.RemainingLeaveDays;

public interface RemainingLeaveDaysService {

	public long getRemainingLeaveDays(int LeaveTypeId);
	public void setRemainingLeaveDays(RemainingLeaveDays remainingLeaveDays );
	
}
