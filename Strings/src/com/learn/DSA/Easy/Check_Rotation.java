package com.learn.DSA.Easy;

public class Check_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "tirtha";
		String str2= "rthati";
		System.out.println(rotationCheck(str1, str2));
		System.out.println(rotationCheckOptimal(str1, str2));

	}
	public static boolean rotationCheck(String str1,String str2 ) {
		if(str1.length() != str2.length()) return false;
		for(int i=0; i<str1.length(); i++) {
			String rotated= str1.substring(i)+str1.substring(0,i);
			if(rotated.equals(str2)) {
				return true;
			}
		}
		return false;
	}
	public static boolean rotationCheckOptimal(String str1,String str2 ) {
		if(str1.length() != str2.length()) return false;
		String newString=str1+str1;
		if(newString.contains(str2)) return true;
		else return false;
	}

}
