package com.tirtha.Linear_Search;

public class FindMinimumNumber {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8,9,12,45,56,42,41,52,51,47,86,1};
		System.out.println(findMinimumNumber(arr));
	}
	static int findMinimumNumber(int[] arr) {
		int min=arr[0];
		for(int i =0; i<arr.length; i++) {
			if(min> arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}

}
