package com.dsa;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String[] args) {
		int[] arr= {1,2,3,6,21,4,5,6,0,44};
	//	Arrays.sort(arr);
		int product=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//product=arr[i]*arr[j];
				if(arr[i]*arr[j]>product) {
					product=arr[i]*arr[j];
				}
			}
		}
		
		//int product=arr[arr.length-1]*arr[arr.length-2];
		System.out.println("The max product value is "+product);
	}

}
