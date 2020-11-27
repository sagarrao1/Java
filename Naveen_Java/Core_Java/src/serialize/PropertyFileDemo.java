package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFileDemo {

	public static void main(String[] args) throws Exception
	{
		Properties p= new Properties();
		/*// to create properties file
		 * OutputStream os= new FileOutputStream("dataConfig.properties");
		 * p.setProperty("url", "localhost:3302/myDB"); p.setProperty("uname", "Navin");
		 * p.setProperty("pass", "0000");
		 * 
		 * p.store(os, null);
		 */
		InputStream is= new FileInputStream("dataConfig.properties");
		p.load(is);
		
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("url"));
		
		p.list(System.out);
	}
}
