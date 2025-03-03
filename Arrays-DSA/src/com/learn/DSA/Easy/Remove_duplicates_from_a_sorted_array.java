package com.learn.DSA.Easy;

import java.util.HashSet;

public class Remove_duplicates_from_a_sorted_array {

	public static void main(String[] args) {
		int[] arr= {10,24,25,61,10,24,51,85};
		System.out.println(removeDuplicates( arr));
	}
	
	public static HashSet<Integer> removeDuplicates(int[] arr) {
		HashSet<Integer> set= new HashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		return set;
	}

}
