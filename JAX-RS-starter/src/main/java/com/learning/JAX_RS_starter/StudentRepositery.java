package com.learning.JAX_RS_starter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositery {	
	List<Student> studs;
	
		Connection con= null;
		
		//Constructor
		public StudentRepositery() {
			System.out.println("In Constructor");
			String user="root";
			String pwd="admin";
			String url="jdbc:mysql://localhost:3306/restdb";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con= DriverManager.getConnection(url, user, pwd);				
			} catch (Exception e) {
					System.out.println(e);
			}						
			
		 /* 
		 studs = new ArrayList<Student>();
		 * 
		 * System.out.println("StudentRepositery constructor is getting called");
		 * Student s1= new Student(); s1.setId(101); s1.setName("Sagar");
		 * s1.setPoints(60);
		 * 
		 * Student s2= new Student(); s2.setId(102); s2.setName("Janu");
		 * s2.setPoints(72);
		 * 
		 * studs.add(s1); studs.add(s2);
		 */
			
		}
		
		//Get students
 		public  List<Student> getStuds() {		
 			studs = new ArrayList<Student>();
 			System.out.println(" repo get Studs called");
 			String sql= " select * from student";
 			try {
				Statement st = con.createStatement();
				ResultSet rs= st.executeQuery(sql);
				while ( rs.next()) {
					Student s= new Student();
					s.setId(rs.getInt("id"));
					s.setName(rs.getString("name"));
					s.setPoints(rs.getInt("points"));					
					studs.add(s);
				}
			} catch (Exception e) {				
				System.out.println(e);
			}			
 			
 			System.out.println("Before return");
			return studs;			
		}
 		
 		//Get particular student id details
 		public Student getStud(int id){			
 			Student s= new Student();
 			
 			String sql= " select * from student where id="+id;
 			try {
				Statement st = con.createStatement();
				ResultSet rs= st.executeQuery(sql);
				if ( rs.next()) {					
					s.setId(rs.getInt("id"));
					s.setName(rs.getString("name"));
					s.setPoints(rs.getInt("points"));					
				}
			} catch (Exception e) {				
				System.out.println(e);
			}			
 			
 			System.out.println("Before return");
			return s; 			
		}
 		
 		
		public void create(Student s1) {
			System.out.println(" repo create called");			
			 			
 			String sql= "insert into student  values (?,?,?)";
 			try {
				PreparedStatement st = con.prepareStatement(sql);
				st.setInt(1, s1.getId());
				st.setString(2, s1.getName());
				st.setInt(3, s1.getPoints());
				int count = st.executeUpdate();
				System.out.println("inserted count is :"+count);
			} catch (Exception e) {				
				System.out.println(e);
			}		
 							
		}

}
