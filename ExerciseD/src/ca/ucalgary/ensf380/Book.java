package ca.ucalgary.ensf380;

abstract class Book {
	private String isbn;
	private int publicationYear;
	private int pages;
	
	Book(){
		;
	}
	
	Book(String isbn, int pages){
		this.isbn = isbn;
		this.pages = pages;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getPublicationYear() {
		return this.publicationYear;
	}
	
	public void setPublicationYear(int year) {
		this.publicationYear = year;
	}
	
	public int getPages() {
		return this.pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
}
