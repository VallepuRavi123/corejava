package com.gut;

import java.util.Arrays;

public class SelectionSort {
	static int[] selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j] ){
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		return arr;
		
	}

	public static void main(String[] args) {
		int arr[]= {64,25,12,22,11,33,65,78,98};
//		System.out.println(Arrays.toString((selection(arr))));
		
		
	}

}
