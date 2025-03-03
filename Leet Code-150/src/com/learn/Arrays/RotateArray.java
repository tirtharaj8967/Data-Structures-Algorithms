package com.learn.Arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		rotate(nums,3);

	}
	
	public static  void rotate(int[] nums, int k) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			int max=nums.length-1-i;
			int temp=nums[i];
			nums[i]=nums[max];
			nums[max]=temp;
			count++;
			if(count>=k) {
				break;
			}
		}
	
	}
	
	

}
