package com.school.service;

import com.school.dao.TeacherDao;
import com.school.dto.TeacherClass;

public class TeacherService {
	TeacherDao teacherDao = new TeacherDao();
	public TeacherClass saveTeacher(TeacherClass teacher) {
		return teacherDao.saveTeacher(teacher);
	}
}
