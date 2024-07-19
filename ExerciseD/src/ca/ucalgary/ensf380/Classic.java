package ca.ucalgary.ensf380;

class Classic extends Hardcover{
	private int origPubYear = 1860;
	private Author theAuthor;
	private Publisher[] bookPublisher;
	
	public String createNotes() {
		return "Method createNotes called from Classic";
	}
	
	public int getOrigPubYear() {
		return this.origPubYear;
	}
	
	public void setOrigPubYear(int year) {
		this.origPubYear = year;
	}
	
	public Author getTheAuthor() {
		return this.theAuthor;
	}
	
	public void setTheAuthor(Author author) {
		this.theAuthor = author;
	}
	
	public Publisher[] getBookPublisher() {
		return this.bookPublisher;
	}
	
	public void setBookPublisher(Publisher[] pub) {
		this.bookPublisher = pub;
	}
	
	public String binding() {
		return "Method binding called from Classic";
	}
}
