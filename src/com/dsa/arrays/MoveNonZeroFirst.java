package com.dsa.arrays;

import java.util.Arrays;

public class MoveNonZeroFirst {

	public static void main(String[] args) {
		int[] arr= {-1,-2,3,-1,-4,5,-6};
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				int temp=arr[i];
				for(int j=i;j>index;j--) {
					arr[j]=arr[j-1];
				}
				//int temp=arr[i];
				//arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
			}
			//System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr));
	}

}
