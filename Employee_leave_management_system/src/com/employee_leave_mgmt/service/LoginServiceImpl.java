package com.employee_leave_mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee_leave_mgmt.dao.EmployeeDao;
import com.employee_leave_mgmt.entity.Employee;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	@Override
	public boolean isUser(Employee employee) {
		Employee theEmployee = employeeDao.getEmployee(employee);
		boolean result = employeeDao.isUser(theEmployee);
		return result;
	}

}
