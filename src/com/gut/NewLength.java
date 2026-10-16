package com.gut;

import java.util.Arrays;

public class NewLength {

	public static void main(String[] args) {
		int arr[]= {0,1,2,2,3,4,4};
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				arr[++i]=arr[j];
			}
		}
		//System.out.println(i+1);
		for(int k=0;k<=i;k++) {
			System.out.print(arr[k]+" ");
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
