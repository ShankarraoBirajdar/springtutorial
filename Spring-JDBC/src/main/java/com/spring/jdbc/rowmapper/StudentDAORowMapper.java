package com.spring.jdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.beans.Student;

public class StudentDAORowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setRollNo(rs.getInt("STUDENT_ROLLNO"));
		student.setName(rs.getString("STUDENT_NAME"));
		student.setAge(rs.getInt("STUDENT_AGE"));
		student.setAddress(rs.getString("ADDRESS"));
		return student;
	}

}
