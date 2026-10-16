package com.languagefundamentals;

public class RailwayBooking {
	String source;
	String destination;
	String name;
	int noTickets;
	static int ticketsBought;
	int amount;
	int totalamount;
	static int price=500;
	{
		System.out.println("Welcome to the Indian railways !!!");
	}
	public void bookticket() {
		System.out.println("The tickets are booked sucessfully for the passanger :");
		amount=noTickets*price;
		System.out.println("The total price of the tickets for a passenger is "+amount);
	}
	public void ticketCounter() {
		ticketsBought+=noTickets;
		System.out.println("The total tickets bought by the over all passengers "+ticketsBought);
		System.out.println("The total amount for the all tickets is "+(price*ticketsBought));
		System.out.println("********************************************");
	}
	void display() {
		System.out.println("The details of the passanger is : ");
		bookticket();
		ticketCounter();
	}
	
	

	public static void main(String[] args) {
		RailwayBooking s=new RailwayBooking();
		s.noTickets=10;
//		s.bookticket();
//		s.ticketCounter();
		s.display();
		RailwayBooking s1=new RailwayBooking();
		s1.noTickets=20;
//		s1.bookticket();
//		s1.ticketCounter();
		s1.display();
		
		

	}

}
