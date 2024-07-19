package ca.ucalgary.ensf380;

public class Author {
	private String name = "Unkown";
	private String address;
	private int age;
	
	Author(String name, String address, int age){
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	Author(){
		;
	}
	
	public String write() {
		return "Method write called from Author";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
