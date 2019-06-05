package com.learning.JAX_RS_starter;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {

	StudentRepositery repo= new StudentRepositery();
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Student> getStudents() {		
		System.out.println("getStudents called .. 1");
		return repo.getStuds();
	}
	
	@GET
	@Path("student/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student getStudent(@PathParam("id") int id) {		
		System.out.println("getStudent called .. 2");		
		return repo.getStud(id);
	}
	
	
	@POST
	@Path("student")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student createStudent(Student s1) {
		System.out.println(s1);
		repo.create(s1);
		
		return s1;
	}
	
	@PUT
	@Path("student")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student updateStudent(Student s1) {
		//System.out.println(repo.getStud(s1.getId()));
		if ((repo.getStud(s1.getId())).getId() ==0)  {
			repo.create(s1);
		} else {
			repo.update(s1);
		}			
		return s1;
	}
	
	
	@DELETE
	@Path("student/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student deleteStudent(@PathParam("id") int id) {		
		System.out.println("deleteStudent called .. 3");		
		Student s4= repo.getStud(id);
		if (s4.getId() != 0) {
			 repo.delete(id);			 
		}		
		return s4;
	}

}
