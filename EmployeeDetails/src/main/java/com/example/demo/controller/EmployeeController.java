package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;

import com.example.demo.repository.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	
	@PostMapping("/add")
	public EmployeeEntity add(@RequestBody EmployeeEntity staff) {
		try {
			repo.save(staff);
			return staff;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
    @GetMapping("/getstaff")
	public List<EmployeeEntity> getuser() {
		try {
			return repo.findAll();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
    
    @PutMapping("/updateuser")
    public EmployeeEntity update(@RequestBody EmployeeEntity staff) {
    	try {
    		repo.save(staff);
    		return staff;
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    
    @DeleteMapping("/deleteuser/{Id}")
    public String deleteuser(@PathVariable int Id) {
    	@SuppressWarnings("deprecation")
    	EmployeeEntity staff=repo.getOne(Id);
    	repo.delete(staff);
    	return "Deleted";
    	}
	

}
