package com.learn.DSA.Easy;

public class UrlEncoding {
	public static void main(String[] args) {
		String str1 = "tirtha raj das";
		System.out.println(urlEncode(str1));
	}

	public static String urlEncode(String str) {
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (ch == ' ') {
				sb.append("%20");
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
