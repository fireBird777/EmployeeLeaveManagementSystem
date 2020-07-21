package com.employee_leave_mgmt.dao;

import com.employee_leave_mgmt.entity.RemainingLeaveDays;

public interface RemainingLeaveDaysDao {

	public long getRemainingLeaveDays(int LeaveTypeId);
	public void saveRmainingLeaveDays(RemainingLeaveDays remainingLeaveDays );
}
