package com.learn.Arrays;

import java.util.Arrays;

public class Majority_Element {
	
	
	/*
	 * Initialize count = 0 and candidate = 0. Iterate through the array: If
	 * count==0, set candidate = nums[i].If nums[i]==candidate, increment
	 * count;otherwise, decrement count.The final value of candidate will be the
	 * majority element.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 3,2 };
		System.out.println(majoritySearch(nums));
	}
	 public static int majoritySearch(int[] nums) {
		 int count=0;
		 int candidate=0;
		 for(int i=0;i<nums.length;i++) {
			 if(count==0) {
				 candidate=nums[i];
			 }
			 
			 if(candidate ==nums[i]) {
				 count++;
			 }
			 else {
				 count--;
			 }
		 }
		 return candidate;
	 }

	
	
}
