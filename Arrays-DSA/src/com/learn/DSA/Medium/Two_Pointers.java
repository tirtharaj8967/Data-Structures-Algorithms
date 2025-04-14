package com.learn.DSA.Medium;

import java.util.Arrays;

public class Two_Pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 8, 9, 11 };
		System.out.println(Arrays.toString( findPoints(arr, 12)));
	}

	public static int[] findPoints(int[] arr, int target) {
		int left = 0;
		int[] fArr = { -1, -1 };
		int right = arr.length-1;
	
		
		while (left<=right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				fArr[0] = arr[left];
				fArr[1] = arr[right];
				return fArr;
			}
			if (sum < target) {
				left++;
			} else if (sum > target) {
				right--;
			}
		}
		return fArr;
	}

}
