package DIMapObject;

//Java Program to Illustrate Company Class

//Importing required classes

import java.util.*;

//Class
public class Company {

	// Class member variable
	private Map<Employee, Address> employees;

	// Constructor
	public Company(Map<Employee, Address> employees)
	{
		// This keyword refers to current instance itself
		this.employees = employees;
	}

	// Method
	public void display()
	{
		// Iterating over Map using for each loop
		for (Map.Entry<Employee, Address> entry :
			employees.entrySet()) {

			// Print statement
			System.out.println(
				"Employee Data ->"
				+ entry.getKey().toString() + " Address ->"
				+ entry.getValue().toString());
		}
	}
}
