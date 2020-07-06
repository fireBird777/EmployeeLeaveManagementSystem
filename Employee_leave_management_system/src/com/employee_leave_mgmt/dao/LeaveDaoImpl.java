package com.employee_leave_mgmt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee_leave_mgmt.entity.Leave;
import com.employee_leave_mgmt.entity.LeaveType;



@Repository
public class LeaveDaoImpl implements LeaveDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<LeaveType> getLeaveTypes() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<LeaveType> query = currentSession.createQuery("from LeaveType");
		List<LeaveType> leaveTypes = query.getResultList();
		
		
		return leaveTypes ;
	}
	
	@Override
	public void saveLeave(Leave theLeave)
	{
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theLeave);
	}
	
	

}
