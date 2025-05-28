package com.DSA;

public class LL {
	Node head;
	Node tail;
	int size;
	public void insertFirst(int val) {
		Node node= new Node(val);
		node.next=head;
		head=node;
		if(tail == null) tail=head;	
		size++;
	}
	public void insertLast(int val) {
		Node node=new Node(val);
		if(tail == null) {
			insertFirst(val);
			return;
		}
		tail.next=node;
		tail=node;
		size++;
	}
	public void insertAt(int val, int idx) {
		int count=1;
		Node temp=head;
		while(count < idx) {
			count++;
			temp=temp.next;
		}
		Node node= new Node(val,temp.next);
		temp.next=node;
		
	}
	public void deleteFirst() {
		head=head.next;
		size--;
	}
	public void deleteLast() {
		Node temp=head;
		Node prev = null;
		while(temp.next !=null) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		tail=prev;
		size--;
	}
	public void deleteAt(int idx) {
		if(idx==0) {
			deleteFirst();
			return;
		}
		if(idx==size-1) {
			deleteLast();
		}
		Node prev=getNode(idx-1);
		Node temp=head;
		while(temp != prev) {
			temp=temp.next;
		}
		temp.next=prev.next.next;
		size--;
	}
	public Node getNode(int idx) {
		Node temp=head;
		while(idx !=0) {
			idx--;
			temp=temp.next;
		}
		return temp;
	}
	public void displayLL() {
		Node temp=head;
		while(temp !=null) {
			System.out.print(temp.val+"-> ");
			temp=temp.next;
		}
	}
	
	public void reverseIterate() {
		Node prev=head;
		Node current=head.next;
		while(current !=null) {
			Node next=current.next;
			current.next=prev;
			
			prev=current;
			current=next;
		}
		head.next=null;
		tail=head;
		head=prev;
	}
	public Node detectCycle() {
		Node slow=head;
		Node fast=head.next;
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow.equals(fast)) return slow;
		}
		return null;
	}
	public Node startingCycyle() {
		Node meet= detectCycle();
		Node temp=head;
		while(temp !=meet) {
			temp=temp.next;
			meet=meet.next;
		}
		return meet;
	}
	
	private class Node {
		private int val;
		private Node next;

		private Node(int val) {
			this.val=val;
		}

		private Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}
}


