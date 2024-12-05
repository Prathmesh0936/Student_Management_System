package com.prathmesh.Student_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Student_Info {
	
	static Connection con = DB_connect.getConnection();
	
	public List<Student> readRecord(){
		
		List<Student> students = new ArrayList<Student>();
		
		String query = "select * from student_info;";
		
		try {
			
			Statement stats = con.createStatement();
			ResultSet rs = stats.executeQuery(query);
			
			while(rs.next()) {
				
				Student s = new Student();
				
				s.setRoll_no(rs.getInt("Roll_no"));
				s.setFirst_Name(rs.getString("First_Name"));
				s.setLast_Name(rs.getString("Last_Name"));
				s.setDepartment(rs.getString("Department"));
				s.setGender(rs.getString("Gender"));
				
				students.add(s);
				
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return students;
		
	}
	
	public boolean insertRecord(int Roll_no, String First_Name, String Last_Name, String Department, String Gender) {
		
		String query = "insert into student_Info values(?, ?, ?, ?, ?);"; 
		
		try {
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, Roll_no);
			ps.setString(2, First_Name);
			ps.setString(3, Last_Name);
			ps.setString(4, Department);
			ps.setString(5, Gender);
			
			int i = ps.executeUpdate();
			
			if(i > 0) {
				
				return  true;
				
			}
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return false;
	}
	
	public Student searchRecords(int Roll_no) {
		
		Student s = new Student();
		
		String query = "Select * from student_Info where Roll_no = ?;";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, Roll_no);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				s.setRoll_no(rs.getInt("Roll_no"));
				s.setFirst_Name(rs.getString("First_Name"));
				s.setLast_Name(rs.getString("Last_Name"));
				s.setDepartment(rs.getString("Department"));
				s.setGender(rs.getString("Gender"));
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return s;
	}
	
	public boolean deleteRecord(int Roll_no) {
		
		String query = "delete from student_Info where Roll_no = ?;";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, Roll_no);
			
			int i = ps.executeUpdate();
			
			if(i > 0) {
				
				return true;
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return false;
	}

	
	public boolean updateRecords(Student s1) {
		
		String query = "Update student_Info set First_Name =  ?, Last_Name = ?, Department = ?, Gender = ? where Roll_no = ?;";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s1.getFirst_Name());
			ps.setString(2, s1.getLast_Name());
			ps.setString(3, s1.getDepartment());
			ps.setString(4, s1.getGender());
			ps.setInt(5, s1.getRoll_no());
			
			int i = ps.executeUpdate();
			
			if(i > 0) {
				
				return true;
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return false;
	}
	
}
