package com.learn.DSA.Easy;

public class Palindrome_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "trrt";
System.out.println( isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
		int right=str.length()-1;
		int left=0;
		while(left<right) {
			char start= str.charAt(left);
			char end= str.charAt(right);
			if(start != end) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
}
