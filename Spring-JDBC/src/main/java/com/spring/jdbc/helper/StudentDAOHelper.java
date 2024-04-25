package com.spring.jdbc.helper;

import java.util.ArrayList;
import java.util.List;

import com.spring.jdbc.beans.Student;

public class StudentDAOHelper {

	List<Student> list = new ArrayList<Student>();
	
	public List<Student> getStudentData() {
		
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
		
		Student student6 = new Student();
		student6.setRollNo(5);
		student6.setName("Priyanka");
		student6.setAge(26);
		student6.setAddress("Solapur");
		
		Student student7 = new Student();
		student7.setRollNo(6);
		student7.setName("Sneha");
		student7.setAge(32);
		student7.setAddress("Pune");
		
		Student student8 = new Student();
		student8.setRollNo(7);
		student8.setName("Gopal");
		student8.setAge(34);
		student8.setAddress("Chennai");
		
		Student student9 = new Student();
		student9.setRollNo(8);
		student9.setName("Anubha");
		student9.setAge(43);
		student9.setAddress("Indore");
		
		Student student10 = new Student();
		student10.setRollNo(9);
		student10.setName("Neha");
		student10.setAge(24);
		student10.setAddress("Delhi");
		
		Student student11 = new Student();
		student11.setRollNo(10);
		student11.setName("Durga");
		student11.setAge(50);
		student11.setAddress("Hydrabad");
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		list.add(student6);
		list.add(student7);
		list.add(student8);
		list.add(student9);
		list.add(student10);
		list.add(student11);
		
		
		return list;
	}
	
	public List<Student> updateStudentData(){
		Student student1 = new Student();
		student1.setRollNo(0);
		student1.setName("Ajinkya");
		student1.setAge(20);
		student1.setAddress("Mumbai");
		
		Student student2 = new Student();
		student2.setRollNo(1);
		student2.setName("Mallinath");
		student2.setAge(21);
		student2.setAddress("Solapur");
		
		Student student3 = new Student();
		student3.setRollNo(2);
		student3.setName("kailas");
		student3.setAge(22);
		student3.setAddress("Chennai");
		
		Student student4 = new Student();
		student4.setRollNo(3);
		student4.setName("Amol");
		student4.setAge(21);
		student4.setAddress("Surat");
		
		Student student5 = new Student();
		student5.setRollNo(4);
		student5.setName("Subhajit");
		student5.setAge(21);
		student5.setAddress("Kolkatta");
		
		Student student6 = new Student();
		student6.setRollNo(5);
		student6.setName("Aniket");
		student6.setAge(24);
		student6.setAddress("Amaravati");
		
		Student student7 = new Student();
		student7.setRollNo(6);
		student7.setName("Kalpana");
		student7.setAge(25);
		student7.setAddress("Puri");
		
		Student student8 = new Student();
		student8.setRollNo(7);
		student8.setName("Dheeraj");
		student8.setAge(33);
		student8.setAddress("Kanpur");
		
		Student student9 = new Student();
		student9.setRollNo(8);
		student9.setName("Shubhra");
		student9.setAge(36);
		student9.setAddress("Noida");
		
		Student student10 = new Student();
		student10.setRollNo(9);
		student10.setName("Ketki");
		student10.setAge(21);
		student10.setAddress("Pune");
		
		Student student11 = new Student();
		student11.setRollNo(10);
		student11.setName("Pranita");
		student11.setAge(26);
		student11.setAddress("Hydrabad");
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		list.add(student6);
		list.add(student7);
		list.add(student8);
		list.add(student9);
		list.add(student10);
		list.add(student11);
		
		
		return list;
	}
}
