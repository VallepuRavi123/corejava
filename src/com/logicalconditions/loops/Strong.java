package com.logicalconditions.loops;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean s = checkstrong(n);
		if (s) {
			System.out.println("Strong");
		} else {
			System.out.println("Not strong");
		}

	}

	public static boolean checkstrong(int n) {
		int rem = 0;
		int sum = 0;
		int temp = n;
		while (temp > 0) {
			rem = temp % 10;
			sum += fact(rem);
			temp = temp / 10;
		}
		return sum == n;
	}

	public static int fact(int rem) {
		int fact = 1;
		for (int i = rem; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}

}
