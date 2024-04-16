package com.spring.jdbc.resultsetextractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.spring.jdbc.beans.Student;

public class StudentDAOResultSetExtractor implements ResultSetExtractor<List<Student>> {

	@Override
	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {

		List<Student> students = new ArrayList<Student>();

		while (rs.next()) {
			Student student = new Student();
			student.setRollNo(rs.getInt("STUDENT_ROLLNO"));
			student.setName(rs.getString("STUDENT_NAME"));
			student.setAge(rs.getInt("STUDENT_AGE"));
			student.setAddress(rs.getString("ADDRESS"));
			students.add(student);
		}
		
		return students;
	}

	
}
