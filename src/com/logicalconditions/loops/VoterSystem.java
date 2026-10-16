package com.logicalconditions.loops;

import java.util.Scanner;

public class VoterSystem {
static int i=1;
static int  markCount;
static int subhanCount;
static int bajiCount;
static int notaCount;
static long totalCapacity=10;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="";
		do {
		System.out.println("Enter age of the voter"+i++ +" : " );
		int age=sc.nextInt();
		
			if(age>18) {
				System.out.println("Valid age for the voting ");
				System.out.println("Enter your gender  ");
				char gender=sc.next().charAt(0);
				if(gender=='M'|| gender =='m'|| gender=='F'|| gender=='f') {
					System.out.println("Valid gender : ");
					System.out.println("*******************************");
					System.out.println("The Candidate details are ");
					System.out.println("1.Mark Antony ");
					System.out.println("2.subhan ");
					System.out.println("3.Baji ");
					System.out.println("Enter your voter no : ");
					int voterNo=sc.nextInt();
					switch(voterNo) {
					case 1->{
						System.out.println("vote is captured for Mark Antony ");
						markCount++;
					}
					case 2->{
						System.out.println("vote is captured for  subhan ");
						subhanCount++;
					}
					case 3->{
						System.out.println("vote is captured for  baji ");
						bajiCount++;
						
					}
					default ->{
						System.out.println("vote capture for NOTA");
						notaCount++;
						
					}
					}

				}
				else {
					System.out.println("Not a valid age : ");
				}
			}
			else {
				System.out.println("not eligibe for voting : ");
			}
			//System.out.println("Do you want to continue : ");
//			s=sc.next();
		}while(i<=totalCapacity);
	display();
	}
	static void display() {
		System.out.println("The total votes for the candidate mark is :"+markCount);
		System.out.println("The total votes for the candidate mark is :"+subhanCount);
		System.out.println("The total votes for the candidate mark is :"+bajiCount);
		System.out.println("The total votes for the candidate mark is :"+notaCount);
	}

}
