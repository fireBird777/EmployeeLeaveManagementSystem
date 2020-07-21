package com.employee_leave_mgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee_leave_mgmt.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Transactional
	@Override
	public int getEmployeeId() {
		
		return employeeDao.getEmployeeId();
	}

}
