package com.learn.DSA.Easy;

public class Check_Sorted {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 5, 7, 3, 17, 1, 45, 8 };
		int[] arr1 = { 10, 20,30,40 };
		System.out.println(checkSort(arr1));
	}
	
	public static boolean checkSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<=arr[i-1]) {
				return false;
			}
		}
		return true;
	}

}
