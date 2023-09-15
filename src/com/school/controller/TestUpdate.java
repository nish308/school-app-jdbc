package com.school.controller;

import com.school.service.StudentService;

public class TestUpdate {
	public static void main(String[] args) {
	
		StudentService studentService = new StudentService();
		boolean s =  studentService.updateStudent("Nish", "nishant@mail.com", 1);
		System.out.println(s);
	}
}
