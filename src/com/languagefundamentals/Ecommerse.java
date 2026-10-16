package com.languagefundamentals;

import java.util.Scanner;
// 8 4 6 2 3
//4 2 4 2 3

public class Ecommerse {
	static int[] discount(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>=arr[j]) {
					arr[i]=arr[i]-arr[j];
					break;
				}
			}
		}
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]);
//		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
		//	System.out.print("Enter values for array: ");;
			arr[i]=sc.nextInt();
			
		}
		//int value=0;
		for(int value:discount(arr)) {
			System.out.print(value);
		}
		sc.close();
		}
}