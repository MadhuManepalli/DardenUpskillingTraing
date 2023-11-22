package com.students.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.students.entity.Students;

@RestController
public class StudentController {
	
	@PostMapping("/api/students")
	private void saveStudents(@RequestBody Students students) {
		System.out.println(students);
		
	}

}
