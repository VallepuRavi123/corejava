package com.languagefundamentals;

import java.util.Scanner;

public class Task02 {
	static String collageName="VVIT";
	int studentId;
	String studentName;
	int emarks;
	int tmarks;
	int hmarks;
	int total;
	int percentage;
	String s;
	public void calculatetotal(){
		total=emarks+tmarks+hmarks;
		System.out.println("The total marks is "+total);
	}
	public void calpercent() {
		calculatetotal();
		percentage=total/3;
		System.out.println("The % of the student is "+percentage);
	}
	public void display() {
		System.out.println("The student details is ");
		System.out.println("The student name is "+studentName);
		System.out.println("The student id is "+studentId);
		calpercent();
		System.out.println("Total marks is "+total);
		System.out.println("percentage of the student is "+percentage);
	}
	public static void main(String[] args) {
		Task02 t=new Task02();
		int i=0;
		Scanner sc=new Scanner(System.in);
		do {
	//	Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+i+"student name :");
		t.studentName=sc.nextLine();
		System.out.println("Enter value for studentId");
		t.studentId=sc.nextInt();
		System.out.println("Enter telugu marks :");
		t.tmarks=sc.nextInt();
		System.out.println("Enter English marks : ");
		t.emarks=sc.nextInt();
		System.out.println("Enter hindi marks :");
		t.hmarks=sc.nextInt();
		i=i+1;
		t.display();
		System.out.println("Do you want to continue :");
		
		}while(i<3);
		//t.display();
		sc.close();
	}

}

