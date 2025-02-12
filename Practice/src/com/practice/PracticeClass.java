package com.practice;

import java.util.Arrays;

public class PracticeClass {

	public static void main(String[] args) {

		int[] arr = { 10, 20,20,20,20, 30,30,30 ,40,40,40,40};
		int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
	}
	
	public static int removeDuplicates(int[] arr) {
		int i=0;
		for(int j=1; j<arr.length; j++) {
			if(arr[i]!= arr[j]) {
			i++;
			arr[i]=arr[j];
			}
		}
		return i+1;
	}


}
