package com.learn.DSA.Easy;

import java.util.ArrayList;
import java.util.List;

public class Find_Common_Elements_Three_Array {
//	Find the common elements in three sorted arrays.
	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 5, 7 };
		int[] arr2 = { 10, 70, 82, 17, 5, 7 };
		int[] arr3 = { 17, 32, 10, 7, 5, 45, 61, };
		
		System.out.println(findSortedElements(arr1, arr2, arr3));

	}

	public static List<Integer> findSortedElements(int[] arr1, int[] arr2, int[] arr3) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
						list.add(arr1[i]);
					}
				}
			}
		}
		return list;
	}

}
