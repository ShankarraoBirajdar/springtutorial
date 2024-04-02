package SpringAnnotationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//Main class 
public class DemoApplication { 

//Main driver method 
public static void main(String[] args) { 

	// Creating object in a spring container (Beans) 
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	Student student1 = (Student) context.getBean("student1", Student.class); 

	System.out.println(student1); 
	
	Student student2 = (Student) context.getBean("student2", Student.class); 

	System.out.println(student2); 
	
} 
} 
