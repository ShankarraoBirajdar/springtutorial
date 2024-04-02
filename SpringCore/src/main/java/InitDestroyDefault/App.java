package InitDestroyDefault;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("init-destroy-demo3.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("init-destroy-demo3.xml");
		Hello hello = context.getBean("hello", Hello.class);
		hello.test();
		
		Hi hi = context.getBean("hi", Hi.class);
		hi.test();
		
		Bye bye = context.getBean("bye", Bye.class);
		bye.test();
		
		context.close();
		

	}

}
