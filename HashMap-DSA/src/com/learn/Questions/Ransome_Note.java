package com.learn.Questions;

public class Ransome_Note {

	public static void main(String[] args) {
		
	     System.out.println(canConstruct("aa", "aab")); // Output: true
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] charCount = new int[26];
		 for (char ch : magazine.toCharArray()) {
	            charCount[ch - 'a']++;
	        }

	        // Check if ransomNote can be formed
	        for (char ch : ransomNote.toCharArray()) {
	            if (charCount[ch - 'a'] == 0) {
	                return false;
	            }
	            charCount[ch - 'a']--;
	        }

	        return true;
	}

}
