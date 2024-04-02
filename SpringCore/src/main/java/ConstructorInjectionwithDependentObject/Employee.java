package ConstructorInjectionwithDependentObject;

//Java Program to Illustrate Employee Class
//Class
class Employee {

	// Class member members
	private String name;
	private String employeeID;
	private String department;
	private Address address;

	
	public Employee(String name, String employeeID, String department, Address address) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		this.department = department;
		this.address = address;
	}


	// Method
	 public void display()
	    {
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + employeeID);
	        System.out.println("Department: " + department);
	        System.out.println("Address: " + address);
	    }
}
