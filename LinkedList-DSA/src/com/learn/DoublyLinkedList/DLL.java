package com.learn.DoublyLinkedList;

public class DLL {

	private Node head;
	private Node tail;
	private int size;
	
	public void insertFirst(int val) {
		Node node= new Node(val);
		node.next=head;
		node.prev=null;
		if(head !=null) head.prev=node;
		head=node;
		size++;
	}
	
	public void insertLast(int val) {
		if(head==null) insertFirst(val);
		Node node = new Node(val);
		Node temp= head;
		while(temp!=null) {
			tail=temp;
			temp=temp.next;
		}
		tail.next=node;
		tail=node;
		size++;
	}
	public void displayDLL() {
		Node temp= head;
		while(temp!=null) {
			System.out.print(temp.val + "->");
			tail=temp;
			temp=temp.next;
		}
		System.out.println("End");
	}
	public void displayRev() {
		Node temp=tail;
		while(temp!=null) {
			System.out.println(temp.val+" <- " );
			temp=temp.prev;
		}
	}
	private class Node {
		int val;
		Node prev;
		Node next;

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node prev) {
			this.prev = prev;
			this.val = val;
		}

		Node(int val, Node next, Node prev) {
			this.val = val;
			this.prev = prev;
			this.next = next;
		}
	}

}
