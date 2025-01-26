package com.queue;

public class CustomQueueMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomQueue queue = new CustomQueue();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		for(int i  :  queue.data) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());

	

	}

}
