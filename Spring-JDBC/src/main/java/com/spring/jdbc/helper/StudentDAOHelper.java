package com.spring.jdbc.helper;

import java.util.ArrayList;
import java.util.List;

import com.spring.jdbc.beans.Student;

public class StudentDAOHelper {

	public List<Student> getStudentData() {
		
		List<Student> list = new ArrayList<Student>();
		
		Student student1 = new Student();
		student1.setRollNo(0);
		student1.setName("Aman");
		student1.setAge(25);
		student1.setAddress("Pune");
		
		Student student2 = new Student();
		student2.setRollNo(1);
		student2.setName("Vipin");
		student2.setAge(28);
		student2.setAddress("Hydrabad");
		
		Student student3 = new Student();
		student3.setRollNo(2);
		student3.setName("Amit");
		student3.setAge(33);
		student3.setAddress("Chennai");
		
		Student student4 = new Student();
		student4.setRollNo(3);
		student4.setName("Rahul");
		student4.setAge(36);
		student4.setAddress("Indore");
		
		Student student5 = new Student();
		student5.setRollNo(4);
		student5.setName("Mitesh");
		student5.setAge(40);
		student5.setAddress("Delhi");
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		return list;
	}
}
