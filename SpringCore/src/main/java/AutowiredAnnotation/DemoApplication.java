package AutowiredAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AutowiredAnnotation.xml");
		City cty = context.getBean("city", City.class);
		
		//printing values from XML file
		cty.showCityDetails();
		
		cty.setId(2);
		cty.setName("Mumbai");
		State st = context.getBean("state", State.class);
		st.setName("Maharashtra");
		cty.setState(st);
		cty.showCityDetails();
		
		context.close();
	}
}
