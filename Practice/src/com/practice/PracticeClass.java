package com.practice;

public class PracticeClass {
	public static void main(String[] args) {
		String str1 = "tirtharajdas ";
		String str2 = "dasrajtirtha";
		System.out.println( reverseWords(str1, str2));
	}

	public static boolean reverseWords(String str1, String str2) {
		return str1.contains(str2);
	}

}