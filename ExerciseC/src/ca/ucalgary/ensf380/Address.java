package ca.ucalgary.ensf380;

public class Address {

	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	public Address(String street, String city, String state, String postalCode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setPostalCode(String code) {
		this.postalCode = code;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public String getPostalCode() {
		return this.postalCode;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public boolean validate() {
		return (!street.isEmpty() && !city.isEmpty() && !state.isEmpty() && !postalCode.isEmpty() && !country.isEmpty());
	}
	
	public String outputAsLabel() {
		String result = String.format("%s street, %s, %s, %s, %s", street, city, state, postalCode, country);
		return result;
	}
}
