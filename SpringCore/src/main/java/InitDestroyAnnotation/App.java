package InitDestroyAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("init-destroy-demo1.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("init-destroy-demo1.xml");
		Hello hello = context.getBean("hello", Hello.class);
		hello.test();
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
