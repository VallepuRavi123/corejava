package com.logicalconditions;

import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int correct=0;
		int wrong=0;
		for(int i=1;i<=20;i++) {
			System.out.print("Enter value for "+i+"Question");
			int ans=sc.nextInt();
			if(ans==1) {
				correct++;
			}
			else if(ans==0) {
				wrong++;
			}
			else {
				System.out.println("Question is not attempted");
			}
//			System.out.println("The total marks obtained by the student is"+correct);
//			System.out.println("The percentage obtained by the student is "+(correct/20)*100);
		}
		System.out.println("The total marks obtained by the student is"+correct);
		System.out.println("The total wrong quesions attemed by student is"+wrong);
		System.out.println("The percentage obtained by the student is "+correct*100/20);
	
	sc.close();
	}

}
