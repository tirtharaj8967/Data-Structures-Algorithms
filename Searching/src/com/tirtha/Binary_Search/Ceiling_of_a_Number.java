package com.tirtha.Binary_Search;

public class Ceiling_of_a_Number {
	//Find the somallest number greater than or equal to the target element
	public static void main(String[] args) {
	        int[] arr= {2,4,6,8,10,12,14,16,18,20};
	        int target=9;
	        int value= ceilingOfNumber(arr, target);
	        System.out.println(value);
	}
	 static int ceilingOfNumber(int[] arr, int target){
         int start=0;
        int end= arr.length-1;
        while(end>=start){
            int mid= start+(end - start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else if(target == arr[mid]){
                return mid;
            }
        }
        
        return arr[start];
    }
}
