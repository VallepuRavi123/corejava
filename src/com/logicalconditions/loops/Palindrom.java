package com.logicalconditions.loops;

import java.util.Scanner;



public class Palindrom{
	public static boolean check(int n) {
		int rem=0;
		int orig=n;
		int rev=0;
		while(n>0) {
			rem=n%10;
			System.out.println(rem);
			rev=rev*10+rem;
			System.out.println(rev);
			n=n/10;
		}
		return orig==rev;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int rem=0;
//		int orig=n;
//		int rev=0;
//		while(n>0) {
//			rem=n%10;
//			System.out.println(rem);
//			rev=rev*10+rem;
//			System.out.println(rev);
//			n=n/10;
//		}
		boolean status=check(n);
		if(status) {
			System.out.println("palindrom !!!");
		}
		else {
			System.out.println("Not a palindrom");
		}
	}
}


