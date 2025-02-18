package com.tirtha.SelectionSort;

import java.util.Arrays;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		sortArray(arr);
	}

	public static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int smallestIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[smallestIdx]) {
					int temp = arr[j];
					arr[j] = arr[smallestIdx];
					arr[smallestIdx] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}
