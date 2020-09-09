package com.employee_leave_mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee_leave_mgmt.dao.RemainingLeaveDaysDao;
import com.employee_leave_mgmt.entity.RemainingLeaveDays;

@Service
public class RemainingLeaveDaysServiceImpl implements RemainingLeaveDaysService{
	@Autowired
	private RemainingLeaveDaysDao remainingLeaveDaysDao;
	
	@Transactional
	@Override
	public long getRemainingLeaveDays(int LeaveTypeId) {
		
			return remainingLeaveDaysDao.getRemainingLeaveDays(LeaveTypeId);
	}
	
	//check is remaining leave days are saved or not
	@Transactional
	@Override
	public void setRemainingLeaveDays(RemainingLeaveDays remainingLeaveDays )
	{
		remainingLeaveDaysDao.saveRmainingLeaveDays(remainingLeaveDays);
	}

}
