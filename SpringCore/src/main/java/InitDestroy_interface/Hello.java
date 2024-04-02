package InitDestroy_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Hello implements InitializingBean, DisposableBean {

	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init() Method");
		
	}
	
	public void test() {
		System.out.println("Inside test() Method");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy() Method");
		
	}

}
