package com.logicalconditions.loops;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter value for n");
		int n=sc.nextInt();
		int s=0;
		int i=1;
		System.out.println((n*(n+1))/2);
		while(i<=n) {
			s=s+i;
			i=i+1;
			//System.out.println(s);
		}
		System.out.println(s);
	}

}
