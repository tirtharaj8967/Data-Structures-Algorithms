package com.learn.DSA.Easy;

import java.util.Arrays;

public class Find_Kth_Element {
//	Find the kth smallest and kth largest element in an array.
	public static void main(String[] args) {
		int[] arr = { 20, 10, 5, 7, 3, 17, 1, 45, 8 };

		findLargestSmallest (arr,3);
		
//		System.out.println(findKthLargest(arr, 6));
//		System.out.println(findKthSmallest(arr, 3));
	}
	public static void findLargestSmallest(int[] arr, int k) {
		int start=0;
		int end=arr.length-1;
		while(end>=start) {
			start++;
			end--;
			if(start== k-1) {
				System.out.println(arr[start]+ "  "+ arr[end]);
				return;
			}
		}
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
