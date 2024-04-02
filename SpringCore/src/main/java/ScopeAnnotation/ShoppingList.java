package ScopeAnnotation; 

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 

@Component
@Scope("prototype") //by default is singleton
public class ShoppingList { 
	
	private List<Device> items = new ArrayList<>(); 

	public void addItem(Device item) { 
		items.add(item); 
	} 

	public List<Device> getItems() { 
		return items; 
	} 

} 

