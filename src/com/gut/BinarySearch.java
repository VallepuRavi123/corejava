package com.gut;

public class BinarySearch {
	static int binary(int [] arr,int search) {
		int left=0;
		int right=arr.length;
		while(left<right) {
			int mid=(left+right)/2;
		if(arr[mid]==search) {
			return mid;
		}
		else if(arr[mid]<search) {
			left=mid;
		}
		else {
			right=mid;
		}
	}
		return -1;
	}
	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50};
		int search=binary(arr,40);
		System.out.println(search);
	}

}
