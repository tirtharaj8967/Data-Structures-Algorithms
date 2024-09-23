package com.tirtha.Linear_Search;

public class SearchInRange {

	public static void main(String[] args) {

		int[] arr = {4,5,6,7,8,9,12,45,56,42,41,52,51,47,86};
		int start=2;
		int end=10;
		int target=45;
		boolean value=linearSearch(arr,start, end, 42);
		System.out.println(value);
	}

	static boolean linearSearch(int[] arr, int start, int end, int target) {
		if (arr.length == 0) {
			return false;
		} else {
			for (int i = start; i <= end; i++) {
				if (arr[i] == target) {
					return true;
				}
			}
			return false;
		}
	}

}
