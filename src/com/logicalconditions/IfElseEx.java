package com.logicalconditions;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks=sc.nextInt();
		String s=(marks>100 || marks<0)?"Invalid marks":(marks>=90 && marks<=81)?"GradeA":(marks>=71 && marks<=80)?"gradeB":(marks>=51 && marks<=70)?"gradeC":(marks>=41 && marks<=50)?"gradeD":(marks>=35 && marks<=40)?"gradeE":"failed";
		System.out.println(s);
		
		if(marks%3==0 && marks%5==0 ) {
			System.out.println("Fizz Buzz");
		}
		else if(marks%5==0) {
			System.out.println("Buzz");
		}
		else if(marks%3==0) {
			System.out.println("Fizz ");
		}
		else {
			System.out.println("Not divisible by any of 3 and 5");
		}
	}

}
