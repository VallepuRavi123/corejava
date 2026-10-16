package com.logicalconditions;

import java.util.Scanner;

public class NthFibnocci {
	 static int isFib(int n) {
		
		 if(n==1) {
			 return 1;
		 }
		 else if( n==0) {
			 return 0;
		 }
		 
		 return isFib(n-1)+isFib(n-2);
	 }
	 static boolean isprime(int n) {
		 if(n==1 || n==0) {
			 return false;
		 }
		 for(int i=2;i<n/2;i++) {
			 if(n%i==0) {
				 return false;
			 }
		 }
		 return true;
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println(isFib(3));
		int n=sc.nextInt();
		int count=0;
		int i=1;
		while(true) {
			if(isprime(isFib(i))) {
				System.out.println(isFib(i));
				count++;
			}
			if(count==n) {
				System.out.println(isFib(i));
				break;
			}
			i++;
		}
	}

}
