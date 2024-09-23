package com.tirtha.Linear_Search;

public class SearchInString {

	public static void main(String[] args) {
		String name = "tirtha";
		char target = 'a';
		boolean status = linearSearch(name, target);
		System.out.println(status);
	}

	static boolean linearSearch(String name, char target) {
		if (name.length() == 0)
			return false;
		else {
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == target) {
					return true;
				}
			}
			return false;
		}
	}

}
