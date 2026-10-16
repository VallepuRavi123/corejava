package com.logicalconditions.loops;

import java.util.Scanner;

public class NthPrime {
	public static boolean nthprime(int n) {
		if(n==1|n==0)
			return false;
//		int count=0;
//		int p=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
//			if(count==2) {
//				System.out.println("prime");
//			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for N : ");
		int n=sc.nextInt();
	//	boolean b=nthprime(n);
		int i=1;
		int count=0;
		while(i>0) {
			if(nthprime(i)) {
				count++;
			}
			if(count==n) {
				System.out.println(i);
				break;
			}
			i++;
		}
	//	System.out.println("The nth prime of n is "+nthprime(n));
		sc.close();
	}

}
