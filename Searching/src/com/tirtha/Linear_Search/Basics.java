package com.tirtha.Linear_Search;

import java.awt.LinearGradientPaint;

public class Basics {

	public static void main(String[] args) {

		int[] arr= {5,7,8,57,4,6,11,42,75,84,20,10,30,47};
		int value= linearSearch(arr,47);
		System.out.println(value);
	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i + 1;
			}
		}
		return -1;
	}

}
