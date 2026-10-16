package com.practice;

public class MethodsOutObject {
	static {
		MethodsOutObject t=new MethodsOutObject();
		//System.out.println("Method 1 is called !!!");
		//t.method2();
		t.method2();
		
	}
	
	void method2() {
		System.out.println("Method 2 is called!!!");
		method3();
	}
	 void method3() {
		System.out.println("method 3 is called !!!");
		method4();
	}
	void method4() {
		System.out.println("method 4 is called !!!");
	}
	
	public void main(String[] args) {
		System.out.println("Main method started !!!");
	}

}
