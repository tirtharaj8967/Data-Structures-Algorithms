package com.practice.List;

public class LL {
	private Node head;
	private Node tail;
	private int size;

	private class Node {
		private int val;
		private Node next;

		private Node(int val) {
			this.val = val;
		}

		private Node(int val, Node next) {
			this.next = next;
		}
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
			tail.next = null;
		}

		size++;
	}

	// it will work as insertlast
	public void add(int val) {
		if (head == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
	}

	public void insertAt(int idx, int val) {
		if (tail == null) {
			add(val);
			return;
		}
		if (head == null) {
			insertFirst(val);
			return;
		}
		Node temp = head;
		int count = 1;
		while (count < idx) {
			count++;
			temp = temp.next;
		}
		Node node = new Node(val);
		// Storing the next value that should be the next of New created node
		Node temp2 = temp.next;
		temp.next = node;
		node.next = temp2;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}

	}

	public void deleteFirst() {
		head = head.next;
		size--;
	}

	public void deleteAt(int idx) {
		int count=1;
		Node temp=head;
		Node temp2=null;
		while(count<idx) {
			count++;
			temp2=temp;
			temp=temp.next;
		}
		temp2.next=temp.next;
		size--;
	}
	
	public void deleteVal(int val) {
		Node temp=head;
		int count=1;
		while(temp.next!=null) {
			if(temp.val == val) {
				
			}
		}
	}

	public void deleteLast() {
		Node temp = head;
		Node temp2=null;
		while(temp.next !=null) {
			temp2=temp;
			temp=temp.next;
		}
		tail=temp2;
		tail.next=null;
	}
}
