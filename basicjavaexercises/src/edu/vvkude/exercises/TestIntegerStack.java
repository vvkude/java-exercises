package edu.vvkude.exercises;
// Assignment: implement a class for a stack of integers


public class TestIntegerStack {

	public static void main(String[] args) {
		// TODO add no-arg call to create a default integer stack
		// TODO add a way to push to stack
		// TODO add a way to print a stack that is not empty
		// TODO what about a stack that has zero elements? 

	}



    public class IntegerStack {
	    private int[] elements;
	    private int size;
	    public static final int DEFAULT_CAPACITY = 16; // Start with a small, manageable number for testing
	    
	    /** Construct a default stack of 16 */
	    public IntegerStack() {
	    	this(DEFAULT_CAPACITY);
	    }
	    
	    /** Constructor for a stack with a specified capacity */
	    public IntegerStack(int capacity) {
	    	elements = new int[capacity];
	    }
	    
	    // TODO make a way to push a new integer to the top of the stack
	    
	    // TODO make a way to return and remove the top element of the stack
	    
	    // TODO make a way to peek at the top element of the stack
	    
	    // TODO make a way to determine whether the stack is empty, or not
	    
	    // TODO make a way to return all the elements in the stack
    }
}