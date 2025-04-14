package com.learn.DSA.Medium;

public class First_Last_occurence_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: arr = {2, 4, 4, 4, 6, 8}, target = 4  
//				Output: [1, 3]

		int[] arr = { 2, 4, 4, 4, 6, 8 };
		findFirst(arr,4);
		findLast(arr, 4);
	}

	public static void findFirst(int[] arr, int target) {
		int start=0, end=arr.length-1,idx=0;
		while(end >=start) {
			int mid=start+ (end-start)/2;
			if(arr[mid]==target) {
				idx=mid;
				end=mid-1;
			}else if(arr[mid] > target) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		System.out.println(idx);
	}
	public static void findLast(int[] arr, int target) {
		int start=0, end=arr.length-1, mid=0,idx=0;
		while(end >=start) {
			mid=start+ (end-start)/2;
			if(arr[mid]==target) {
				idx=mid;
				start=mid+1;
			}else if(arr[mid] > target) {
				end=mid-1;
			}else if(arr[mid]<target) {
				start= mid+1;
			}
		}
		System.out.println(idx);
	}
}
