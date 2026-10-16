package com.languagefundamentals;

public class Task04 {
	String movieName;
	int bookId;
	boolean status;
	String seatno;
	int seats=100;
	String theaterName;
	public void booking() {
		status=true;
		System.out.println("The ticket is booked for the"+movieName+"with bookId "+bookId);
		System.out.println("the seats available for booking:"+(seats-1));
	}
	public void cancel() {
		if(status) {
			System.out.println("The cancelation of the ticket for the"+bookId);
		}
		else {
			System.out.println("With out booking the cancelation of the ticket is not done");
		}
	}
	public void change() {
		theaterName="abc";
		System.out.println("The theater name is "+theaterName);
	}
	public void display(){
		System.out.println("The movie name is "+movieName);
		System.out.println("The theater name is "+theaterName);
		booking();
		cancel();
		change();
		
	}
	

	public static void main(String[] args) {
		
		Task04 t=new Task04();
		Task04 t1=new Task04();
		t.movieName="abc";
		t.bookId=123;
		t.seatno="A1";
		t.theaterName="xyz";
		//t.cancel();
		t.display();
		t1.cancel();
	}

}
