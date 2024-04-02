package ConstructorInjectionwithDependentObject;

//Java Program to Illustrate Application Class

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Application(Main) Class
class Test {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of ClassPathXmlApplicationContext class
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("ConstructorInjectionwithDI.xml");

		// Creating an object of Employee class
		Employee e = (Employee)factory.getBean("employee");

		// Calling print() method inside main() method
		e.display();
		
		factory.close();
	}
}
