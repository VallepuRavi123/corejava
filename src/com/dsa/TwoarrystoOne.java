package com.dsa;

import java.util.Arrays;

public class TwoarrystoOne {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		int [] arr1= {6,7,8,9};
		int[] arr2=new int[arr.length+arr1.length];
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		for(int i=arr.length;i<arr.length+arr1.length;i++) {
			arr2[i]=arr1[j];
			j++;
		}
		System.out.println(j);
//		for(int i:arr2) {
			System.out.print(Arrays.toString(arr2));
//		}

	}

}
