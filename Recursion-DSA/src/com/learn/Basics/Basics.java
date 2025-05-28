package com.learn.Basics;

public class Basics {

	public static void main(String[] args) {
		//Print hello world 5times
		System.out.println( printFibo(4));
	}
//	static void print(int n) {
//		System.out.println(n);
//		if(n+1 <=5) {
//			print (n+1);
//		}
//	}
static int printFibo(int n) {
	
	if(n==0 || n==1) {
		return n;
	}
		return printFibo(n-1) + printFibo(n-2);
}

}
