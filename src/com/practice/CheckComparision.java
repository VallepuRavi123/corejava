package com.practice;

public class CheckComparision {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		System.out.println(s1==s2);
		String s3=new String("java");
		System.out.println(s3==s1);
		System.out.println(s1.equals(s3));

	}

}
