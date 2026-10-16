package com.languagefundamentals.methods;

import java.util.Scanner;

public class Task01 {
	static String stroreName;
	String customerName;
	String productName;
	double price;
	int quantity;
	static double total;
	//double discount;
	static Scanner sc=new Scanner(System.in);
	public void addproduct(String pname,double pr,int qty) {
		productName=pname;
		price=pr;
		quantity=qty;
		System.out.println("Product added sucesfully !!");
		display();
	}
	void caltotal(double discount){
		price=price*quantity;
		System.out.println("The total price is "+price);
		discount=(discount*price)/100;
		price-=discount;
		System.out.println("The total price after discount is"+price);
		total+=price;
		System.out.println("The total price for the products :"+total);
		System.out.println("*********************************");
	}
	void display() {
		System.out.println("The product Name is "+productName);
		System.out.println("The product price is "+price);
		System.out.println("The quantity is "+quantity);
		System.out.println("*********************************");
		System.out.println("Enter discount for the product ");
	//	System.out.println("*********************************");
		double discount=sc.nextDouble();
		caltotal(discount);
	}
	public static void main(String[] args) {
		Task01 t=new Task01();
		t.addproduct("iphone",10000,10);
		t.addproduct("xyz",10000,10);
		Task01 t1=new Task01();
		t1.addproduct("chacolate",20000, 10);
	}

}

//storeName:-common for all bills 
//customerName
// productName
// price 
// quantity