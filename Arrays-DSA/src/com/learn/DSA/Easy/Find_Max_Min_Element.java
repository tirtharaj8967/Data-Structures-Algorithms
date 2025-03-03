package com.learn.DSA.Easy;

public class Find_Max_Min_Element {

	public static void main(String[] args) {
		int[] arr = {20,10,5,7,3,17,1,45,8};
		System.out.println(findMax(arr));
		System.out.println(findMin(arr));
	}
	
	public static int findMax(int[] arr) {
		int max = 0;
		for(int i=1; i<=arr.length-1;i++) {
			if(arr[i]>arr[i-1]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=1; i<=arr.length-1;i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
