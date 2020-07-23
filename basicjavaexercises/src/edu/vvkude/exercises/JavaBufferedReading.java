package edu.vvkude.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class JavaBufferedReading {

	public static void main(String... args) {
		// TODO - Probably make an ArrayList to hold the information once it's read in from the csv
		// TODO - main method should consume the csv file and print out individual elements from it
		List<Book> books = readBooks("//Users//vkudesia//bookAuthors.csv");
		
		// Display all of the authors read from the CSV file
		for (Book b : books) {
			System.out.println(b);
		}

	}
	
	private static List<Book> readBooks(String fileName) {
		List<Book> books = new ArrayList<>();
		Path filePath = Paths.get(fileName);
		
		// TODO - create a BufferedReader instance

		// TODO - implement the BufferedReader using a try-with-resources statement to ensure object closure (?)
		// => "any object that implements java.lang.AutoCloseable can be used as a resource"
		// => "all objects which implement java.io.Closeable implement java.lang.AutoCloseable"
		try (BufferedReader br = Files.newBufferedReader(filePath, StandardCharsets.US_ASCII)){
			
			// read in first line from our CSV
			String line = br.readLine();
			
			// loop until null referene marking end of file
			while (line != null) {
				
				// TODO - use String.split() to load a string array with the values from the csv
				// indicate a comma as our delimeter
				String[] elements = line.split(",");
				
				// TODO - Create a java class to represent our book objects
				Book book = createBook(elements);
				
				// Add to our ArrayList
				books.add(book);
				
				// TODO - determine if it's best to read the next line before looping?
				line = br.readLine();
			} // TODO - catch IOException
		} catch (IOException inputOutputError) {
			inputOutputError.printStackTrace();
		}
		
		// send the data back to our interface "books"
		return books;
	}
	
	private static Book createBook(String[] bookmeta) {
		String name = bookmeta[0];
		// TODO - make price a float so that the value can be precise
		int price = Integer.parseInt(bookmeta[1]);
		String author = bookmeta[2];
		
		// create a "book" object with this metadata and return it
		return new Book(name, price, author);
	}

}

//TODO - create a java class that will represent the data elements from our csv file and will implement getters and setters
class Book {
	private String name;
	// TODO - make price a float so that the value can be precise
	private int price;
	private String author;
	
	public Book(String name, int price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor() {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ". author=" + author + "]";
	}
}




































