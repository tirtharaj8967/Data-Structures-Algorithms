package com.learn.DSA.Easy;

import java.util.Arrays;

public class Right_rotate_an_array {
//	Input: N = 7, array[] = {1,2,3,4,5,6,7} , d = 3
//			Output: 5 6 7 1 2 3 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7} ;
		System.out.println(Arrays.toString(rotate(arr,3)));
	}

	public static int[] rotate(int[] arr, int d) {
		int count = arr.length - d;
		for (int i = arr.length; i > count; i--) {
			int last=arr[arr.length-1];
			int j=arr.length-1;
			while(j-1>=0) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[0]=last;
		}
		return arr;
	}
}
