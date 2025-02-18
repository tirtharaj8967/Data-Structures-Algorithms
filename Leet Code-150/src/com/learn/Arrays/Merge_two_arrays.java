package com.learn.Arrays;

import java.util.Arrays;

public class Merge_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2= {4,5,6};
		merge(nums1, 6,nums2,3);
	}

	public static  void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1, j = n-1;
		while (j>=0) {
			nums1[i--] = nums2[j--];
		}
		System.out.println( Arrays.toString(nums1));
	}
}
