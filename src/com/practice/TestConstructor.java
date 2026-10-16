package com.practice;

public class TestConstructor {

	TestConstructor() {
		System.out.println("No-Arg Constructor");
		this(10);

	}

	TestConstructor(int i) {
		System.out.println("One-arg Constructor" + i);
		this(10, 20);

	}

	TestConstructor(int i, int j) {
		System.out.println("Two-arg Constructor" + i + "," + j);

	}

	public static void main(String[] args) {
		TestConstructor t = new TestConstructor();

	}

}