package com.prathmesh.Student_management_system;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_connect {
	
	static Connection con = null;
	
	public static Connection getConnection(){
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/Student";
			String username = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		return con;
	}
	
	public static void closeConnection(){
		
		try {
			
			con.close();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
