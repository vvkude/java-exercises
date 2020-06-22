package edu.vvkude.exercises;

public class StudentVariables {
	private double marks1, marks2, marks3; // We do not want student marks accessed directly
	private double maxMarks = 100; // Maximum scores for a class should not be directly mutable
	private double avg = 0;
	
	public double getAverage() {
		// We should consider replacing the denominator with the length of an array
		// This way, we will not have to directly adjust the multiplier if there are more tests
		
		if (maxMarks > 0) {
			avg = (marks1 + marks2 + marks3)/(maxMarks*3) * 100;
			return avg;
		}
		else {
			avg = 0;
			return avg;
		}
	}
		

	
	

	
}
