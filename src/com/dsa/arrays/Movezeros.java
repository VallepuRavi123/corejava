package com.dsa.arrays;

import java.util.Arrays;

public class Movezeros {

	public static void main(String[] args) {
		int[] arr= {1,0,4,5,9,7,0,0,1,2,0,0,0,1,1};
		int left=0;
		int right=1;
		while(right<arr.length) {
			if(arr[left]==0 && arr[right]!=0) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right++;
			}
			else if(arr[left]==0 && arr[right]==0) {
				right++;
			}
			else {
				left++;
				right++;
			}
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
