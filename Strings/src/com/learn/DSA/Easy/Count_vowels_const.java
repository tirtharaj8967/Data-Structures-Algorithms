package com.learn.DSA.Easy;

import java.util.HashSet;
import java.util.Set;

public class Count_vowels_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "tirtharajdas";
		countVowels(str);
	}
	public static void countVowels(String str) {
		int vow=0, constants=0;
		Set<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		
		for(Character ch: str.toCharArray()) {
			if(set.contains(ch)) vow++;
			else constants++;
		}
		System.out.println("Vowels are "+vow);

		System.out.println("Constants are "+constants);
	}
}
