package com.learn.DSA.Easy;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {
// Remove duplicates while maintaining order
	public static void main(String[] args) {
		String str = "tirtharajdos";
		String newStr = removed(str);
		System.out.println(newStr);

	}

	public static String removed(String str) {
		Set<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (Character ch : str.toCharArray()) {
			if (!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
