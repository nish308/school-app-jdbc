package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	
	StudentDao studentDao = new StudentDao();
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	public boolean deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}
	
	public boolean updateStudent(String name, String email, int id) {
		return studentDao.updateStudent(name, email, id);
	}
	
	public boolean getAllById(int id) {
		return studentDao.getAllById(id);
	}
}
