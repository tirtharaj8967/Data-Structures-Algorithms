package com.learn.DSA.Medium;

import java.util.Arrays;

public class Longest_Common_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flow", "flower", "fly"};
		longestPrefix(strs);
	}
	public static String longestPrefix(String[] strs) {

		String prefix = strs[0];
		for(int i=1; i<strs.length; i++) {
			String current= strs[i]; 
			int j=0;
			while(j< prefix.length() &&  j< current.length() && prefix.charAt(j) == current.charAt(j) ) {
				j++;
			}
			prefix = prefix.substring(0,j);
			if(prefix.isEmpty()) return " ";
				
		}
		return prefix;	
	}

}
