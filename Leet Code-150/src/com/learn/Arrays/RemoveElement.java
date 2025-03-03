package com.learn.Arrays;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,3};
		System.out.println(removeElement(nums,2));
	}
	 public static int removeElement(int[] nums, int val) {
		 int count=0;
		 for(int i=0;i<nums.length; i++) {
			 if(val !=nums[i]) {
				 count++;
			 }
		 }
		 Arrays.sort(nums);
		 return count;
	 }

		/*
		 * public static int[] removeElementArray(int[] nums, int val) {
		 * 
		 * }
		 */

}
