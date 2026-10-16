package com.practice;

public class MethodOperations {
	
	void addition(int a,int b) {
		int sum =a+b;
		System.out.println("The sum of a and b is :"+sum);
		subtraction(a,b);
		
	}
	
	static void subtraction(int a,int b) {
		MethodOperations tt =new MethodOperations();
		int sub=a-b;
		System.out.println("The subtraction of a and b is : "+sub);
		tt.mul(a,b);
	}
	void mul(int a, int b) {
		int m=a*b;
		System.out.println("The multiplication of a and b is :"+m);
		division(a,b);
		
	}
	void division(int a, int b) {
		int div=a/b;
		System.out.println("The division of a and b is :"+div);
	}

	public static void main(String[] args) {
		MethodOperations t =new MethodOperations();
		t.addition(20,10);

	}

}
