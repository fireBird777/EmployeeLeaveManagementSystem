package com.employee_leave_mgmt.dao;

import java.util.List;

import com.employee_leave_mgmt.entity.Leave;

public interface LeaveDao {

	public List<String> getLeaveTypeName();
	public void saveLeave(Leave theLeave);
}
