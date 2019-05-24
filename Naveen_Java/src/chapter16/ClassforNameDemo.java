package chapter16;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassforNameDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
		//Class.forName("chapter16.Abc").newInstance();
		//Pqr obj=new Pqr();
		 
		Class.forName("com.mysql.jdbc.Driver");
		
		
		//DriverManager.registerDriver(new  com.mysql.jdbc.Driver());
		
		//Driver class has static block which does the registration of drive that we do in above statement
		//forName is to just load the Driver class so that above static block will execute to register the driver class
		
	}
}

class Abc{
	static {
		System.out.println("static block");
	}
	
	//instance
	{
		System.out.println("Instance block");
	}
}
