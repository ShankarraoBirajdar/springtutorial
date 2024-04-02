package ScopeAnnotation;

public class Laptop extends Device{ 
	
	private boolean touchScreen; 

	public Laptop() { 
		super(); 
	} 

	public Laptop(String name, double price) { 
		super(name, price); 
	} 

	public boolean isTouchScreen() { 
		return touchScreen; 
	} 

	public void setTouchScreen(boolean touchScreen) { 
		this.touchScreen = touchScreen; 
	} 

}

