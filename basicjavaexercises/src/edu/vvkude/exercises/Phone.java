package edu.vvkude.exercises;

public class Phone {
	static boolean softKeyboard = true;
	
	public void setSoftKeyboard(boolean val) {
		softKeyboard = val;
	}
	
	public boolean getSoftKeyboard() {
		return softKeyboard;
	}
}
	
class TestPhone {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		p1.setSoftKeyboard(false);
		p2.setSoftKeyboard(true);
		boolean model1 = p1.getSoftKeyboard();
		boolean model2 = p2.getSoftKeyboard();
		System.out.println(model1); // Prints true
		System.out.println(model2); // Prints true
		p1.setSoftKeyboard(false);
		p2.setSoftKeyboard(false);
		System.out.println(model1); // Prints true
		System.out.println(model2); // Prints true
		Phone p3 = null;
		System.out.println(p3.softKeyboard); // Should not throw an exception
	}
}
