package com.learn.DSA.Easy;

public class Find_sum_closest_to_zero {

//	Find the two elements whose sum is closest to zero.
	public static void main(String[] args) {
		int[] arr = { -8, 5, 2, -6 };
		System.out.println(findSum(arr));
//		findSum(arr);
	}

	public static int findSum(int[] arr) {
		int smallest =Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					int val = arr[i] + arr[j];
						if(Math.abs(val) < Math.abs(smallest)) {
							smallest= val;
						}
				}
			}
			
		}
		return smallest;
	}

}
