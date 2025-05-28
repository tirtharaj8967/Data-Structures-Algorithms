package com.learn.Singly;

public class Main {

	public static void main(String[] args) {
		LL list = new LL();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
//		list.displayLL();
		System.out.println();
		
		list.insertLast(5);
//		list.displayLL();
		System.out.println();
		
		list.insertAt(50, 0);
		list.insertAt(70, 4);
		list.displayLL();
		System.out.println();
		
//		list.deleteFirst();
//		list.displayLL();
		
//		list.getNode(4);
		
//		list.deleteLast();
//		list.displayLL();
		
//		list.deleteAt(3);
//		list.displayLL();
	}

}
