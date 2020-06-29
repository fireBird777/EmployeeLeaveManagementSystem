package com.employee_leave_mgmt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "leave_type")
public class LeaveType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "leave_type_id")
	private int leaveTypeId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "maxdaylimit")
	private int maxDayLimit;
	
	@Column(name = "yearofeffect")
	private String yearOfEffect;
	

	public int getLeaveTypeId() {
		return leaveTypeId;
	}

	public void setLeaveTypeId(int leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxDayLimit() {
		return maxDayLimit;
	}

	public void setMaxDayLimit(int maxDayLimit) {
		this.maxDayLimit = maxDayLimit;
	}

	public String getYearOfEffect() {
		return yearOfEffect;
	}

	public void setYearOfEffect(String yearOfEffect) {
		this.yearOfEffect = yearOfEffect;
	}

	@Override
	public String toString() {
		return "LeaveType [leaveTypeId=" + leaveTypeId + ", name=" + name + ", maxDayLimit=" + maxDayLimit
				+ ", yearOfEffect=" + yearOfEffect + "]";
	}
	
	
}
