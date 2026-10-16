package com.practice;

public class Test01 {
	static {
		System.out.println("Static 1 block called !!!");
		
	}
	public void display(){
		System.out.println("Display method called !!!");
	}
	{
		System.out.println("Instance block called !!!");
	}
	static {
		System.out.println("Ststic block 2 called !!!");
	}
	

	public static void main(String[] args) {
		System.out.println(0b0101);
		System.out.println("\"");
		new Test01();
		
		
		 

	}

}
