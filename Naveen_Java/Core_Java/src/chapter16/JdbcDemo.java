package chapter16;
//Java Database Connectivity

/* 1.  import  --> java.sql*
 *  2. load and register  the driver  --> in this case com.mysql.jdbc.driver
 *  3. Create connection --> create object of Connection interface
 *  3. Create statement  --> create object of Statement interface
 *  4. execute the query
 *  5. process the result
 *  6. close 
 *
 */

import java.sql.*;

import com.mysql.jdbc.Driver;

public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/sys";
		//?autoReconnect=true&useSSL=false
		String uname="root";
		String pass="admin";
		String query="select * from tasks where task_id=2";
				
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);		
		Statement st= con.createStatement(); 
		ResultSet rs= st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		//String title=rs.getString(2); 
		
		  
		st.close(); 
		con.close();		 
	}

}










