package com.dsa;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n : ");
		int n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
		sc.close();
	}

}
