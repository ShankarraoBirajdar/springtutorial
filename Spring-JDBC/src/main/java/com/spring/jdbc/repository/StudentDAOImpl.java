package com.spring.jdbc.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.beans.Student;
import com.spring.jdbc.resultsetextractor.GroupByAddressResultSetExtractor;
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
	public int updateByRollNo(Student student,int rollNo) {
		logger.info("Inside StudentDAOImpl -> update()");
		
		String updateSQL = "UPDATE STUDENT SET STUDENT_NAME=?,STUDENT_AGE=?, ADDRESS=? WHERE STUDENT_ROLLNO=?";

		Object[] arr = {student.getName(), student.getAge(), student.getAddress(),student.getRollNo()};

		int noOfRowUpdated = jdbcTemplate.update(updateSQL, arr);

		logger.info("No Of Row Updated: " + noOfRowUpdated);
		
		return noOfRowUpdated;
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
	public void updateBatch(List<Student> studentList) {
		logger.info("Inside StudentDAOImpl -> insertBatch()");

		String updateSQL = "UPDATE STUDENT SET STUDENT_NAME=?,STUDENT_AGE=?, ADDRESS=? WHERE STUDENT_ROLLNO=?";


		int[] noOfRowUpdated = jdbcTemplate.batchUpdate(updateSQL, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				logger.info("Inside StudentDAOImpl -> updateBatch() -> setValues()");
				ps.setString(1, studentList.get(i).getName());
				ps.setInt(2, studentList.get(i).getAge());
				ps.setString(3, studentList.get(i).getAddress());
				ps.setInt(4, studentList.get(i).getRollNo());
			}

			@Override
			public int getBatchSize() {
				logger.info("Inside StudentDAOImpl -> updateBatch() -> getBatchSize()");
				return studentList.size();
			}
			
		});

		logger.info("No Of Row Updated - Batch Insert: " + noOfRowUpdated.length);
		
	}

	@Override
	public boolean deleteByRollNo(int rollNo) {
		logger.info("Inside StudentDAOImpl -> deleteByRollNo()");

		String deleteSQL = "DELETE FROM STUDENT WHERE STUDENT_ROLLNO=?";

		int noOfRowDeleted = jdbcTemplate.update(deleteSQL, rollNo);

		logger.info("No Of Row Deleted: " + noOfRowDeleted);
		
		return noOfRowDeleted==1;

	}

	@Override
	public void cleanUp() {
		logger.info("Inside StudentDAOImpl -> cleanUp()");

		String truncateSQL = "TRUNCATE TABLE STUDENT";

		jdbcTemplate.execute(truncateSQL);

		logger.info("Table Truncated Successfully..");

	}

	@Override
	public List<Student> displayUsingRowMapper() {
		logger.info("Inside StudentDAOImpl -> displayUsingRowMapper()");

		String selectQuery = "SELECT * FROM STUDENT";

		List<Student> students = jdbcTemplate.query(selectQuery, new StudentDAORowMapper());

		for (Student student : students) {
			logger.info(">>>: " + student);
		}
		
		return students;
	}

	@Override
	public List<Student> displayByRollNoUsingRowMapper(int rollNo) {
		logger.info("Inside StudentDAOImpl -> displayByRollNoUsingRowMapper()");

		String selectQuery = "SELECT * FROM STUDENT WHERE STUDENT_ROLLNO=?";

		List<Student> students = jdbcTemplate.query(selectQuery, new StudentDAORowMapper(), rollNo);

		for (Student student : students) {
			logger.info(">>>: " + student);
		}
		
		return students;
	}

	@Override
	public List<Student> displayUsingResultSetExtractor() {
		logger.info("Inside StudentDAOImpl -> displayUsingResultSetExtractor()");

		String selectQuery = "SELECT * FROM STUDENT";

		List<Student> students = jdbcTemplate.query(selectQuery, new StudentDAOResultSetExtractor());
		for (Student student : students) {
			logger.info(">>>: " + student);
		}

		return students;
	}

	@Override
	public List<Student> displayUsingBeanPropertyRowMapper() {
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

		return students;
	}

	@Override
	public Map<String, List<String>> displayStudentsGroupByAddress() {
		logger.info("Inside StudentDAOImpl -> displayStudentsGroupByAddress()");
		
		String selectQuery = "SELECT * FROM STUDENT";
		
		Map<String, List<String>> groupByAddress = jdbcTemplate.query(selectQuery, new GroupByAddressResultSetExtractor());

		groupByAddress.forEach((k,v)->{System.out.println("Key : " + k + " Value : " + v);});
		
		return groupByAddress;
	}


}
