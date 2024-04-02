package DIWithMap;

//Java Program to Illustrate Application Class

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//Application class
//Main class
@SuppressWarnings("deprecation")
public class Test {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating a class path resource
		Resource resource = new ClassPathResource(
			"DIWithMap.xml");

		// Creating an object of BeanFactory class
		BeanFactory factory = new XmlBeanFactory(resource);

		// Creating an object of Employee class
		Company c = (Company)factory.getBean("company");

		// Calling print() method inside main() method
		c.display();
	}
}
