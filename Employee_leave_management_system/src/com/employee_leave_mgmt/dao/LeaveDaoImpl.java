package com.employee_leave_mgmt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee_leave_mgmt.entity.Leave;



@Repository
public class LeaveDaoImpl implements LeaveDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<String> getLeaveTypeName() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<String> query = currentSession.createQuery("select name from LeaveType");
		List<String> leaveTypeNames = query.getResultList();
		
		
		return leaveTypeNames ;
	}
	
	public void saveLeave(Leave theLeave)
	{
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theLeave);
	}
	
	

}
