package com.employee_leave_mgmt.service;

import java.util.List;

import com.employee_leave_mgmt.entity.Employee;
import com.employee_leave_mgmt.entity.Role;

public interface LoginService {

	public boolean isUser(Employee employee);
	public List<Role> getEmployeeRoles();
}
