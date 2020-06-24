package com.employee_leave_mgmt.dao;

import java.util.Iterator;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee_leave_mgmt.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Employee getEmployee(Employee employee) {
		Session currenSession = sessionFactory.getCurrentSession();
		Query<Employee> query =currenSession.createQuery("from Employee where username = :user and password = :pass");
		query.setParameter("user", employee.getUsername());
		query.setParameter("pass", employee.getPassword());
		List<Employee> Employees = query.getResultList();
		System.out.println(Employees);
		Iterator iterator = Employees.iterator();
		if(iterator.hasNext())
			{
				Employee theEmployee = Employees.get(0);
				System.out.println(theEmployee.getRoles());
				return theEmployee;
			}
			
		
		return null;
	}
	
	@Override
	public boolean isUser(Employee employee)
	{
		if(employee != null)
			return true;
		else
			return false;
		
	}

}
