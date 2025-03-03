package com.learn.DSA.Easy;

import java.util.Arrays;

public class Dutch_National_Flag_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		System.out.println(Arrays.toString(sortArray(arr)));
	}
//Initializing the array indexes again
	public static int[] sortArray(int[] arr) {
		int c0 = 0, c1 = 0, c2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				c0++;
			else if (arr[i] == 1)
				c1++;
			else
				c2++;
		}
		int idx = 0;
		for(int i=0; i<c0;i++) {
			arr[idx++]=0;
		}
		for(int i=0; i<c1;i++) {
			arr[idx++]=1;
		}
		for(int i=0; i<c2;i++) {
			arr[idx++]=2;
		}
		return arr;
	}

}
