package InitDestroyXML;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Hello{

	

	public void init() throws Exception {
		System.out.println("Inside init() Method");
		
	}
	
	public void test() {
		System.out.println("Inside test() Method of Hello");
	}
	
	public void destroy() throws Exception {
		System.out.println("Inside destroy() Method");
		
	}

}
