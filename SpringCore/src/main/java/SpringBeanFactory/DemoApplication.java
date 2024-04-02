package SpringBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Note: XmlBeanFactory class is deprecated. 

//Main class 
public class DemoApplication { 

//Main driver method 
public static void main(String[] args) { 

	// Creating object in a spring container (Beans) 
	BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml"); 
	Student student1 = (Student) factory.getBean("student1"); 

	System.out.println(student1); 
	
	Student student2 = (Student) factory.getBean("student2"); 

	System.out.println(student2); 
} 
} 
