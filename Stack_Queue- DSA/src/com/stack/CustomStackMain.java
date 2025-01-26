package com.stack;

public class CustomStackMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		CustomStack stack = new CustomStack(5);
		DynamicStack stack = new DynamicStack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(2);
		stack.push(4);
		//this line will throw error in Custom Stack but in dynamic stack it will automatically double the size of the array
		stack.push(6);
		
		System.out.println( stack.pop());
		System.out.println( stack.pop());
		System.out.println( stack.pop());
		System.out.println( stack.pop());
		System.out.println( stack.pop());
		System.out.println( stack.pop());
	}
}
