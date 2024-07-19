package ca.ucalgary.ensf380;

class Novel extends Fiction {
	private Author[] theAuthors;
	private Series mySeries;
	
	public String theme() {
		return "Method theme called from Novel";
	}
	
	public Author[] getTheAuthor() {
		return this.theAuthors;
	}
	
	public void setTheAuthor(Author[] authors) {
		this.theAuthors = authors;
	}
	
	public Series getMySeries() {
		return this.mySeries;
	}
	
	public void setMySeries(Series series) {
		this.mySeries = series;
	}
	
	public String coverArt() {
		return "Method coverArt called from Novel";
	}
}
