package com.stack;

import java.util.Stack;

public class Collection_Stack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(2);
		stack.push(12);
		
		//Last item to add is 12 so first item it is removing is 12.
		//Following LIFO 
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
		System.out.println(stack);

	}

}
