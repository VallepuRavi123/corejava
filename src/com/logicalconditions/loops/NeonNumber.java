package com.logicalconditions.loops;

import java.util.Scanner;
class NeonNumber{
	static boolean neon(int n) {
		int rem=0;
		int num=n;
		int sum=0;
		int sum1=0;
		while(n>0) {
			rem=n%10;
			sum+=rem*rem;
			n/=10;
		}
		System.out.println(sum);
		while(sum>0) {
		sum1+=sum%10;
		sum/=10;
		}
		return sum1==num;
	}
	public static void main(String [] args ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		if(neon(n)) {
			System.out.println("Neon number !");
		}
		else {
			System.out.println("not a neon number ");
		}
	}

}
