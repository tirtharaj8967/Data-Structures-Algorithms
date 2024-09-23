package com.tirtha.Binary_Search;

public class Basic {

	// Find an element in the array using Binary Search
	
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 25 };
		int target = 25;
		int index = binarySearch(arr, target);
		System.out.println(index);

	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (end >= start) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else if (target == arr[mid]) {
				return mid;
			}
		}
		return -1;
	}

}
