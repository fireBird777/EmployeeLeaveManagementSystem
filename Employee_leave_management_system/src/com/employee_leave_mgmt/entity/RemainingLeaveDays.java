package com.employee_leave_mgmt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "remainingleavedays")
public class RemainingLeaveDays {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "remaining_leave_days_id")
	private int remainingLeaveDaysId;
	
	@Column(name = "remaining_days")
	private int remainingDays;
	
	@Column(name = "date")
	private String date;
	
	@ManyToOne(fetch = FetchType.LAZY ,cascade = {CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name = "leave_type_id")
	private LeaveType leaveType;
	
	public int getRemainingLeaveDaysId() {
		return remainingLeaveDaysId;
	}
	
	public void setRemainingLeaveDaysId(int remainingLeaveDaysId) {
		this.remainingLeaveDaysId = remainingLeaveDaysId;
	}
	public int getRemainingDays() {
		return remainingDays;
	}
	public void setRemainingDays(int remainingDays) {
		this.remainingDays = remainingDays;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	@Override
	public String toString() {
		return "RemainingLeaveDays [remainingLeaveDaysId=" + remainingLeaveDaysId + ", remainingDays=" + remainingDays
				+ ", date=" + date + "]";
	}
		
}
