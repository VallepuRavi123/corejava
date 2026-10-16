package com.languagefundamentals;

public class ShoppingCart {
	int items;
	double totalamount;
	double amount=0;
	boolean orderplace;
	String webname="xyz";
	int count=0;
	public ShoppingCart(int items,double amount) {
		this.items=items;
		this.amount=amount;
	}
	
	public void additem(int items) {
		this.items=items;
		System.out.println("The item added into cart !!!");
		count++;
		orderplace=true;
	}
	public void placeorder() {
		if(orderplace) {
		System.out.println("The order is placed sucessfully !!!");
	//	orderplace=true;
		//double amount=0;
		totalamount+=items*amount;
		System.out.println(totalamount);
		}
		else {
			System.out.println("Without adding the item we cant place the order");
		}
	}
//	
	public void display() {
		System.out.println("The details of the shoppoing is ");
		System.out.println("website name is"+webname);
		System.out.println("The no of items added to cart is "+items);
		//System.out.println("the total amount for the order"+totalamount);
		additem(5);
		placeorder();
		System.out.println("the total amount for the order"+totalamount);
	}

	public static void main(String[] args) {
		ShoppingCart s=new ShoppingCart(5,1000);
		s.display();
		

	}

}
