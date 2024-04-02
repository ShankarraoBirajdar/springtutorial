package SetterInjectionwithDependentObject;

//Java Program to Illustrate Employee Class
//Class
class Employee {

	// Class member members
	private String name;
	private String employeeID;
	private String department;
	private Address address;

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	// Setter
	public void setemployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	// Setter
	public void setdepartment(String department) {
		this.department = department;
	}

	// Setter
	public void setAddress(Address address) {
		this.address = address;
	}

	// Getter
	public String getName() {
		return name;
	}

	// Getter
	public String getEmployeeID() {
		return employeeID;
	}

	// Getter
	public String getDepartment() {
		return department;
	}

	// Getter
	public Address getAddress() {
		return address;
	}

	// Method
	public void display() {
		// Print statements
		System.out.println("Name: " + getName());
		System.out.println("Employee ID: " + getEmployeeID());
		System.out.println("Department: " + getDepartment());
		System.out.println("Address: " + getAddress().toString());
	}
}
