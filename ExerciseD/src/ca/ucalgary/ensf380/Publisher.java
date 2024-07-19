package ca.ucalgary.ensf380;

public class Publisher {
	private String name;
	private String address;
	private Classic[] classicsCatalog;
	
	Publisher(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public String printLetterHead() {
		return "Method printLetterHead called from Publisher";
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
	
	public Classic[] getClassicsCatalog() {
		return this.classicsCatalog;
	}
	
	public void setClassicsCatalog(Classic[] classics) {
		this.classicsCatalog = classics;
	}
}
