package practice;

public class Address {
	private String drno ;
	private String street;
	private String city;
	private int pincode;
	public Address() {
		// TODO Auto-generated constructor stub
		drno ="3-34";
		street="durga nagar";
		city="Rajavommangi";
		pincode=433436;
		
	}
	public String getDrno() {
		return drno;
	}
	public void setDrno(String drno) {
		this.drno = drno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String toString() {
		return"Address  "+this.drno+","+this.street+","+this.city+","+this.pincode;
	}

}
