package SpringAnnotationConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Java Program where we are 
//creating a POJO class 

//POJO class 
public class Student { 

//Member variables 

private String name; 

private String age; 

//Constructor 1 
public Student() { 
} 

//Constructor 2 
public Student(String name, String age) { 
	this.name = name; 
	this.age = age; 
} 

//Setter 1
public void setName(String name) {
	this.name = name;
}

//Setter 2
public void setAge(String age) {
	this.age = age;
}

//Method inside POJO class 
@Override
public String toString() { 

	// Print student class attributes 
	return "Student{" + "name='" + name + '\'' + ", age='" + age + '\'' + '}'; 
} 
} 

