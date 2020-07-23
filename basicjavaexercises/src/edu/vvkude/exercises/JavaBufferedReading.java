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
		// We will use polymorphism in evoking a List interface and passing an ArrayList to it
		List<Book> books = readBooks("//Users//vkudesia//bookAuthors.csv");
		
		// Display all of the authors read from the CSV file, printed on their own lines
		for (Book b : books) {
			System.out.println(b);
		}

	}
	
	private static List<Book> readBooks(String fileName) {
		// We use a List interface so that the program will work as expected whether a LinkedList or ArrayList, etc is passed in
		List<Book> books = new ArrayList<>();
		Path filePath = Paths.get(fileName);

		// Implement the BufferedReader using a try-with-resources statement to ensure object closure
		// => "any object that implements java.lang.AutoCloseable can be used as a resource"
		// => "all objects which implement java.io.Closeable implement java.lang.AutoCloseable"
		try (BufferedReader br = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)){
			
			// Read in first line from our CSV
			String line = br.readLine();
			
			// Loop until null reference marking end of file
			while (line != null) {
				
				// Use String.split() to load a string array with the values from the csv
				// indicate a comma as our delimiter
				String[] elements = line.split(",");
				
				// A method from our Book class will handle representing the values from our CSV as meaningful data elements
				Book book = createBook(elements);
				
				// Add to our ArrayList
				books.add(book);
				
				// Read the next line before looping. If it's the end of the file, this will be null
				line = br.readLine();
			} // TODO - after catching an error, we could do something useful like printing out the last "good "value
		} catch (IOException inputOutputError) {
			inputOutputError.printStackTrace();
		}
		
		// send the data back to our List interface "books"
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

//This Book class will represent the data from our CSV
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