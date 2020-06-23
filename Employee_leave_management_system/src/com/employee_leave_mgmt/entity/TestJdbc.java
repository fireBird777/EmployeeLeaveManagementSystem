package com.employee_leave_mgmt.entity;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:postgresql://localhost:5432/Employee_leave_management";
		String user = "postgres";
		String pass = "admin";
		try
		{
			Class.forName("org.postgresql.Driver");
			System.out.println("connection to database:"+jdbcUrl);
			Connection con = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("connection successful!");
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
