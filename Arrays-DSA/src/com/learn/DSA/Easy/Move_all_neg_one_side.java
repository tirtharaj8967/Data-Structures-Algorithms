package com.learn.DSA.Easy;

import java.util.Arrays;

public class Move_all_neg_one_side {

	public static void main(String[] args) {
		int[] arr = { 20, -10, -5, 7, 3, 17, -1, -45, 8 };
		System.out.println(Arrays.toString(sortArray(arr)));
	}

	public static int[] sortArray(int[] arr) {
		int[] temp = new int[arr.length];
		int i = 0;
		for (int num : arr) {
			if (num < 0)
				temp[i++] = num;
			
		}

		for (int num : arr) {
			if (num >= 0)
				temp[i++] = num;
		
		}

		return temp;
	}
}
