package com.learn.DSA.Medium;

public class String1_subsequence_of_String2 {

	public static void main(String[] args) {
		// A string string1 is a subsequence of string2 
		//if all characters of string1 appear in order (not necessarily contiguous) in string2.
		
		String str1="abc";
		String str2= "ahbgdc";
		subsequenceCheck(str1, str2);

	}
	public static void subsequenceCheck(String str1, String str2) {
		int len1= str1.length();
		int prevposition=0;
		for(char ch1 : str1.toCharArray()) {
			for(int i=prevposition; i<str2.length(); i++) {
				if(ch1 == str2.charAt(i) && i>=prevposition) {
					len1--;
					prevposition=++i;
				}
			}
		}
		if(len1==0) System.out.println(true);
	}

}
