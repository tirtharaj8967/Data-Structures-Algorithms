package com.practice;

public class PracticeClass {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 114, 117, 119 };
		int target = 90;
		int index = binarySearch(arr, target);
		System.out.println(index);
	}

	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
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
