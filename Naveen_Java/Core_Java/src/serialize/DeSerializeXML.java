package serialize;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class DeSerializeXML {
	public static void main(String[] args) {
		
		
		try {
			File f=new File("C:\\PracticeJava\\workspace\\Naveen_Java\\src\\serialize\\myCollege.xml");
			XMLDecoder x= new XMLDecoder(new BufferedInputStream(new FileInputStream(f)));
			College c= (College) x.readObject();
			x.close();
			List<Student> s= c.getStudents();			
			
			for (Student value : s) {
				System.out.println(value);
			}
			
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
