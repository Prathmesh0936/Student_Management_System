package com.prathmesh.Student_management_system;

import java.util.List;
import java.util.Scanner;

public class Main_app {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student_Info st = new Student_Info();
		
		System.out.println("Welcome To Student Management System");
		
		while(true) {
			
			System.out.println();
			System.out.println("Kindly Enter your Choice");
			System.out.println("1.Add New Student");
			System.out.println("2.View All Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Search Student");
			System.out.println("6.Exist");
			
			int userInput = sc.nextInt();
			
			if(userInput == 6) {
				
				System.out.println("GoodByee!!!");
				break;
				
			}else {
				
				int Roll_no;
				String First_Name;
				String Last_Name;
			    String Department;
			    String Gender;
				
			    switch(userInput) {
			    
			    //Add new Records 
			    
			    case 1: System.out.println("Enter ID : ");
			           Roll_no = sc.nextInt();
			           
			           System.out.println("Enter First_Name : ");
			           First_Name = sc.next();
			           
			           System.out.println("Enter Last_Name : ");
			           Last_Name = sc.next();
			           
			           System.out.println("Enter Department : ");
			           Department = sc.next();
			           
			           System.out.println("Enter Gender : ");
			           Gender = sc.next();
			           
			           Boolean b = st.insertRecord(Roll_no, First_Name, Last_Name, Department, Gender);
			           
			           if(b) {
			        	   
			        	   System.out.println("Data Inserted Successsfully");
			        	   
			           }else {
			        	   
			        	   System.out.println("Data not Inserted");
			        	   
			           }
			           
			           break;
			           
			    case 2: List<Student> s2 = st.readRecord();
			    
			           for(Student i : s2) {
			        	   
			        	   System.out.println(i);
			        	   
			           }
			           
			           break;
			           
			    case 3: System.out.println("Enter ID : ");
			    
			           Roll_no = sc.nextInt();
			           
			           Student s1 = st.searchRecords(Roll_no);
			           
			           System.out.println(s1);
			           
			           System.out.println();
			           
			           System.out.println("Enter the choice for field which you want to update");
			           
			           System.out.println("a.Update First_Name");
			           System.out.println("b.Update Last_name");
			           System.out.println("c.Update Department");
			           System.out.println("d.Update Gender");
			           
			           char c = sc.next().charAt(0);
			           
			           switch(c) {
			           
			           case 'a' : System.out.println("Enter First_Name : ");
			                     First_Name = sc.next();
			                     s1.setFirst_Name(First_Name);
			                     break;
			                     
			           case 'b' : System.out.println("Enter last_Name : ");
			                     Last_Name = sc.next();
			                     s1.setLast_Name(Last_Name);
			                     break;
			                     
			           case 'c' : System.out.println("Enter Department : ");
			                    Department = sc.next();
			                    s1.setDepartment(Department);
			                    break;
			                    
			           case 'd' : System.out.println("Enter Gender : ");
			                     Gender = sc.next();
			                     s1.setGender(Gender);
			                     break;
			                     
			           default : System.out.println("Invalid Input");
			           
			              
			           
			           }
			           
			           b =st.updateRecords(s1);
			           
			           if(b) {
			        	   
			        	   System.out.println("Record Updated Successfully");
			        	   
			           }else {
			        	   
			        	   System.out.println("Record Not Upadted");
			        	   
			           }
			           
			           break;
			           
			           
			    case 4 : System.out.println("Enter Roll_no :");
			            
			            Roll_no = sc.nextInt();
			            
			            b = st.deleteRecord(Roll_no);
			            
			            if(b) {
			            	
			            	System.out.println("Record Deleted Successfully");
			            	
			            }else {
			            	
			            	System.out.println("Record Not Deleted");
			            	
			            }
			           
			            break;
			           
			           
			           
			    case 5: System.out.println("Enter Roll_no : ");
			    
			            Roll_no = sc.nextInt();
			            
			            Student s = st.searchRecords(Roll_no);
			            
			            System.out.println(s);
			            
			            break;
			    
			            
			    default  : System.out.println("Invalid Input");
			    }
			    
			}
			
		}
		
	}

}
