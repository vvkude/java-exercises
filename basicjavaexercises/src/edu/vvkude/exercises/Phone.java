package edu.vvkude.exercises;

public class Phone {
	static boolean softKeyboard = true;
}
	
// We should not set a static variable directly
class TestPhone{
	public static void main(String[] args) {
		Phone.softKeyboard = false;
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		System.out.println(p1.softKeyboard); // Prints false
		System.out.println(p2.softKeyboard); // Prints false
		p1.softKeyboard = true;
		System.out.println(p1.softKeyboard); // Prints true
		System.out.println(p2.softKeyboard); // Prints true
	}
}
