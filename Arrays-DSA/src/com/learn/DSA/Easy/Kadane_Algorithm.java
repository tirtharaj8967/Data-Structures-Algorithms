package com.learn.DSA.Easy;

public class Kadane_Algorithm {

	public static void main(String[] args) {
		int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
		System.out.println(findSum(arr));
		System.out.println(findSumKadane(arr));
	}

//	Using Brute Force
	public static int findSum(int[] arr) {
		int sum = 0;
		for (int start = 0; start < arr.length; start++) {
			int current = 0;
			for (int j = start; j < arr.length; j++) {
				current += arr[j];
				if (current > sum) {
					sum = current;
				}
			}
		}
		return sum;
	}
	
//	Using Kadanes Algo
	
	public static int findSumKadane(int[] arr) {
		int currentSum=0, maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			currentSum +=arr[i];
			maxSum =Math.max(maxSum, currentSum);
			if(currentSum<0) {
				currentSum=0;
			}
		}
		return maxSum;
	}

}
