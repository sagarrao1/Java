package com.learning.web.dao;
import java.sql.*;
import com.learning.web.model.Student;

public class StudentDao {
	
	public Student getStudent( int id) {
		Student s=new Student();	
		
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","admin");
			Statement st = con.createStatement();			
			ResultSet rs = st.executeQuery("select * from Student where id=" +id );
			if(rs.next()) {
				s.setSid(rs.getInt("ID"));
				s.setName(rs.getString("NAME"));
				s.setTechno(rs.getString("TECHNOLOGY"));
			}
			
			rs.close();			
			
		} catch (Exception e) {
			System.out.println(e);
		}				
		//System.out.println(s);		
		return s;
	}
	
	public void insertStudent( int stid,String sname,String stechno) {
				
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","admin");
			Statement st = con.createStatement();			
			int count = st.executeUpdate("INSERT INTO STUDENT (`ID`, `NAME`, `TECHNOLOGY`) VALUES ('"+stid+"', '"+sname+"', '"+stechno+"')" );
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
