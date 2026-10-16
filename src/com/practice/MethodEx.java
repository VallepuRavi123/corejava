package com.practice;

public class MethodEx {
	static  MethodEx t=new MethodEx();
	static void welcome() {
		method1();
		System.out.println("welcome method called !!!");
		
	}
	static void method1() {
		t.method2();
		System.out.println("method 1 called !!!");
	}
	void method2() {
		method3();
		System.out.println("method 2 is called !!!");
	}
	void method3() {
		System.out.println("method 3 is called!!!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!!");
		welcome();
		
	}

}
