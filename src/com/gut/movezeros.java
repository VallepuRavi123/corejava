package com.gut;

import java.util.Arrays;

public class movezeros {

	public static void main(String[] args) {
		int[] arr= {0, 1, 0, 3, 12,0,22,4,0};
		int left=0;
		int right=1;
		while(true) {
			if(arr[left]==0 && arr[right]!=0) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right++;
			}
			else if(arr[right]==0) {
				right++;
			}
			if(right==arr.length) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
