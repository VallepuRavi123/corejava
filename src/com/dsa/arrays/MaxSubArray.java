package com.dsa.arrays;

public class MaxSubArray {

	public static void main(String[] args) {
//		1. Maximum Subarray Sum
//		Given an integer array:
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//		Find the *maximum sum of a continuous subarray*.
//		Expected output:
//		Maximum Sum = 6
//		int maxsum=0;
//		int start=0,end=0;
//		for(int i=0;i<arr.length;i++) {
//			int sum=arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				sum+=arr[j];
//				if(sum>maxsum) {
//					maxsum=sum;
//					start=i;
//					end=j;
//				}
//				
//			}
//			
////		System.out.println(maxsum);
//		}
//		System.out.println(maxsum);
//		System.out.println(start+" "+end);
		int sum=0;
		int maxsum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>maxsum) {
				maxsum=sum;
			}
		}

	}

}
