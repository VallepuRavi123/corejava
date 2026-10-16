package com.dsa;

import java.util.Arrays;

public class ArrayReverseUsingForeach {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		int a=0;
		int temp=0;
		for(int i:arr) {//i=1 ->
			a=a*10+i;
		}
		System.out.println(a);
		for(int i=0;i<arr.length;i++) { 
			temp=a%10;
			arr[i]=temp;
			a/=10;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println(Arrays.toString(arr));

//		
//		String x="12345";
//		int [] arr1=new int[x.length()];
//		for(int i=0;i<x.length();i++) {
//			arr1[i]=x.
//		}
	}
}


