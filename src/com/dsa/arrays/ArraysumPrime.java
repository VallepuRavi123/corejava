package com.dsa.arrays;

import java.util.Scanner;

public class ArraysumPrime {
	static boolean isprime(int sum) {
		if(sum==0 || sum==1) {
			return false;
		}
		for(int i=2;i<sum;i++) {
			if(sum%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	static int minimalPrime(int arr[]) {
		int sum=0;
		int count=0;
	for(int i:arr) {
		sum+=i;
	}
	while(true) {
		if(isprime(sum)) {
			break;
		}
		count++;
		sum++;
	}
	return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int minvalue=minimalPrime(arr);
		System.out.println("The minimal value added for the next prime is : "+minvalue);
		sc.close();
	}

}
