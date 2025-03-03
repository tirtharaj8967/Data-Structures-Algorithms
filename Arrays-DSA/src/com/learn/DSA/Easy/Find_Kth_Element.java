package com.learn.DSA.Easy;

import java.util.Arrays;

public class Find_Kth_Element {
//	Find the kth smallest and kth largest element in an array.
	public static void main(String[] args) {
		int[] arr = { 20, 10, 5, 7, 3, 17, 1, 45, 8 };
		System.out.println(findKthLargest(arr, 6));
		System.out.println(findKthSmallest(arr, 3));
	}

	public static int findKthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k];
	}

	public static int findKthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}

}
