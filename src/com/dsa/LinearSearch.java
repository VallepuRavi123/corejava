package com.dsa;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		int key=0;
		boolean status=false;
		int[] arr=new int[n];
		System.out.print("Enter array values ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key value : ");
		int value = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				status=true;
				key=i;
				break;
			}
		}
		if(status) {
			System.out.println("The value found at the position "+key);
		}
		
	}

}
