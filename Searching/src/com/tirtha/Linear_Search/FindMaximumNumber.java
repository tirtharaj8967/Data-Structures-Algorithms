package com.tirtha.Linear_Search;

public class FindMaximumNumber {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8,9,12,45,56,42,41,52,51,47,86,1};
		System.out.println(findMaximumNumber(arr));

	}
	static int findMaximumNumber(int[] arr) {
		int max=arr[0];
		for(int i =0; i<arr.length; i++) {
			if(max< arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
