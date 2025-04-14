package com.practice.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list= new LL();
		list.insertFirst(3);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(11);
		list.insertAt( 2,7);
		list.display();
		System.out.println();
//		list.deleteFirst();
//		list.deleteLast();
		list.deleteAt(2);
		list.display();

	}

}
