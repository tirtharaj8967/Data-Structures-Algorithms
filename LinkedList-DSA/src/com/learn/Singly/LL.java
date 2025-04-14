package com.learn.Singly;

public class LL {

	private Node head;
	private Node tail;
	private int size;

	// insert in the first
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	// insert at Last
	public void insertLast(int val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		node.next = null;
		tail.next = node;
		tail = node;
		size++;
	}

	// Insert at particular index
	public void insertAt(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		Node temp = head;
		Node temp2;
		int count = 0;
		while (temp != null) {
			count++;
			temp2 = temp.next;
			if (count == index) {
				temp.next = node;
				node.next = temp2;
			}
			temp = temp.next;
		}
		size++;

	}

	// Delete First
	public void deleteFirst() {

		head = head.next;
		if (head == null)
			tail = null;
		size--;
	}

	// Delete Last
	public void deleteLast() {
		Node temp=head;
		Node secondlast = getNode(size-2);
		tail=secondlast;
		tail.next=null;
		size--;
	}
	// Delete from Index

	public void deleteAt(int index) {
		if(index==0) {
			deleteFirst();
		}else if(index==size-1) {
			deleteLast();
		}
		Node prev= getNode(index-1);
		Node next= getNode(index+1);
		prev.next=next;
		size--;
	}
	// Display at particular index
	public Node getNode(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		System.out.println(temp.val);
		return temp;
	}

//	Display the List
	public void displayLL() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
	}

	private class Node {
		private int val;
		private Node next;

		private Node(int val) {
			this.val = val;
		}

		private Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}
}
