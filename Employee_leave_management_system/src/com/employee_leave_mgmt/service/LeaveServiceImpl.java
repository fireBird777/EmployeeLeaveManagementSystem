package com.employee_leave_mgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee_leave_mgmt.dao.LeaveDao;
import com.employee_leave_mgmt.entity.Leave;

@Service
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	private LeaveDao leaveDao;
	
	@Transactional
	@Override
	public List<String> getLeaveTypeName() {

		return leaveDao.getLeaveTypeName();
	}
	
	
	@Transactional
	@Override
	public void saveLeave(Leave theLeave)
	{
		leaveDao.saveLeave(theLeave);
	}

}
