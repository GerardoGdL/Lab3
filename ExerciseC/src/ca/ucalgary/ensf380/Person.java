package ca.ucalgary.ensf380;

abstract class Person {

	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private static int lastPersonalNumber;
	
	public Person(String name, String phone, String email, Address add, int personalNum) {
		this.name = name;
		this.phoneNumber = phone;
		this.emailAddress = email;
		this.address = add;
		Person.lastPersonalNumber = personalNum;
	}
	
	protected static String nextPersonalNumber(short type) {
		return String.valueOf(Person.lastPersonalNumber + 1);
	}
	
	public boolean hasValidAddress() {
		return address.validate();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String num) {
		this.phoneNumber = num;
	}
	
	public void setEmailAddress(String email) {
		this.emailAddress = email;
	}
	
	public void setAddress(Address add) {
		this.address = add;
	}
	
	public void setLastPersonalNumber(int personal_num) {
		Person.lastPersonalNumber = personal_num;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public static int getLastPersonalNumber() {
		return lastPersonalNumber;
	}

}

