package com.languagefundamentals;

import java.util.Arrays;

public class Task05 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=0;
		int rem=0;
		for(int i:arr) {
			n=n*10+i;
		}
		for(int i=0;i<arr.length;i++) {
			rem=n%10;
			arr[i]=rem;
			n/=10;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		
	}

}
