package com.logicalconditions.loops;

import java.util.Scanner;

public class BinartoDecimalString {
	static void binarytodecimal(int n) {
		String s=Integer.toString(n);
		int count=s.length();
		System.out.println(count);
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int digit=s.charAt(i);
			System.out.println(digit);
			if(digit==1) {
			sum+=(int)(digit*Math.pow(2, count));
			count--;
			}
			else {
				count--;
			}
			
		}
		System.out.println(count);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n :");
		int n=sc.nextInt();
		binarytodecimal(n);

	}

}
