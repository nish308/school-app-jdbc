package com.school.controller;

import com.school.service.StudentService;

public class TestDelete {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		
		boolean result = studentService.deleteStudent(2);
		
		System.out.println(result);
	}
}
