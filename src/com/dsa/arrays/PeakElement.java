package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeakElement {

	public static void main(String[] args) {
//		Input:  [1, 3, 5, 4, 2]
//				[1, 5, 3, 7, 2]
//				Output: 2
		int [] arr= {1,2,3,6,4,9,7};//{1,2,3,4,5,7,8,9}
		 int left=0;
		 int right=arr.length-1;
		 List<int[]> list=new ArrayList<>();
		int j=1;
		 for(int i=1;i<arr.length-1;i++) {
			 if(arr[i]>arr[j-1] && arr[i]>arr[j+1]) {
				 list.add(new int[]{arr[i]});
			 }
			 j++;
		 }
		 if(list.isEmpty()) {
			 System.out.println("There is no peek in the array");
		 }
	//	System.out.println(list);
		for(int i[]:list) {
			for(int x:i)
			System.out.print(x+" ");
		}
		 
		for(int[] i:targetsum(arr,9)) {
			System.out.println(Arrays.toString(i));
		}
		
		 

	}
	static  List<int[]> targetsum(int[]arr,int target) {
		int left=0;
		int right=arr.length-1;
		 List<int[]> s=new ArrayList<>();
//		 int[] arr1=new int[4];
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				s.add(new int[] {left,right});
//				arr1[0]=left;
//				arr1[1]=right;
				left++;
				right--;
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
		return s;
	}

}
