package com.learn.Arrays;

import java.util.Arrays;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums= {3,2,3};
System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		int mVal = nums[0];
		int mCount = 0;
		int count = 0;
//		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int val = nums[0];
			for (int j = 1; j < nums.length; j++) {
				if (val == nums[j]) {
					count++;
				}
			}
			if (count > mCount) {
				mVal = val;
				mCount=count;
			}

		}
		return mVal;
	}
}
