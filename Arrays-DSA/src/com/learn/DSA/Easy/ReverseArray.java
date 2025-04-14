package com.learn.DSA.Easy;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 5, 7, 3, 17, 1, 45, 8 };
		System.out.println(Arrays.toString(reverse(arr)));
		reverseArray(arr);
	}
	public static void reverseArray(int[] arr) {
		int start =0;
		int end=arr.length-1;
		while(end>=start) {
			int temp =arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int[] reverse(int[] arr) {
		int[] revArr = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			revArr[j] = arr[i];
			j++;
		}
		return revArr;
	}

}
