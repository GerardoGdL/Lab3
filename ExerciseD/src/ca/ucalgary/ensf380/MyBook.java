package ca.ucalgary.ensf380;

public class MyBook {

	public static void main(String[] args) {
		Author author1 = new Author("Grant Mcfarlane", "123 avenue street", 35); //Author created
		System.out.println("Author 1\nName: " + author1.getName() + "\nAddress: " + author1.getAddress() + "\nAge: " + author1.getAge());
		Author[] authorsArray1 = new Author[2]; //List of authors
		System.out.print("Array: ");
		for (int i = 0; i < 2; i++) {
			System.out.print(authorsArray1[i]);
		}
		authorsArray1[0] = author1; //Author is added to the list
		System.out.print("Array: ");
		for (int i = 0; i < 2; i++) {
			System.out.print(authorsArray1[i]);
		}
		Novel novel1 = new Novel(); //Novel is created
		
		//Author writes the novel
		
		System.out.println("Writing the novel...");
		novel1.setTheAuthor(authorsArray1); //Author is credited
		novel1.coverArt(); //Cover art function
		novel1.genre(); //Genre function
		novel1.setIsbn("3000"); //ISBN set
		novel1.setPublicationYear(2020); //Publication year is given
		novel1.setPages(400); //Number of pages
		System.out.println("Writing \"The First Adventure\" complete");
		
		System.out.println("Novel1\nAuthors: "+ novel1.getTheAuthor() + "\nSeries: " + novel1.getMySeries());
		
		//Second author joins
		
		Author author2 = new Author("Billy Bob", "125 street avenue", 30); //Second author created
		System.out.println("Author 2\nName: " + author2.getName() + "\nAddress: " + author2.getAddress() + "\nAge: " + author2.getAge());
		authorsArray1[1] = author2; //Second author is added to the array
		for (int i = 0; i < 2; i++) {
			System.out.print(authorsArray1[i]);
		}
		
		//Authors begin cowriting the novel
		
		Novel novel2 = new Novel(); //Novel is created
		System.out.println("Writing the novel...");
		novel2.setTheAuthor(authorsArray1); //Authors are credited
		novel2.coverArt(); //Cover art function
		novel2.genre(); //Genre function
		novel2.setIsbn("3001"); //ISBN set
		novel2.setPublicationYear(2021); //Publication year is given
		novel2.setPages(500); //Number of pages
		System.out.println("Writing \"The Second Adventure\" complete");
		
		System.out.println("Novel2\nAuthors: "+ novel2.getTheAuthor() + "\nSeries: " + novel2.getMySeries());
		
		//Series is created as a sequel is written
		
		Series series1 = new Series();
		series1.setSeriesName("The Great Adventures"); //Series is created
		System.out.println("Name: " + series1.getSeriesName());
		System.out.println("Adding the books to the series called \"The Great Adventures\"...");
		novel1.setMySeries(series1); //First book is added to the series
		novel2.setMySeries(series1); //Second book is added to the series
		System.out.println("Both books are now part of the series");
		System.out.println("Novel1\nAuthors: "+ novel1.getTheAuthor() + "\nSeries: " + novel1.getMySeries());
		System.out.println("Novel2\nAuthors: "+ novel2.getTheAuthor() + "\nSeries: " + novel2.getMySeries());
	}

}
