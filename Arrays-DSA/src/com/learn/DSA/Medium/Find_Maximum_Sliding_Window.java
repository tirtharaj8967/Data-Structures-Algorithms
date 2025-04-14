package com.learn.DSA.Medium;

public class Find_Maximum_Sliding_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2,  0, 9, 1, 5 };
//		findSum(arr);
		System.out.println(findMaxSum(arr, 3));
	}


	public static int findMaxSum(int[] arr, int k) {
		int n= arr.length;
		int maxSum=0;
		for(int i=0; i<k; i++) {
			maxSum +=arr[i];
		}
		int currentSum=maxSum;
		for(int i =k; i<arr.length; i++) {
			currentSum = currentSum + arr[i]-arr[i-k];
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
