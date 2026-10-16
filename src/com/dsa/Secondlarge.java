package com.dsa;

import java.util.Scanner;

public class Secondlarge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int sec_max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				sec_max=max;
				max=arr[i];
			}
		}
		System.out.println(sec_max);
	}
}