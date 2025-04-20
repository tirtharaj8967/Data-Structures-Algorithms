package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PracticeClass {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 2;
		findMaxSum(arr, k);

	}

	public static void findMaxSum(int[] arr, int k) {
		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		int maxSum=windowSum;
		for(int j=k;j<arr.length;j++) {
			windowSum += arr[j]- arr[j-k];
			if(windowSum> maxSum) maxSum= windowSum;
		}
		System.out.println(maxSum);
	}

}
