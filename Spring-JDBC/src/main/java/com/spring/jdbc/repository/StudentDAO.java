package com.spring.jdbc.repository;

import java.util.List;

import com.spring.jdbc.beans.Student;

public interface StudentDAO {

	public void insert(Student student);
	
	public void updateByRollNo(Student student,int rollNo);
	
	public void insertBatch(List<Student> studentList);
	
	public void deleteByRollNo(int rollNo);
	
	public void cleanUp();
	
	public void displayUsingRowMapper();
	
	public void displayByRollNoUsingRowMapper(int rollNo);
	
	public void displayUsingBeanPropertyRowMapper();
	
	public void displayUsingResultSetExtractor();
}
