package com.learn.DSA.Medium;

public class Compress_String_into_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbccc";
		compress(str);
	}

	public static void compress(String str) {
		StringBuilder sb = new StringBuilder();
		int len= str.length();
		
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				count++;
			} else if(str.charAt(i - 1) != str.charAt(i) || i==str.length()) {
				sb.append(str.charAt(i - 1));
				sb.append(count);
				count = 1;
			}
		}
		sb.append(str.charAt(str.length()-1));
		sb.append(count);
		System.out.println(sb.toString());
	}

}
