package com.learn.DSA.Medium;

import java.util.HashMap;

public class Find_Majority_Element {

	public static void main(String[] args) {
//		Find the Majority Element (Boyer-Moore Voting Algorithm)
//			Given an array, find the element that appears more than n/2 times.

		int[] arr = { 3, 1, 1, 1, 2 };
		int result = findMajor(arr);
		System.out.println("Majority Element: " + result);
	}

	// brute force
	public static int findMajorityElement(int[] arr) {
		int maxEl = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count >= arr.length / 2)
				maxEl = arr[i];
		}
		return maxEl;
	}

	public static int findMajor(int[] arr) {

		int count = 0;
		int candidate = arr[0];

		for (int num : arr) {
			if (count == 0) {
				candidate = num;
				count = 1;
			}
			if (num == candidate) {
				count++;
			} else {
				count--;
			}
		}
		return candidate;
	}

}
