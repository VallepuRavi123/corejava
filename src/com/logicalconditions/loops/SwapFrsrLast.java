package com.logicalconditions.loops;

import java.util.Scanner;

public class SwapFrsrLast {
	static int swap(int n) {
		int swap = 0;
		int q=0;
		int temp = n;
		int count = 0;
		int last = n % 10;
		while (temp >= 10) {
			count++;
			temp = temp / 10;
		}
		q = (int) ((n / 10) % Math.pow(10, (count - 1)));
		System.out.println(q);
		System.out.println(count);
		swap = (int) (last * Math.pow(10, count) + q * 10 + temp);
		System.out.println(temp);
		System.out.println(last);
		return swap;
	}
	// (n%power)/100

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n1=12345%10000;
//		int n2=n1/10;
//		System.out.println(n1);
//		System.out.println(n2);

		System.out.println("Enter value : ");
		int n = sc.nextInt();

		System.out.println(swap(n));

	}

}
