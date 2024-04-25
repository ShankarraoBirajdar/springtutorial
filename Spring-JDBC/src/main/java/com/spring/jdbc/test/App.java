package com.spring.jdbc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.helper.StudentDAOHelper;
import com.spring.jdbc.repository.StudentDAOImpl;

public class App {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpl studentDAOImpl = applicationContext.getBean("studentDAO",StudentDAOImpl.class);
		
//		Student student = new Student();
//		student.setRollNo(0);
//		student.setName("Mahesh");
//		student.setAge(27);
//		student.setAddress("Solapur");	
		
		//Insert Single Row into Table
//		studentDAOImpl.insert(student);
		
		//Update Single Row into Table
//		studentDAOImpl.updateByRollNo(student, 0);
		
		//Delete the row by using Roll no
//		studentDAOImpl.deleteByRollNo(1);
		
		//Calling StudentDAOHelper to get Multiple Data of Student
//		StudentDAOHelper helper = new StudentDAOHelper();
		//Insert Multiple Row into Table
//		studentDAOImpl.insertBatch(helper.getStudentData());
		
		//Update Multiple Row into Table
//		studentDAOImpl.updateBatch(helper.updateStudentData());
		
		//Display All Data from table using RowMapper
//		studentDAOImpl.displayUsingRowMapper();
		
		//Display Single Data from table using RowMapper
//		studentDAOImpl.displayByRollNoUsingRowMapper(0);
		
		//Display All Data from table using ResultSetExtractor
//		studentDAOImpl.displayUsingResultSetExtractor();
		
		//Display All Data from table using BeanPropertyRowMapper
//		studentDAOImpl.displayUsingBeanPropertyRowMapper();
		
		studentDAOImpl.displayStudentsGroupByAddress();
		
		//Truncate the table - DDL Command
//		studentDAOImpl.cleanUp();
		
		applicationContext.close();

	}

}
