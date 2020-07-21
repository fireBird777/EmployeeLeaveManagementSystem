package com.employee_leave_mgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee_leave_mgmt.dao.LeaveTypeDao;
import com.employee_leave_mgmt.entity.LeaveType;

@Service
public class LeaveTypeServiceImpl implements LeaveTypeService {

	@Autowired
	private LeaveTypeDao leaveTypeDao;
	
	@Transactional
	@Override
	public List<LeaveType> getLeaveTypes() {
		
		return leaveTypeDao.getLeaveTypes();
	}

}
