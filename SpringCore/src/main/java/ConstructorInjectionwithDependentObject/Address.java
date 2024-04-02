package ConstructorInjectionwithDependentObject;

//Java Program to Illustrate Address Class

//Class
public class Address {

	// Class data members
	private String houseNo;
	private String pincode;
	private String state;
	private String country;

	public Address(String houseNo, String pincode, String state, String country) {
		super();
		this.houseNo = houseNo;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}



	// Method
	// Overriding toString() method
	public String toString() {
		return "[" + houseNo + "," + pincode + "," + state + "," + country + "]";
	}
}
