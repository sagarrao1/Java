package com.learning.JAX_RS_starter;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositery {	
	List<Student> studs;
	
		public StudentRepositery() {
			studs = new ArrayList<Student>();
			
			System.out.println("StudentRepositery constructor is getting called");
			Student s1= new Student();
			s1.setId(101);
			s1.setName("Sagar");
			s1.setPoints(60);
			
			Student s2= new Student();
			s2.setId(102);
			s2.setName("Janu");
			s2.setPoints(72);			
			
			studs.add(s1);
			studs.add(s2);			
	}
		//Get students
 		public  List<Student> getStuds(){			
 			System.out.println(" repo get Studs called");
			return studs;			
		}
 		
 		//Get particular student id details
 		public Student getStud(int id){			
			System.out.println(" repo getStud called");
 			for (Student s : studs) {
 				if (s.getId()== id)
 					return s;
 			}
 			return new Student(); 			
		}
 		
 		
		public void create(Student s1) {
			System.out.println(" repo create called");
			studs.add(s1);			
		}

}
