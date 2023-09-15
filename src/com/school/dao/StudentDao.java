package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
	
	HelperClass helperClass = new HelperClass();
	Connection connection = null;
	
	//to delete student data by id
	public boolean deleteStudent(int id) {
		connection = helperClass.getConnection();
		int i = 0;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id=?");
			
			preparedStatement.setInt(1, id);
			
			i = preparedStatement.executeUpdate();
			
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
		if(i>0) {
			return true;
		}else {
			return false;
		}
	}
	
	//To get all data 
	public boolean getAllById(int id) {
		connection = helperClass.getConnection();
		
		try {
		PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id = ? ");
		
		preparedStatement.setInt(1, id);;
		
		ResultSet resultSet = preparedStatement.executeQuery();		
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println("=====================");
		}
		
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
		return true;
	}
	
	
	//To Update the data
	public boolean updateStudent(String name, String email, int id) {
		connection = helperClass.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("update student set name = ?, email = ? where id = ?");
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setInt(3, id);
	
			preparedStatement.executeUpdate();
				
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
		return true;
	}
	
	
	//To save student data
	public Student saveStudent(Student student) {
		connection = helperClass.getConnection();
		String sql = "insert into student values(?,?,?)";
		
		try {
			
			//create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			//passed the values to placeholder
			preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			
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
		return student;
	}
}
