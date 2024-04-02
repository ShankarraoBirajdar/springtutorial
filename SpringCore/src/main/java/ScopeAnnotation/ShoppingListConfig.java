package ScopeAnnotation;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.ComponentScan; 
import org.springframework.context.annotation.Configuration; 

@Configuration
@ComponentScan("ScopeAnnotation") 
public class ShoppingListConfig { 
	
	@Bean
	public Device lenovo() { 
		Laptop d1 = new Laptop(); 
		d1.setName("LENOVO"); 
		d1.setPrice(65000); 
		d1.setTouchScreen(true); 
		return d1; 
	} 
	
	@Bean
	public Device dell() { 
		Laptop d1 = new Laptop(); 
		d1.setName("DELL"); 
		d1.setPrice(57000); 
		d1.setTouchScreen(false); 
		return d1; 
	} 
	
	@Bean
	public Device moto() { 
		Mobile d2 = new Mobile(); 
		d2.setName("MOTOROLA"); 
		d2.setPrice(40000); 
		d2.setBatteryCapacity(4000); 
		return d2; 
	} 
	
	@Bean
	public Device iQ() { 
		Mobile d3 = new Mobile(); 
		d3.setName("iQOO"); 
		d3.setPrice(55000); 
		d3.setBatteryCapacity(4700); 
		return d3; 
	} 
}
