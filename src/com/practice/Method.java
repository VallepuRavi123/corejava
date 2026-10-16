package com.practice;

public class Method {

	static {
		System.out.println("Java");
		
	}

	void method() {
		System.out.println("welcome to main method : ");
	}

	static void method1() {
		System.out.println("welcome method 1 : ");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!!");
		method1();
		Method m = new Method();
		m.method();
		System.out.println("main method ended !!!");
		
	}

	static {
		System.out.println("Java");
	}

}
