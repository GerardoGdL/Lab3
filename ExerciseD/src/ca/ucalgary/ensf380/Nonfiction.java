package ca.ucalgary.ensf380;

class Nonfiction extends Paperback {
	private Category deweyClassification;
	
	public String topic() {
		return "Method topic called from Nonfiction";
	}
	
	public Category getDeweyClassification() {
		return this.deweyClassification;
	}
	
	public void setDeweyClassification(Category cat) {
		this.deweyClassification = cat;
	}
}
