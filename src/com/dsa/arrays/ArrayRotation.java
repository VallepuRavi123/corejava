package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		System.out.println("How many times do you want rotate");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		Arrayrotation(arr,r);
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}
	static void Arrayrotation(int arr[],int r) {
		int left=0;
		int right=arr.length-1;
		r=r%arr.length;
		//total revere array
		rotation(arr,left,right); // 8 7 6 5 4 3 2 1
		//rotate the elements up to r
		rotation(arr,left,r-1);
		//rotate second half
		rotation(arr,r,right);
	}
	static void rotation(int[]arr,int left,int right) {
		int temp=0;
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
}
