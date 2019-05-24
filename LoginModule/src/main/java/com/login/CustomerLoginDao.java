package com.login;

import java.sql.*;

public class CustomerLoginDao {
	
	public boolean checkCustDetails(String uname,String pass) {
		//CustomerLogin c=new CustomerLogin();
		 System.out.println(" In checkCustDetails................................");
		 
		String sql="select * from customerLogin where cust_name=? and password=? ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","admin");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			
			//Statement st = con.createStatement();
			//ResultSet rs = st.executeQuery("select * from customerLogin where cust_name='" +uname+"'");
			
			System.out.println(" In checkCustDetails....... After connecting to DB.........................");
			if (rs.next() ) {
				return true;
				//c.setUname(rs.getString("cust_name"));
				//c.setPassword(rs.getString("password"));
			}			
		} catch (Exception e) {
			System.out.println(e);
		}		
		return false;
	}

}
