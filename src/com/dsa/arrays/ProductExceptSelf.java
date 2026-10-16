package com.dsa.arrays;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] arr2=new int[4];
		for(int i=0;i<arr.length;i++) {
			int ele=1;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					ele*=arr[j];
				}
			}
			arr2[i]=ele;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
