package com.tirtha.Linear_Search;

import java.util.Arrays;

public class Search_2D_Arrays {

	public static void main(String[] args) {

		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		int target=8;
		int[] position= linearSearch(arr, target);
		System.out.println(Arrays.toString(position));
	}
	
	public static int[] linearSearch(int[][] arr, int target) {
		int[] position = new int[2];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]==target) 
				{
					position[0]=i;
					position[1]=j;	
				}		 
			}
		}
		return position;
	}

}
