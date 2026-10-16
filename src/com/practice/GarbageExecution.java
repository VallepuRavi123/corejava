package com.practice;

class A{
	B b;
}
class B extends A{
	A a;
}

public class GarbageExecution {
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called !!!");
	}
	
	
	public static void display() {
		GarbageExecution ex=new GarbageExecution();
	}

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		GarbageExecution g3 =new GarbageExecution();
		GarbageExecution g2 =new GarbageExecution();
//		System.out.println(g1);
		System.out.println(g3);
		System.out.println(g2);
		//g1=null;
		//g2=null;
		//System.out.println(g1);
		display();
		g3=g2;
		new GarbageExecution();
		//System.gc();
	System.out.println("hi : "+g3.equals(g2));
		System.out.println("hello : "+g2);
		System.out.println(g3);
	
		A obj1=new A();
		B obj2=new B();
		
		obj1.b=obj2;
		obj2.a=obj1;
		obj1=null;
		obj2=null;
		
		System.gc();
		
		
		
		}
		
		
	}


