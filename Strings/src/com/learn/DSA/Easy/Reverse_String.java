package com.learn.DSA.Easy;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tirtha";
		System.out.println(reverse(str));
	}

	public static StringBuilder reverse(String str) {
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			sb.append(ch[i]);
		}
		return sb;
	}
//	public static String reverse(String str) {
//		return  new StringBuilder(str).reverse().toString();
//	}

}
