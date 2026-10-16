package com.dsa.arrays;

import java.util.Arrays;

public class SumOfPreAndnext {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int prev=arr[0];
		for(int i=1;i<arr.length-1;i++) {
				int next=arr[i+1];
				int current=arr[i];
				arr[i]=prev+next;
				prev=current;
			}
			
		
		System.out.println(Arrays.toString(arr));

	}

}
