package com.queue;

public class CustomQueue {
	
	int[] data;
	private static final int DEFAULT_SIZE =10;
	int end=0;
	
	public CustomQueue() {
		data = new int[DEFAULT_SIZE];
	}
	
	CustomQueue(int size){
		data = new int[size];
	}
	
	public boolean add(int val) {
		if(isFull()) return false;
		data[end++]=val;
		return true;
	}
	
	public int remove() throws Exception {
		
		if(isEmpty()) throw new Exception("Empty Array");
		int removed = data[0];
		for(int i =1; i < data.length; i++) {
			data[i-1]=data[i];
		}
		end--;
		return removed;
	}
	
	public boolean isFull() {
		return data.length == end;
	}
	
	public boolean isEmpty() {
		return end==0;
	}

}
