package com.mvit.collegeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class Collegeservice1 {
	@Autowired
	private CollegeRepository repo;
	//Inserting the records to the table in database
		public void insertRecord(Collegeservice clg)
		{
			repo.save(clg);
		}
		
		//Show all the records from the table in database
		public List<Collegeservice> getAllRecords()
		{
			return repo.findAll();
		}
		
		//Show specific record from the table in database
		public Collegeservice getCollegeById(Integer id)
		{
			return repo.findById(id).orElse(null);
		}
		
		//Deleting the specific record from the table in database
		public void deleteCollege(Integer id)
		{
			repo.deleteById(id);
		}
		
		//updating the existing record
		public void updateCollege (Integer id,Collegeservice updateCollege)
		{
			Collegeservice existingCollege=repo.findById(id).orElse(null);
			if(existingCollege!=null)
			{
				existingCollege.setId(updateCollege.getId());
				existingCollege.setName(updateCollege.getName());
				existingCollege.setDept(updateCollege.getDept());
				existingCollege.setDob(updateCollege.getDob());
				existingCollege.setAddress(updateCollege.getAddress());
				existingCollege.setPhonenumber(updateCollege.getPhonenumber());
				repo.save(existingCollege);
				
				
			}
		}
		
	
	

}
