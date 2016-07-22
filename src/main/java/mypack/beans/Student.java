package mypack.beans;

public class Student {

	private String name;
	private Location address;
	
	public Student() {
		super();
	}
	public Student(String name, Location address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getAddress() {
		return address;
	}
	public void setAddress(Location address) {
		this.address = address;
	}
	
}
