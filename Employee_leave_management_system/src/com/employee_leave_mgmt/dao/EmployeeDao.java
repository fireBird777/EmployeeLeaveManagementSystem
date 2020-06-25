package com.employee_leave_mgmt.dao;

import java.util.List;

import com.employee_leave_mgmt.entity.Employee;
import com.employee_leave_mgmt.entity.Role;

public interface EmployeeDao {

	public Employee getEmployee(Employee employee);
	public boolean isUser(Employee employee);
	public List<Role> getRoles();
}
