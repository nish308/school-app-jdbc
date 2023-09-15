package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
//import com.school.dto.Student;
import com.school.dto.TeacherClass;

public class TeacherDao {
	HelperClass helperClass = new HelperClass();
	Connection connection = null;
	//To save teacher data
	public TeacherClass saveTeacher(TeacherClass teacher) {
		connection = helperClass.getConnection();
		String sql = "insert into teacher values(?,?,?)";
		
		try {
			
			//create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			//passed the values to placeholder
			preparedStatement.setInt(1,teacher.getId());
			preparedStatement.setString(2,teacher.getName());
			preparedStatement.setString(3,teacher.getSubject());
			
			//execute statement
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return teacher;
	}

}
