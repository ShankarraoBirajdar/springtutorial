package InitDestroyAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Hello {

	@PostConstruct
	public void init(){
		System.out.println("Inside init() Method");
		
	}
	
	public void test() {
		System.out.println("Inside test() Method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy() Method");
		
	}

}
