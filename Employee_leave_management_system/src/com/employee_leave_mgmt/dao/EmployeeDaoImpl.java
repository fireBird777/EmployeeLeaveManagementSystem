package com.employee_leave_mgmt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee_leave_mgmt.entity.Employee;
import com.employee_leave_mgmt.entity.Role;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Employee employee;

	@Override
	public Employee getEmployee(Employee employee) {
		Session currenSession = sessionFactory.getCurrentSession();
		Query<Employee> query = currenSession.createQuery("from Employee where username = :user and password = :pass");
		query.setParameter("user", employee.getUsername());
		query.setParameter("pass", employee.getPassword());
		List<Employee> Employees = query.getResultList();
		System.out.println(Employees);
		Iterator iterator = Employees.iterator();
		if (iterator.hasNext()) {
			Employee theEmployee = Employees.get(0);
			
			//why get roles?
			System.out.println(theEmployee.getRoles());
			
			//change this :
			
			saveEmployee(theEmployee);
			
			return theEmployee;
		}
			
		return null;
	}

	@Override
	public boolean isUser(Employee employee) {
		if (employee != null)
			return true;
		else
			return false;

	}

	public void saveEmployee(Employee theEmployee)
	{
		employee = theEmployee;
	}
	
	@Override
	public List<Role> getRoles()
	{
		return employee.getRoles();
	}

	@Override
	public int getEmployeeId()
	{
		return employee.getEmpolyeeId();
	}
}



