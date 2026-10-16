package com.dsa.arrays;

import java.util.Arrays;

//import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6}};
		int arr2[][]=new int[arr[0].length][arr.length];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
//				if(i<j) {
//				int temp=arr[i][j];
//				arr[i][j]=arr[j][i];
//				arr[j][i]=temp;
//			}
				arr2[i][j]=arr[j][i];
		}
		}
		for(int[]a:arr2) {
			for(int i:a) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
