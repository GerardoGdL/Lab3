package ca.ucalgary.ensf380;

public class Contract {
	private String date;
	private Publisher publisherInfo;
	private Author[] authorInfo;
	
	Contract(String date, Publisher publisherInfo, Author[] authorInfo){
		this.date = date;
		this.publisherInfo = publisherInfo;
		this.authorInfo = authorInfo;
	}
	
	public String printContract() {
		return "Method printContract called from Contract";
	}
	
	public String getdate() {
		return this.date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public Publisher getPublisherInfo() {
		return this.publisherInfo;
	}
	
	public void setPublisherInfo(Publisher info) {
		this.publisherInfo = info;
	}
	
	public Author[] getAuthorInfo() {
		return this.authorInfo;
	}
	
	public void setAuthorInfo(Author[] info) {
		this.authorInfo = info;
	}
	
}
