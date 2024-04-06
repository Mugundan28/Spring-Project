package com.mvit.collegeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CollegeController {
	@Autowired
	private Collegeservice1 service;
	@PostMapping("/Collegeservice")
	public void add(@RequestBody Collegeservice clg)
	{
		service.insertRecord(clg);
	}
	
	
	@GetMapping("/collegeservice")
	public List<Collegeservice> ShowAll()
	{
		return service.getAllRecords();
	}

	
	@GetMapping("/collegeservice/{Id}")
	public Collegeservice getCollegeserviceById(@PathVariable Integer Id)
	{
		return service.getCollegeById(Id);
	}
	
	@DeleteMapping("/collegeservice/{id}")
	public void deleteCollegeservice(@PathVariable Integer Id)
	{
		service.deleteCollege(Id);
	}
	
	@PutMapping("/collegeservice/{Id}")
	public ResponseEntity<String> updateCollegeservice(@PathVariable Integer Id,@RequestBody Collegeservice updatedCollegeservice)
	{
		service.updateCollege(Id,updatedCollegeservice);
		return ResponseEntity.ok("College updated Successfully");
		
		
	} 
	

}

