package com.operators;

public class TernaryOp {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		System.out.println("minimum element is " + min);
		System.out.println("*************************");
		
		
		int num = 21;
		String result = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(result);
		System.out.println("*************************");
		
		
		int num1 = 555;
		System.out.println(num1 > 100 && num1 < 999);
		int a1 = 20, b1 = 30;
		System.out.println("*************************");
		
		
		System.out.println(a1 << 1);
		System.out.println(a1 >> 3);
	}
}
