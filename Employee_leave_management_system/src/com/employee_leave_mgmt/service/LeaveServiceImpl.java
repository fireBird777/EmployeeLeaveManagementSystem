package com.employee_leave_mgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee_leave_mgmt.dao.LeaveDao;
import com.employee_leave_mgmt.entity.Leave;
import com.employee_leave_mgmt.entity.LeaveType;

@Service
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	private LeaveDao leaveDao;
	
	@Transactional
	@Override
	public List<LeaveType> getLeaveTypes() {

		return leaveDao.getLeaveTypes();
	}
	
	
	@Transactional
	@Override
	public void saveLeave(Leave theLeave)
	{
		leaveDao.saveLeave(theLeave);
	}

}
