package com.practice;
class Hello {
	static int age;
	static String name;
	int course;
	String loc;

	{
		System.out.println("Java");
	}
	public static void main(String[] args) {
	    System.out.println("Welcome to java ");
	    System.out.println(age);
	    System.out.println(name);
	    Hello a=new Hello();
	    a.course=10;
	    a.loc="Hyderabad";
	    System.out.println(a.course);
	    System.out.println(a.loc);
	}

}
