package com.learn.DSA.Easy;

public class Count_Char_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="tirtharaj";
		System.out.println(countChar(str, 't'));
	}
	public static int countChar(String str, char ch) {
		int count=0;
		for(char val : str.toCharArray()) {
			if(val == ch) {
				count++;
			}
		}
		return count;
	}

}
