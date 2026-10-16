package com.logicalconditions.loops;

import java.util.Scanner;

public class Recursion {
	static int i=1;
	static int recursion(int n) {
		if (i==n ) {
			return i;
		}
		System.out.print(i++ + " ");
		return recursion(n);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(recursion(n));
	}
}
