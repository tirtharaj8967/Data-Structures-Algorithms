package com.learn.DSA.Easy;

public class Check_for_Rotation {

	public static void main(String[] args) {
		String str1= "abcd";
		String str2= "cdab";
		System.out.println(checkRotation( str1,str2));
	}
	
	public static boolean checkRotation(String str1, String str2) {
		StringBuilder sb = new StringBuilder(str2);
		if(str1.length() !=str2.length()) {
			return false;
		}
		for(int i=0; i<str1.length();i++) {
			char[] ch = str1.toCharArray();
			StringBuilder newSb = new StringBuilder();
			char firstChar= ch[0];
			int j=1;
			while(j<str1.length()) {
				newSb.append(ch[j]);
				j++;
			}
			newSb.append(firstChar);
			if(newSb==sb) {
				return true;
			}
		}
		return false;
	}

}
