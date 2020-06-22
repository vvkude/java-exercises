package edu.vvkude.exercises;

public class Employee {
	String name;
	int age;
	public void printEmp() {
		System.out.println("Name is " + name + " age is " + age);
	}
}
class Office {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.printEmp();
	}
}
