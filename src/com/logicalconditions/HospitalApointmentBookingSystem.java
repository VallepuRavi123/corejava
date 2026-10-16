package com.logicalconditions;

import java.util.Scanner;

public class HospitalApointmentBookingSystem {
	static 	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age for patient : ");
		int age =sc.nextInt();
		if(age>0) {
			System.out.println("1.regural");
			System.out.println("2.emergency");
			int patient=sc.nextInt();
			switch(patient) {
			case 1->{
				System.out.println("Enter availablity");
				System.out.println("1.Available");
				System.out.println("2.Not available");
				int availability=sc.nextInt();	
				if(availability==1) {
					System.out.println("apointment booked for regural");
				}
				else if(availability==2) {
					System.out.println("Please select another slot ");
				}
				else {
					System.out.println("Invalid available number ");
				}
			}
			case 2->{
				System.out.println("Enter availablity");
				System.out.println("1.Available");
				System.out.println("2.Not available");
				int availability=sc.nextInt();	
				if(availability==1) {
					System.out.println("apointment booked for Emergency");
				}
				else if(availability==2) {
					System.out.println("Please select another slot ");
				}
				else {
					System.out.println("Invalid available number ");
				}
			}
			default ->{
				System.out.println("Invalid patient type");
			}
			}
		}else {
			System.out.println("Invalid age : ");
		}

	}

}
