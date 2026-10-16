package com.practice;

public class MethodArea {
	static int collage_id;
	static String collage_name;
	static{
		System.out.println("instance block is loaded");
	}
	int student_id=10;
	String student_name="Harsha";
	public MethodArea(String name ) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println(collage_id);
		System.out.println(collage_name);
		MethodArea m=new MethodArea("Ravi");
		m.student_id=20;
		m.student_name="Baji";
		System.out.println(m.student_id);
		System.out.println(m.student_name);
		
		
	}
	{
		System.out.println("instance block loaded 2 time");
	}
	

}
