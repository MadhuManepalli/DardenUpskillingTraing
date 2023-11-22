package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentrepository;
	
	@PostMapping("/savestudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentrepository.save(student);
	}
	
	@GetMapping("/getstudents")
	public List<Student> getStudents()
	{
		return studentrepository.findAll();
	}
	
	@GetMapping("/getstudentid/{id}")
	public Student getStudentById(@PathVariable("id") Integer id)
	{
		return studentrepository.findById(id).get();
	}
	
	@GetMapping("/getstudentname/{name}")
	public Student getStudentByName(@PathVariable("name") String name)
	{
		return studentrepository.findByName(name);
	}
	

}
