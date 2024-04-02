package DIMapObject;

//Class
public class Employee {

	// Class data members
	private String name;
	private String employeeID;
	private String department;

	public Employee(String name, String employeeID, String department) {
		// This keyword refers to current instance itself
		this.name = name;
		this.employeeID = employeeID;
		this.department = department;
	}

	// Method
	// Overriding toString() method
	public String toString() {
		return ("[" + name + "," + employeeID + "," + department + "]");
	}

}
