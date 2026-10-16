package com.languagefundamentals;

import java.util.Scanner;

public class SalCalcute {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sal=sc.nextDouble();
		display(sal);
		sc.close();

	}
	static void display(double sal) {
		System.out.println("The salary details are !!");
		System.out.println("the gst of the sal for the month"+gst(sal));
		System.out.println("The pf generated for the month is"+pf(sal));
		System.out.println("The total net sal for the month"+netmonth(sal));
		System.out.println("The anual gst for the salary is"+anualgst(sal));
		System.out.println("The anual pf for the salary is"+anualpf(sal));
		System.out.println("The  anual salry of the empoyee is"+anualsal(sal));
	}
	static double  gst(double sal) {
		double gst=(sal*3)/100;
	return gst;
	}
	static double pf(double sal) {
		double pf=(sal*2)/100;
	return pf;
	}
	static double netmonth(double sal) {
		sal=sal-gst(sal)-pf(sal);
		return sal;
	}
	static double anualgst(double sal) {
		double anualgst=12*gst(sal);
		return anualgst;
	}
	static double anualpf(double sal) {
		double anualpf=12*pf(sal);
		return anualpf;
	}
	static double anualsal(double sal) {
		double anualsal=12*sal-anualgst(sal)-anualpf(sal);
		return anualsal;
	}
}

