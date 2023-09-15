package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(3);
		student.setName("Adarsh");
		student.setEmail("kambleada@mail.com");
		
		StudentService studentService = new StudentService();
		Student s =  studentService.saveStudent(student);
		if(s != null) {
			System.out.println(s.getId() +" Saved SuccessFull");
			System.out.println(s.getName() +" Saved SuccessFull");
			System.out.println(s.getEmail() +" Saved SuccessFull");
		}
	}
}
