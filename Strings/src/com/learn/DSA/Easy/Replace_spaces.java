package com.learn.DSA.Easy;

public class Replace_spaces {

	public static void main(String[] args) {
		String str = "tirtha raj das";
		System.out.println(replaceSpaces(str));
	}

//	public static String replaceSpaces(String str) {
//		StringBuilder sb = new StringBuilder();
//		for (char ch : str.toCharArray()) {
//			if (ch == ' ') {
//				sb.append("%20");
//			} else {
//				sb.append(ch);
//			}
//		}
//		return sb.toString();
//	}
	public static String replaceSpaces(String str) {
		
		return str.replace(" ", "%20");
	}

}
