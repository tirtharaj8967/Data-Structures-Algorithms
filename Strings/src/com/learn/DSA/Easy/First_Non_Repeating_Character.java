package com.learn.DSA.Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_Repeating_Character {

	public static void main(String[] args) {
		String str = "tirtharajdas";
//		System.out.println(findFirst(str));
	}

	// brute force
//	public static Character findFirst(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			boolean isUnique = true;
//			Character ch = str.charAt(i);
//			for (int j = 0; j < str.length(); j++) {
//				if (i != j && str.charAt(j) == ch) {
//					isUnique = false;
//				}
//			}
//			if (isUnique == true) {
//				return ch;
//			}
//		}
//		return null;
//	}

//	Using LinkedHashMap
//	public static Character findFirst(String str) {
//		Map<Character, Integer> map = new LinkedHashMap<>();
//		for(Character ch: str.toCharArray()) {
//			
//		}
//	}
}
