package com.students.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String StudentName;
	private String StudentEmail;
	private String StudentAddress;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public Students(long id, String studentName, String studentEmail, String studentAddress) {
		super();
		Id = id;
		StudentName = studentName;
		StudentEmail = studentEmail;
		StudentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Students [Id=" + Id + ", StudentName=" + StudentName + ", StudentEmail=" + StudentEmail
				+ ", StudentAddress=" + StudentAddress + "]";
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
