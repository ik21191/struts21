package mypack.beans;
public class Address 
{
	private String street,city;
	
	public Address() {
		System.out.println("Address constructor is called.");
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
	
}
