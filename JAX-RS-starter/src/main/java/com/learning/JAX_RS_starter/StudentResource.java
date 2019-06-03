package com.learning.JAX_RS_starter;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {

	StudentRepositery repo= new StudentRepositery();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getStudents() {		
		System.out.println("getStudents called .. 1");
		return repo.getStuds();
	}
	
	@POST
	@Path("createstd")
	public Student createStudent(Student s1) {
		System.out.println(s1);
		repo.create(s1);
		
		return s1;
	}
}
