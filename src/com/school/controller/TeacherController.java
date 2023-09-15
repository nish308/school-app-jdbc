package com.school.controller;

import com.school.dto.TeacherClass;
import com.school.service.TeacherService;

public class TeacherController {
	public static void main(String[] args) {
		TeacherClass teacher = new TeacherClass();
		teacher.setId(1);
		teacher.setName("Neeraj");
		teacher.setSubject("Java");
		
		TeacherService teacherService = new TeacherService();
		TeacherClass s =  teacherService.saveTeacher(teacher);
		if(s != null) {
			System.out.println(s.getId() +" Saved SuccessFull");
			System.out.println(s.getName() +" Saved SuccessFull");
			System.out.println(s.getSubject() +" Saved SuccessFull");
		}
	}
}
