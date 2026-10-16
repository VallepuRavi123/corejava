package com.logicalconditions.loops;

import java.util.Scanner;

public class MagicNumber {
	static long magc(long n) {
		long rem = 0;
		long sum = 0;
		long temp = n;
		while (temp > 0) {
//			long rem=0;
//			long sum=0;
			rem = temp % 10;
			sum = sum + rem;
			temp /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for N : ");
		long n = sc.nextLong();
		long a = magc(n);
		while(a>=10) {
			 a=magc(a);
		}
		if(a==1) {
			System.out.println("magic");
		}
		else {
		System.out.println("Not a magic number !!!");}
		System.out.println(a);
		sc.close();

	}

}
