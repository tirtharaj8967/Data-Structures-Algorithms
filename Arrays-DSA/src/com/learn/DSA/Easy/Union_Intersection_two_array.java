package com.learn.DSA.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union_Intersection_two_array {
//	Find the union and intersection of two sorted arrays.
	public static void main(String[] args) {
//Union means all will come but only one time;
//Intersection means only common part will come
		int[] arr1= {10,20,30,25,45,55,50};
		int[] arr2 = {15,25,35,45,65};
		
		System.out.println(intersection(arr1, arr2));
		System.out.println(union(arr1, arr2));
	}
	
	public static List<Integer> intersection(int[] arr1, int[] arr2) {
		List<Integer> list= new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					if(list.contains(arr1[i])) {
						
					}else {
						list.add(arr2[j]);
					}
				}
			}
		}
		return list;
	}
	
	public static List<Integer> union(int[] arr1, int[] arr2) {
		List<Integer> list= new ArrayList<>();

		for(int num: arr1 ) {
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		
		for(int num: arr2 ) {
			if(!list.contains(num)) {
				list.add(num);
			}
		}
				return list;
	}

}
