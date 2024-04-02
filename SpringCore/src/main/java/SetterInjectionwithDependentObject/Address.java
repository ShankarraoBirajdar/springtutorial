package SetterInjectionwithDependentObject;

//Java Program to Illustrate Address Class

//Class
public class Address {

	// Class data members
	private String houseNo;
	private String pincode;
	private String state;
	private String country;

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// Method
	// Overriding toString() method
	public String toString() {
		return "[" + houseNo + "," + pincode + "," + state + "," + country + "]";
	}
}
