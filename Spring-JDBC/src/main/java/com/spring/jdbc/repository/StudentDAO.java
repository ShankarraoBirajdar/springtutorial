package com.spring.jdbc.repository;

import java.util.List;
import java.util.Map;

import com.spring.jdbc.beans.Student;

public interface StudentDAO {

	public void insert(Student student);
	
	public int updateByRollNo(Student student,int rollNo);
	
	public void insertBatch(List<Student> studentList);
	
	public void updateBatch(List<Student> studentList);
	
	public boolean deleteByRollNo(int rollNo);
	
	public void cleanUp();
	
	public List<Student> displayUsingRowMapper();
	
	public List<Student> displayByRollNoUsingRowMapper(int rollNo);
	
	public List<Student> displayUsingBeanPropertyRowMapper();
	
	public List<Student> displayUsingResultSetExtractor();
	
	public Map<String, List<String>> displayStudentsGroupByAddress();
}
