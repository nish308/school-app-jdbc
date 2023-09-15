package com.school.controller;

import com.school.service.StudentService;

public class TestGetAll {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		
		boolean res = studentService.getAllById(1);
		System.out.println(res);
	}
}
