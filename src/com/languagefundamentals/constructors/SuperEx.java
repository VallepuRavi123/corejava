package com.languagefundamentals.constructors;

public class SuperEx {
	SuperEx(){
		System.out.println("parent No arg called !!");
	}
	SuperEx(int x){
		System.out.println("one  arg super constructor called !!");
		System.out.println(x);
	}


}
class A extends SuperEx {
	A(){
		System.out.println("child no arg called ");
	}
	A(int x){
		super(20);
		System.out.println(x);
	}
	public static void main(String [] args) {
		SuperEx a=new SuperEx(10);
	}
}