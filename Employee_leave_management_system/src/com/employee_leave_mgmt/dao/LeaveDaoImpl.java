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
	public void saveLeave(Leave theLeave)
	{
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theLeave);
	}


	@Override
	public Leave getLatestLeaveInfo(int employeeId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Leave> query = currentSession.createQuery("from Leave where employee.empolyeeId = :empId and startDate = (select max(startDate) from Leave)");
		query.setParameter("empId", employeeId);
		Leave leaveInfo = query.getSingleResult();
		return leaveInfo;
	}
	
	

}
