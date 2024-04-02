package InitDestroy_interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Hello.class);
		Hello hello = context.getBean("hello", Hello.class);
		hello.test();
		
		//calling Close this application context, destroying all beans but after main thread completed his task
		context.registerShutdownHook();
	
		
		//calling destroy - Close this application context, destroying all beans
		context.close();
		
		

	}

}
