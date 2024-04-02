package SpringAnnotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	Student student1() {
		
		Student student = new Student("33","Kailas");	
		return student;
	}
	
	@Bean
	Student student2() {
		
		Student student = new Student();
		student.setAge("29");
		student.setName("Shankar");
		
		return student;
	}
}
