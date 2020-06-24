package edu.vvkude.exercises;
// Assignment: implement a class for a stack of integers


public class TestIntegerStack {

	public static void main(String[] args) {
		IntegerStack stack = new IntegerStack();
		
		for (int i = 0; i < 10; i++)
			stack.push(i);
		
		while (!stack.empty())
			System.out.print(stack.pop() + " ");

	}



	static class IntegerStack { // TODO remove static access modifier when moving to new file
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
	    // When the stack is over a certain size, make a new array and copy the elements to it
	    public void push(int value) {
	    	if(size >= elements.length) {
	    		int[] temp = new int[elements.length * 2];
	    		System.arraycopy(elements,  0,  temp,  0,  elements.length);
	    		elements = temp;
	    	}
	    	
	    	elements[size++] = value;
	    }
	    
	    // TODO make a way to return and remove the top element of the stack
	    public int pop() {
	    	return elements[--size];
	    }
	    
	    // TODO make a way to peek at the top element of the stack
	    public int peek() {
	    	return elements[size - 1];
	    }
	    
	    // TODO make a way to determine whether the stack is empty, or not
	    public boolean empty() {
	    	return size == 0;
	    }
	    
	    // TODO make a way to return all the elements in the stack
	    public int getSize() {
	    	return size;
	    }
    }
} // TODO move IntegerStack class to its own file