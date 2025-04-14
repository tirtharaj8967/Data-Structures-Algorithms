package com.learn.DSA.Easy;

import java.util.Arrays;

public class Anagram_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "tirtha";
		String str2 = "rthait";
		anagramCheck(str1, str2);
	}
//	public static void anagramCheck(String str1, String str2) {
//		if(str1.length() == str2.length()) System.out.println("Not anagram");;
//		char[] ch1 = str1.toCharArray();
//		char[] ch2 = str2.toCharArray();
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		System.out.println(Arrays.equals(ch1, ch2));
//	}
	
	public static boolean anagramCheck(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		int[] count = new int[26];
		for(int i =0; i<str1.length(); i++) {
			count[str1.charAt(i) - 'a']++;
	        count[str2.charAt(i) - 'a']--;
		}
		for(int i : count) {
			if(i !=0) return false;
		}
		return true;
	}

}
