package com.languagefundamentals.methods;

public class TestMethod1 {
	static int result;

	public static void main(String[] args) {
		//int result=0;
		addition(10,20);
//		addition1(result,20);
//		sub(result,10);
//		mul(result,10);
		//System.out.println("The mul of a and b is"+result4);
	}
	static  void addition(int a,int b) {
		result=a+b;
     System.out.println("The addition of two numbers is:"+result);
		  addition1(result,10);
	}
	static void addition1(int result,int b){
		 result+=b;
		System.out.println("Addition of two numbers is "+result);
		sub(result,10);
	}
	static void sub(int result,int b) {
		result-=b;
		System.out.println("The sub of two numbers is "+result);
		mul(result,b);
	}
	static void mul(int result, int b) {
		result*=b;
		System.out.println("The mul of two numbers is"+result);
		//return a*b;
	}
	
}
