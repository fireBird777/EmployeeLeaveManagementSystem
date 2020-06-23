package com.employee_leave_mgmt.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empolyeeId;
	
	@Column(name = "supervisor_id")
	private int supervisorId;
	
	@Column(name = "hr_id")
	private int hrId;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "middlename")
	private String middleName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "timestampofjoining")
	private String timestampOfJoining;
	
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.LAZY)
	@JoinTable(name = "employee_role",joinColumns = @JoinColumn(name = "emp_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;

	public int getEmpolyeeId() {
		return empolyeeId;
	}

	public void setEmpolyeeId(int empolyeeId) {
		this.empolyeeId = empolyeeId;
	}

	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}

	public int getHrId() {
		return hrId;
	}

	public void setHrId(int hrId) {
		this.hrId = hrId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimestampOfJoining() {
		return timestampOfJoining;
	}

	public void setTimestampOfJoining(String timestampOfJoining) {
		this.timestampOfJoining = timestampOfJoining;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Employee [empolyeeId=" + empolyeeId + ", supervisorId=" + supervisorId + ", hrId=" + hrId
				+ ", username=" + username + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", email=" + email + ", password=" + password + ", country=" + country + ", state=" + state
				+ ", timestampOfJoining=" + timestampOfJoining + ", roles=" + roles + "]";
	}

	
	
	
	
	
	
}