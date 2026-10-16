package com.logicalconditions;

import java.util.Scanner;

public class PerfetctBetweenNumber {
	static boolean isperfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum==n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int count=0;
		int i=0;
		while(true) {
			if(isperfect(i)) {
				count++;
			}
			if(count==k) {
				System.out.println(i);
				break;
			}
			i++;
		}
	
	}

}
