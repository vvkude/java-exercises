package edu.vvkude.exercises;

public class Human {
	int age;
	boolean validate(int age, String numberAsString) {
		boolean result = false;
		if (age > this.age) {
			boolean regex = numberAsString.matches("[0-9]{3}\\-[0-9]{4}");
			// store age and regex
			result = regex;
		}
		return result;
	}
	void looping() {
		int aValue = 10;
		for (int aCtr = 0; aCtr < 7; aCtr++) {
			switch(aCtr) {
			case 4 : {
						double result = aValue / aCtr;
						System.out.println(result);
						break;
					 }
			}
		}
	}

public static void main(String[] args) {
	Human human = new Human();
	human.age = -434566;
	System.out.println(human.age);
}
}