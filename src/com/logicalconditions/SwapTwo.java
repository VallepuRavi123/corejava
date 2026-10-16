package com.logicalconditions;

public class SwapTwo {

	public static void main(String[] args) {
		int temp;
		int a=32;
		int b=22;
		temp=a;//10
		a=b;//20
		b=temp;//10
		System.out.println(a);
		System.out.println(b);
		System.out.println("*************************");
		//System.out.println(32^22);
//		System.out.println(30^20);
//		System.out.println(30^10);
		a=a^b;// 30  10 01--true
		b=a^b;// 30^20=10
		a=a^b; //30^10=20
		System.out.println(a);
		System.out.println(b);
		System.out.println("****************************");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
