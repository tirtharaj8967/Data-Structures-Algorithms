package com.learn.DSA.Medium;

public class Find_the_longest_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, -2, 5 };

	}

	public static int findLongestSubarray(int[] arr, int k) {
	
		int maxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum +=arr[j];
			}
			if(sum ==k) {
				return 0;
			}
		}
		return 0;
	}

}
