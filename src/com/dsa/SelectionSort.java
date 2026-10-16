package com.dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr= {5,4,3,2,1};
		int min_index;
		for(int i=0;i<arr.length;i++) {
			min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
