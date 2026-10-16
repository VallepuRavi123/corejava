package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i=0;
		while(true) {
			int n1=sc.nextInt();
			if(com.logicalconditions.loops.NthPrime.nthprime(n1)) {
				arr[i]=n1;
				//System.out.println(Arrays.toString(arr));
				i++;
			}
			if(i==n) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
