package com.gut;

import java.util.Arrays;

public class MoveAllNegitiveToBegininig {

	public static void main(String[] args) {
		int arr[]= {1, -2, 3, -4, 5, -6,-1,0,-1,-3};
		int j=1;
		int i=0;
		while(j<arr.length) {
			if(arr[j]<0 && arr[i]>0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
			}
			else {
				j++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
