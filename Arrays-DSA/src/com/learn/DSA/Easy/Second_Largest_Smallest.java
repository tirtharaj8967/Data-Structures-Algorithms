package com.learn.DSA.Easy;

public class Second_Largest_Smallest {

	public static void main(String[] args) {
//		Find the second largest and second smallest elements in an array.

		//Solve using Arrays.sort... it would be easier
		int[] arr = { 10, 60, 20, 30, 5, 8, 40, 50 };
		System.out.println(secondSmallest(arr));
	}

	public static int secondSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < smallest) {
			    secondSmallest = smallest; 
			    smallest = num; 
			} else if (num > smallest && num < secondSmallest) {
			    secondSmallest = num;
			}
		}
		return secondSmallest;
	}

}
