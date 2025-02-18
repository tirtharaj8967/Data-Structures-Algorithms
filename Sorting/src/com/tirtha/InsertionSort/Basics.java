package com.tirtha.InsertionSort;

import java.util.Arrays;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {3,4,2,1,5};
System.out.println(Arrays.toString(sortArray(arr)));
	}
		
	public static int[] sortArray(int[] arr) {
		for(int i=1;i<arr.length; i++) {
			int current=arr[i];
			int prev= i-1;
			
			while(prev>=0 && arr[prev]>current) {
				arr[prev+1]= arr[prev];
				prev--;
			}
			arr[prev+1]=current;
		}
		return arr;
	}

}
