package com.learn.DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DLL dlist=new DLL();
		dlist.insertFirst(50);
		dlist.insertFirst(40);
		dlist.insertFirst(30);
		
		dlist.insertLast(100);
		dlist.displayDLL();
		dlist.displayRev();

	}

}
