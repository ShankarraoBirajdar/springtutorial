package com.spring.jdbc.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.beans.Student;
import com.spring.jdbc.resultsetextractor.StudentDAOResultSetExtractor;
import com.spring.jdbc.rowmapper.StudentDAORowMapper;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {

	private final Logger logger = Logger.getLogger(this.getClass().getName());

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student) {
		logger.info("Inside StudentDAOImpl -> insert()");

		String insertSQL = "INSERT INTO STUDENT VALUES(?,?,?,?)";

		Object[] arr = { student.getRollNo(), student.getName(), student.getAge(), student.getAddress() };

		int noOfRowInserted = jdbcTemplate.update(insertSQL, arr);

		logger.info("No Of Row Inserted: " + noOfRowInserted);
	}
	
	@Override
	public void updateByRollNo(Student student,int rollNo) {
		logger.info("Inside StudentDAOImpl -> update()");
		
		String updateSQL = "UPDATE STUDENT SET STUDENT_NAME=?,STUDENT_AGE=?, ADDRESS=? WHERE STUDENT_ROLLNO=?";

		Object[] arr = {student.getName(), student.getAge(), student.getAddress(),student.getRollNo()};

		int noOfRowUpdated = jdbcTemplate.update(updateSQL, arr);

		logger.info("No Of Row Updated: " + noOfRowUpdated);
	}

	@Override
	public void insertBatch(List<Student> studentList) {

		logger.info("Inside StudentDAOImpl -> insertBatch()");

		String insertSQL = "INSERT INTO STUDENT VALUES(?,?,?,?)";

		List<Object[]> objArr = new ArrayList<Object[]>();
		for (Student student : studentList) {
			Object[] arr = { student.getRollNo(), student.getName(), student.getAge(), student.getAddress() };
			objArr.add(arr);
		}

		int[] noOfRowInserted = jdbcTemplate.batchUpdate(insertSQL, objArr);

		logger.info("No Of Row Inserted - Batch Insert: " + noOfRowInserted.length);

	}

	@Override
	public void deleteByRollNo(int rollNo) {
		logger.info("Inside StudentDAOImpl -> deleteByRollNo()");

		String deleteSQL = "DELETE FROM STUDENT WHERE STUDENT_ROLLNO=?";

		int noOfRowDeleted = jdbcTemplate.update(deleteSQL, rollNo);

		logger.info("No Of Row Deleted: " + noOfRowDeleted);

	}

	@Override
	public void cleanUp() {
		logger.info("Inside StudentDAOImpl -> cleanUp()");

		String truncateSQL = "TRUNCATE TABLE STUDENT";

		jdbcTemplate.execute(truncateSQL);

		logger.info("Table Truncated Successfully..");

	}

	@Override
	public void displayUsingRowMapper() {
		logger.info("Inside StudentDAOImpl -> displayUsingRowMapper()");

		String selectQuery = "SELECT * FROM STUDENT";

		List<Student> students = jdbcTemplate.query(selectQuery, new StudentDAORowMapper());

		for (Student student : students) {
			logger.info(">>>: " + student);
		}

	}

	@Override
	public void displayByRollNoUsingRowMapper(int rollNo) {
		logger.info("Inside StudentDAOImpl -> displayByRollNoUsingRowMapper()");

		String selectQuery = "SELECT * FROM STUDENT WHERE STUDENT_ROLLNO=?";

		List<Student> students = jdbcTemplate.query(selectQuery, new StudentDAORowMapper(), rollNo);

		for (Student student : students) {
			logger.info(">>>: " + student);
		}
	}

	@Override
	public void displayUsingResultSetExtractor() {
		logger.info("Inside StudentDAOImpl -> displayUsingResultSetExtractor()");

		String selectQuery = "SELECT * FROM STUDENT";

		List<Student> students = jdbcTemplate.query(selectQuery, new StudentDAOResultSetExtractor());
		for (Student student : students) {
			logger.info(">>>: " + student);
		}

	}

	@Override
	public void displayUsingBeanPropertyRowMapper() {
		logger.info("Inside StudentDAOImpl -> displayUsingBeanPropertyRowMapper()");

		String selectQuery = "SELECT"
				+ " STUDENT_ROLLNO AS rollNo,"
				+ " STUDENT_NAME AS name,"
				+ " STUDENT_AGE AS age,"
				+ " ADDRESS AS address"
				+ " FROM STUDENT";

		List<Student> students = jdbcTemplate.query(selectQuery, new BeanPropertyRowMapper<Student>(Student.class));

		for (Student student : students) {
			logger.info(">>>: " + student);
		}

	}



}
