package com.dsa.arrays;

import java.util.Arrays;

public class ChageToRoundOfArrayEle {

	public static void main(String[] args) {
		int arr[]= {36,45,78,66,99};
		for(int i=0;i<arr.length;i++) {
			int rem=arr[i]%10;
			 int q =arr[i]/10;
			if(rem<=5) {
				arr[i]=q*10;
			}
			else {
				arr[i]=(q+1)*10;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
