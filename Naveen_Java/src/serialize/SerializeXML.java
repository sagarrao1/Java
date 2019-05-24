package serialize;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML 
{
	public static void main(String[] args) {
		Student st1=new Student();		
		st1.setRollNo(101);
		st1.setName("Sagar");

		Student st2=new Student();		
		st2.setRollNo(102);
		st2.setName("Sanju");
		
		List<Student> s=new ArrayList<>();
		s.add(st1);
		s.add(st2);
		
		College col=new College();
		col.setStudents(s);
		
		try {
			File f=new File("C:\\PracticeJava\\workspace\\Naveen_Java\\src\\serialize\\myCollege.xml");
			XMLEncoder x=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(f)));
			x.writeObject(col);
			x.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
