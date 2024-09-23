package com.tirtha.Linear_Search;

import java.util.ArrayList;
import java.util.List;

public class FindEvenNumberDigits {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8, 9, 12, 45, 56, 42, 41, 52, 51, 47, 86, 1, 452, 657, 741, 24, };
		int nums=findEvenDigits(arr);
		System.out.println(nums);
	}

	static int findEvenDigits(int[] arr) {
		int count=0;
		for(int num:arr) if(checkEven(num)) count++;
		return count;
	}
	static boolean checkEven(int num) {
		int count=0;
		while(num>0) {
			num= num/10;
			count++;
		}
		if(count%2==0) return true;
		return false;
		
	}

}
