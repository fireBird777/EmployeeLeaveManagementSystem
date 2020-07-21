package com.employee_leave_mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee_leave_mgmt.dao.LeaveDao;
import com.employee_leave_mgmt.entity.Leave;
import com.employee_leave_mgmt.entity.RemainingLeaveDays;
import com.employee_leave_mgmt.operations.RemainingLeaveDaysOperations;

@Service
public class LeaveServiceImpl implements LeaveService {

	
	
	@Autowired
	private LeaveDao leaveDao;
	

	@Autowired
	private RemainingLeaveDaysService  remainingLeaveDaysService ;
	
	@Autowired
	private RemainingLeaveDaysOperations remainingLeaveDaysOperations ;
	
	
	//check if startDate is greater than endate, 
	//purpose: cannot apply another leave in between applied leave duration
	@Transactional
	@Override
	public void saveLeave(Leave theLeave)
	{
		long leaveDays = remainingLeaveDaysOperations.calculateLeaveDays(theLeave.getStartDate(), theLeave.getEndDate());
		long remainingLeaveDays = remainingLeaveDaysService.getRemainingLeaveDays(theLeave.getLeaveType().getLeaveTypeId());
		
		if(leaveDays<= remainingLeaveDays)
		{
			long currentRemainingLeaveDays = remainingLeaveDays-leaveDays;
			RemainingLeaveDays remainingLeaveDaysEntity = new RemainingLeaveDays() ;
			remainingLeaveDaysEntity.setDate( theLeave.getStartDate());
			remainingLeaveDaysEntity.setLeaveType( theLeave.getLeaveType());
			remainingLeaveDaysEntity.setRemainingDays((int)currentRemainingLeaveDays);
			remainingLeaveDaysService.setRemainingLeaveDays(remainingLeaveDaysEntity);
			
			
			remainingLeaveDaysService.setRemainingLeaveDays(remainingLeaveDaysEntity);
			
			//check if leave is saved,DO NOT USE NESTED IF
			//purpose: proper logic
			leaveDao.saveLeave(theLeave);
		}
		
	}

}
