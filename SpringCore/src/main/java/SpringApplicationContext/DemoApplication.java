package SpringApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Note: XmlBeanFactory class is deprecated. 

//Main class 
public class DemoApplication { 

//Main driver method 
public static void main(String[] args) { 

	// Creating object in a spring container (Beans) 
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context-demo.xml"); 
	Student student1 = (Student) applicationContext.getBean("student1", Student.class); 

	System.out.println(student1); 
	
	Student student2 = (Student) applicationContext.getBean("student2", Student.class); 

	System.out.println(student2); 
	
} 
} 
