package com.tirtha.Binary_Search;

public class Floor_of_a_Number {
	// Find the smallest number smaller or equal to the target element
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int target = 21;
		int value = floorOfNumber(arr, target);
		System.out.println(value);
	}

	static int floorOfNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else if (target == arr[mid]) {
				return arr[mid];
			}

		}
		return arr[end];
	}

}
