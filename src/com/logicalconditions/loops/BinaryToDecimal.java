package com.logicalconditions.loops;

import java.util.Scanner;

public class BinaryToDecimal {
	static void binarydecimal(int n) {
		int sum=0;
		int rem=0;
		int i=0;
		while(n>0) {//101
			rem=n%10;
			sum+=rem*Math.pow(16, i);
			i++;
			n=n/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	binarydecimal(n);
	}

}
