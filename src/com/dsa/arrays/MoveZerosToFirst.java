package com.dsa.arrays;
import java.util.Arrays;
public class MoveZerosToFirst {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,7,0,4,5}; 
		int j=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
