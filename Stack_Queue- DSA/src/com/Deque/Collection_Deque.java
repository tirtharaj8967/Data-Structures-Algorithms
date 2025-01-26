package com.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Collection_Deque {

	public static void main(String[] args) {
		//Insert and Delete from both Side
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.addFirst(50);
		deque.addFirst(70);
		deque.addFirst(10);
		deque.addLast(20);
		deque.addLast(100);
		deque.addLast(1);
		
		
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());

	}

}
