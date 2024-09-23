package com.learn.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// arrays of primitives
		int[] ros= new int[5];
		ros[0]=3;
		ros[1]=5;
		ros[2]=6;
		ros[3]=9;
		ros[4]=11;
		System.out.println(Arrays.toString(ros));
		for(int i : ros){
			System.out.println(i);
		}
		
		// arrays of objects
		String[] arr= new String[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextLine();
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
//	using functions
	public void changeElement(String[] arr) {
	
		arr[4]="TRD";
	}

}
