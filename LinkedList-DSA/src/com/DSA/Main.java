package com.DSA;

public class Main {

	public static void main(String[] args) {
		LL ll = new LL();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(30);
		ll.insertFirst(40);
		ll.insertLast(50);
		ll.insertAt(100, 2);
//		ll.displayLL();
//		System.out.println();
//		ll.deleteFirst();
//		ll.displayLL();
//		System.out.println();
//		ll.deleteLast();
		ll.displayLL();
		System.out.println();
//		ll.deleteAt(2);
		ll.reverseIterate();
		ll.displayLL();
	}

}
