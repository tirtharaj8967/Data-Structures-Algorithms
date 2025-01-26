package com.stack;

public class CustomStack {

	int[] data;
	private static final int DEFAULT_VALUE = 10;
	private int ptr = -1;

	public CustomStack() {
		// Calling the next constructor using this keyword to create a default stack
		this(DEFAULT_VALUE);
	}

	public CustomStack(int size) {
		// TODO Auto-generated constructor stub
		data = new int[size];
	}

	public boolean push(int val) throws Exception {
		if(isFull()) {
//			throw new Exception("Stack is Full");
			System.out.println("Stack is full");
			return false;
		}
		ptr++;
		data[ptr] = val;
		return true;
	}

	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("Empty Stack");
		return data[ptr--];
	}

	 public int peek() throws Exception {
	        if (isEmpty()) {
	            throw new Exception("Cannot peek from an empty stack!!");
	        }
	        return data[ptr];
	    }

	public boolean isEmpty() {
		return ptr == -1;
	}

	public boolean isFull() {
		return ptr == data.length-1;
	}

}
