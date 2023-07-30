package com.naveen.SpringBootDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.SpringBootDemo.model.Alian;

//RESTful webservice example

@RestController
public class AlianController {

	@Autowired
	private AlianRepo repo;
	
	@GetMapping(path = "alians", produces = {"application/xml"})
	public List<Alian> getalians() {
		
		List<Alian> alians = repo.findAll();	
//		int i=9/0;
		System.out.println("Fetching alians ....");
		return alians;
	}

	@GetMapping("alian/{aid}")
	public Alian getAlian(@PathVariable("aid") int aid) {
		
		Alian alian = repo.findById(aid).orElse(new Alian(0,""));
		
		return alian;
	}
	
	@PostMapping(path = "alian", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public Alian addAlian(@RequestBody Alian a) {		
		repo.save(a);		
		return a;		
	}
	

}
