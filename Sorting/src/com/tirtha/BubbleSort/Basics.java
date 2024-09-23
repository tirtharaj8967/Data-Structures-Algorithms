package com.tirtha.BubbleSort;

import java.util.Arrays;

public class Basics {

	public static void main(String[] args) {
		int[] arr = { 1, 23, 34, 21, 12, 89, 14, 18, 41 };
		sortArray(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void sortArray(int[] arr) {
		boolean swapped;
		// this loop will go untill the array is sorted..
		for (int i = 0; i < arr.length; i++) {
			swapped=false;
			// this loop will go from index 1st to index last-i
//			will check that the index element is bigger than the index -1 and swap accordingly
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped=true;
				}
				// swapped will check that. if an array is already sorted then no need to check for every i values
				if(swapped) {
					break;
				}
			}
		}
	}

}
