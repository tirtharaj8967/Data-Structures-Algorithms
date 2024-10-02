package com.learn.Basics;

public class Basics {

	public static void main(String[] args) {
		//Print hello world 5times
		printHello(1);
	}
	static void printHello(int n) {
		if(n>5) {
			return;
		}
		System.out.println("Hello World");
		printHello(n+1);
	}

}
