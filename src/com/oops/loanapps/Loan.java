package com.oops.loanapps;

import java.util.Scanner;

public class Loan {
	static Scanner sc=new Scanner(System.in);
	double getSalary() {
		System.out.println("Enter your salary :");
		double sal=sc.nextDouble();
		return sal;
	}
	int getCiblil() {
		System.out.println("Enter your cibli score : ");
		int cibil=sc.nextInt();
		return cibil;
	}
	boolean validAadhar(){
		System.out.println("Enter aadhar no");
		String aadhar=sc.next();
		boolean valid=aadhar.matches("[2-9]{1}[0-9]{11}");
		return valid;
	}
	boolean validPan() {
		System.out.println("Enter pan number ");
		String pan=sc.next();
		boolean valid=pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
		return valid;
	}
	boolean validPh() {
		System.out.println("Enter a valid phno");
		String ph=sc.next();
		boolean status=ph.matches("[0-9]{10}");
		return status;
		
	}
	double roi(int cibil) {
		double roi=13;
		if(cibil>800  && cibil<=900) {
			System.out.println("Excellent cibil ");
			roi-=5;
		}
		else if(cibil>760 && cibil<=800) {
			System.out.println(" very good cibil ");
			roi-=4;
			
		}
		else if(cibil>700 && cibil<=760) {
			System.out.println("good ");
			roi-=2;
		}
		else if(cibil>600 && cibil<=700) {
			System.out.println("ok");
			roi-=1;
		}
		else if(cibil>300 && cibil<=600) {
			return roi;
		}
		else {
			System.out.println("Invalid cibil");
		}
		return roi;
	}
}

