package com.learn.DSA.Easy;

import java.util.Arrays;

public class Left_rotate_an_array {

	public static void main(String[] args) {
		// 	Left rotate an array by d positions.
		int[] arr= {1, 2, 3};
		System.out.println(Arrays.toString(rotate(arr, 4)));
	}
	
	public static int[] rotate(int[] arr, int d) {
			for(int i=0; i<d;i++) {
				int first= arr[0];
				int j=0;
				while(j+1<arr.length) {
					arr[j]=arr[j+1];
					j++;
				}
				arr[arr.length-1]=first;
			}
			return arr;
	}

}
