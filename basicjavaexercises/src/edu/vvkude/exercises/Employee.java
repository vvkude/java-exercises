package edu.vvkude.exercises;

public class Employee {
	private String name;
	private int age;
	
	public void setName(String val) {
		name = val;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int years) {
		if (years > 0)
		age = years;
	}
	
	public int getAge() {
		return age;
	}
	
	public int daysOffWork(int... days) {
		int daysOff = 0; //initialize value to 0
		for (int i = 0; i < days.length; i++)
			daysOff += days[i];
		return daysOff;
	}
}

// Directly setting object fields is bad practice. So, let's use getters and setters
class Office {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setName("Bananas");
		e1.setAge(27);
		e2.setName("Bojangles");
		e2.setAge(-33);
		String employeeName = e1.getName();
		int employeeAge = e1.getAge();
		String employerName = e2.getName();
		int employerAge = e2.getAge();
		System.out.println("Number of days off: " + e1.daysOffWork(1,2,3));
		System.out.println("Employee Name: " + employeeName + " Age: " + employeeAge);
		System.out.println("Employer Name: " + employerName + " Age: " + employerAge);
	}
}
