package com.learn.DSA.Easy;

import java.util.Arrays;

public class Find_Missing_Number {
//	Input: arr[] = [1, 2, 4, 6, 3, 7, 8] 
//			Output: 5
	public static void main(String[] args) {
		int[] arr= {1, 2, 4, 6, 3, 7, 8};
		System.out.println(find(arr));
	}
	
	public static int find(int[] arr) {
		int val=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if( (i+1)<arr.length-1) {
				if(arr[i]+1!=arr[i+1] )
				return arr[i]+1;
			}
		}
		return 0;
	}

}
