package com.employee_leave_mgmt.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee_leave_mgmt.entity.RemainingLeaveDays;

@Repository
public class RemainingLeaveDaysDaoImpl implements RemainingLeaveDaysDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long getRemainingLeaveDays(int LeaveTypeId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Integer> query = currentSession.createQuery("select remainingDays from RemainingLeaveDays where remainingLeaveDaysId = (select max(remainingLeaveDaysId)from RemainingLeaveDays group by leaveType.leaveTypeId having leaveType.leaveTypeId = :leaveTypeId)");
		query.setParameter("leaveTypeId", LeaveTypeId);
		Integer days = query.getSingleResult();
		System.out.println("Days  "+days);
		return (long)days;
	}
	
	@Override
	public void saveRmainingLeaveDays(RemainingLeaveDays remainingLeaveDays )
	{
		
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(remainingLeaveDays);
		
		
		
	}

}
