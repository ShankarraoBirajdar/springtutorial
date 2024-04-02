package AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

class City {
	private int id;
	private String name;
	private State s;

//	@Autowired add Autowired annotation here for autowire="constructor"
	public City(int id, String name, State s) {
		super();
		this.id = id;
		this.name = name;
		this.s = s;
	}

	public int getID() {
		return id;
	}

	public void setId(int eid) {
		this.id = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String st) {
		this.name = st;
	}

	public State getState() {
		return s;
	}

//	@Autowired add Autowired annotation here for setter
	public void setState(State sta) {
		this.s = sta;
	}

	public void showCityDetails() {
		System.out.println("City Id : " + id);
		System.out.println("City Name : " + name);
		System.out.println("State : " + s.getName());
	}
}
