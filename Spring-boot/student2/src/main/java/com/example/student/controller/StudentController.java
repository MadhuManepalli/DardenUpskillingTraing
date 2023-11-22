package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.StudentEntity;
import com.example.student.repo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/savestudent")
	public StudentEntity savestudent(@RequestBody StudentEntity student) {
		return repo.save(student);
	}
			
	
	

}
