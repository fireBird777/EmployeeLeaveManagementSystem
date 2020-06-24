package com.employee_leave_mgmt.dao;

import com.employee_leave_mgmt.entity.Employee;

public interface EmployeeDao {

	public Employee getEmployee(Employee employee);
	public boolean isUser(Employee employee);
}
